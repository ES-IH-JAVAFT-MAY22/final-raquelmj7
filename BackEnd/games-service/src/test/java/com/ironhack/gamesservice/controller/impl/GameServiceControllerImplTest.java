package com.ironhack.gamesservice.controller.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.gamesservice.enums.Season;
import com.ironhack.gamesservice.enums.Type;
import com.ironhack.gamesservice.model.Games;
import com.ironhack.gamesservice.repository.GamesRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


public class GameServiceControllerImplTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private GamesRepository gamesRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    Games game1, game2;

    @BeforeEach
    void setUp() {
        game1 = new Games("image1", "name1", "description1", Season.FALL, Type.COGNITIVE);
        game2 = new Games("image2", "name2", "description2", Season.WINTER, Type.ENTERTAINMENT);
        gamesRepository.saveAll(List.of(game1,game2));
    }

    @AfterEach
    void tearDown() {
        gamesRepository.deleteAll();
    }


    @Test
    void findAllGames() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/games"))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("image1"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("description2"));
    }

    @Test
    void findGamesByName() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/games/names/{names}"))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("name1"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("name2"));
    }

    @Test
    void findGamesBySeason() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/games/seasons/{seasons}"))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("FALL"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("WINTER"));
    }

    @Test
    void findGamesByType() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/games/types/{types}"))
                .andReturn();
        assertTrue(mvcResult.getResponse().getContentAsString().contains("COGNITIVE"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("ENTERTAINMENT"));
    }
}
