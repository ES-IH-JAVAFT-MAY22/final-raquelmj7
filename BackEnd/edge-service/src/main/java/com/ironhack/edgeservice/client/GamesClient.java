package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.enums.Season;
import com.ironhack.edgeservice.enums.Type;
import com.ironhack.edgeservice.model.Games;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("games-service")
public interface GamesClient {

    @GetMapping("/games")
    List<Games> findAllGames();

    @GetMapping("/games/name/{name}")
    public List<Games> findGamesByName(@PathVariable String name);

    @GetMapping("/games/seasons/{seasons}")
    public List<Games> findGamesBySeason(@PathVariable Season season);

    @GetMapping("/games/types/{types}")
    public List<Games> findGamesByType(@PathVariable Type type);
}
