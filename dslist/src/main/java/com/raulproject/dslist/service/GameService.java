package com.raulproject.dslist.service;

import com.raulproject.dslist.dto.GameMinDTO;
import com.raulproject.dslist.entities.Game;
import com.raulproject.dslist.repositories.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
