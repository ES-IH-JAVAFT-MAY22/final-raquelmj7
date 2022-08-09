package com.ironhack.edgeservice.repository;

import com.ironhack.edgeservice.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {
}
