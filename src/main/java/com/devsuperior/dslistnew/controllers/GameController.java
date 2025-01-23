package com.devsuperior.dslistnew.controllers;
import com.devsuperior.dslistnew.dto.GameMinDTO;
import com.devsuperior.dslistnew.entities.Game;
import com.devsuperior.dslistnew.services.GameService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameMinDTO findById(Long id) {
        return service.findById(id);
    }

}
