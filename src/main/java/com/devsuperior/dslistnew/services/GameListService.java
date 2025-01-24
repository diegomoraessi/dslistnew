package com.devsuperior.dslistnew.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslistnew.dto.GameListDTO;

import com.devsuperior.dslistnew.entities.GameList;
import com.devsuperior.dslistnew.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> list = repository.findAll();
        return list.stream().map(x -> new GameListDTO(x)).toList();
    }

}
