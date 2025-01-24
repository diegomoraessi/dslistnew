package com.devsuperior.dslistnew.controllers;
import com.devsuperior.dslistnew.dto.GameDTO;
import com.devsuperior.dslistnew.dto.GameListDTO;
import com.devsuperior.dslistnew.dto.GameMinDTO;
import com.devsuperior.dslistnew.services.GameListService;
import com.devsuperior.dslistnew.services.GameService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameListDTO> findAll() {
        return service.findAll();
    }

}
