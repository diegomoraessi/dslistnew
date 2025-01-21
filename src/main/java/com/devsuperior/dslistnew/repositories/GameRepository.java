package com.devsuperior.dslistnew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistnew.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
