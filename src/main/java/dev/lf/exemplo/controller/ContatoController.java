package dev.lf.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lf.exemplo.model.Contato;
import dev.lf.exemplo.repository.ContatoRepository;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping("/{id}")
	public Optional<Contato> getContato(@PathVariable("id") Integer id) {
		return contatoRepository.findById(id);
	}
	
	@GetMapping
	public List<Contato> listar() {
		return contatoRepository.findAll();
	}
	
	@PostMapping
	public void salvar(@RequestBody Contato contato) {
		contatoRepository.save(contato);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		contatoRepository.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody Contato contato) {
		contatoRepository.save(contato);
	}

}
