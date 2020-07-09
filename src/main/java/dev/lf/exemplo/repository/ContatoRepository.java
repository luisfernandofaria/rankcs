package dev.lf.exemplo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.lf.exemplo.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
