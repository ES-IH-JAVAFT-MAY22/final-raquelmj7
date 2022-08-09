package com.ironhack.gamesservice.controller.impl;

import com.ironhack.gamesservice.controller.interfaces.GameServiceController;
import com.ironhack.gamesservice.enums.Season;
import com.ironhack.gamesservice.enums.Type;
import com.ironhack.gamesservice.model.Games;
import com.ironhack.gamesservice.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
public class GameServiceControllerImpl implements GameServiceController {

    @Autowired
    private GamesRepository gamesRepository;

    @GetMapping("/games")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findAll(){
        return  gamesRepository.findAll();
    }

    @GetMapping ("/games/names/{names}")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findGamesByName(@PathVariable String name){
        List<Games> namesGamesList = gamesRepository.findGamesByName(name);
        return namesGamesList;
    }

    @GetMapping("/games/seasons/{seasons}")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findGamesBySeason(@PathVariable Season season){
        List<Games> seasonGamesList = gamesRepository.findGamesBySeason(season);
        return seasonGamesList;
    }

    @GetMapping("/games/types/{types}")
    @ResponseStatus(HttpStatus.OK)
    public List<Games> findGamesByType(@PathVariable Type type){
        List<Games> typeGamesList = gamesRepository.findGamesByType(type);
        return typeGamesList;
    }


    //falta por edad y precio
}
