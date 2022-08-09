package com.ironhack.gamesservice.services.impl;

import com.ironhack.gamesservice.enums.Season;
import com.ironhack.gamesservice.enums.Type;
import com.ironhack.gamesservice.model.Games;
import com.ironhack.gamesservice.repository.GamesRepository;
import com.ironhack.gamesservice.services.interfaces.GameServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameServiceServiceImpl implements GameServiceService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<Games> findGamesByName(String name) {
        List<Games> gamesList = gamesRepository.findGamesByName(name);
        return gamesList;
    }


    public List<Games> findGamesBySeason(Season season) {
        List<Games> gamesList = gamesRepository.findAll();
        List<Games> gamesSeasonList = new ArrayList<>();
        for (Games games: gamesList){
            if(season.equals(games.getSeason())) {
                gamesSeasonList.add(games);
            }
        }
        return gamesSeasonList;
    }

    public List<Games> findGamesByType(Type type) {
        List<Games> gamesList = gamesRepository.findAll();
        List<Games> gamesTypeList = new ArrayList<>();
        for (Games games: gamesList){
            if(type.equals(games.getSeason())){
                gamesTypeList.add(games);
            }
        }
        return gamesTypeList;
    }
}
