package com.raulproject.dslist.repositories;

import com.raulproject.dslist.entities.Game;
import com.raulproject.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
