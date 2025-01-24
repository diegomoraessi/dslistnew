package com.devsuperior.dslistnew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistnew.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> { 

}
