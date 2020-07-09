package dev.lf.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.lf.exemplo.model.Player;
import dev.lf.exemplo.repository.PlayerRepository;

@RestController
@CrossOrigin
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping("/{id}")
	public Optional<Player> getPlayer(@PathVariable("id") Integer id) {
		return playerRepository.findById(id);
	}
	
	@GetMapping
	public List<Player> listar() {
		return playerRepository.findAll();
	}
	
	@PostMapping
	public void salvar(@RequestBody Player player) {
		playerRepository.save(player);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		playerRepository.deleteById(id);
	}
	
	@PutMapping
	public void put(@RequestBody Player player) {
		playerRepository.save(player);
	}

}
