package com.raulproject.dslist.controllers;

import com.raulproject.dslist.dto.GameDTO;
import com.raulproject.dslist.dto.GameListDTO;
import com.raulproject.dslist.dto.GameMinDTO;
import com.raulproject.dslist.entities.GameList;
import com.raulproject.dslist.service.GameListService;
import com.raulproject.dslist.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
@RequiredArgsConstructor
public class GameListController {

    private final GameListService gameListService;


    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
