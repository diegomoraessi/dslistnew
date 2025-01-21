package com.devsuperior.dslistnew.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devsuperior.dslistnew.dto.GameMinDTO;
import com.devsuperior.dslistnew.entities.Game;
import com.devsuperior.dslistnew.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> list = repository.findAll();
        return list.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
