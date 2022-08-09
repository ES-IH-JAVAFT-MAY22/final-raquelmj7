package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.enums.Season;
import com.ironhack.edgeservice.enums.Type;
import com.ironhack.edgeservice.model.Games;

import java.util.List;

public interface EdgeController {
    List<Games> findAll();
    List<Games> findGamesByName(String name);
    List<Games> findGamesBySeason(Season season);
    List<Games> findGamesByType(Type type);
}
