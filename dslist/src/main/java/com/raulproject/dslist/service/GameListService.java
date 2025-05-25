package com.raulproject.dslist.service;

import com.raulproject.dslist.dto.GameDTO;
import com.raulproject.dslist.dto.GameListDTO;
import com.raulproject.dslist.dto.GameMinDTO;
import com.raulproject.dslist.entities.Game;
import com.raulproject.dslist.entities.GameList;
import com.raulproject.dslist.repositories.GameListRepository;
import com.raulproject.dslist.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }



}
