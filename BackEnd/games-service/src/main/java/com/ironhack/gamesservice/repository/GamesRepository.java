package com.ironhack.gamesservice.repository;

import com.ironhack.gamesservice.enums.Season;
import com.ironhack.gamesservice.enums.Type;
import com.ironhack.gamesservice.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {
    List<Games> findGamesByName(String name);
    List<Games> findGamesBySeason(Season season);
    List<Games> findGamesByType(Type type);

    //para el rango de edad
}
