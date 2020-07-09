package dev.lf.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.lf.exemplo.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
