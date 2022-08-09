package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.client.GamesClient;
import com.ironhack.edgeservice.controller.interfaces.EdgeController;
import com.ironhack.edgeservice.enums.Season;
import com.ironhack.edgeservice.enums.Type;
import com.ironhack.edgeservice.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@CrossOrigin("*")
public class EdgeControllerImpl implements EdgeController {

    @Autowired
    private GamesClient gamesClient;

    @GetMapping("/games")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findAll(){
        return gamesClient.findAllGames();
    }


    @GetMapping ("/games/names/{names}")
    @ResponseStatus(HttpStatus.OK)
    public List <Games> findGamesByName(@PathVariable String name){
        return gamesClient.findGamesByName(name);
    }

    @GetMapping("/games/seasons/{seasons}")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findGamesBySeason(@PathVariable Season season){
        return gamesClient.findGamesBySeason(season);
    }

    @GetMapping("/games/types/{types}")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findGamesByType(@PathVariable Type type){
        return gamesClient.findGamesByType(type);
    }
}
