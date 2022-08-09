package com.ironhack.edgeservice.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.edgeservice.client.GamesClient;
import com.ironhack.edgeservice.enums.Season;
import com.ironhack.edgeservice.enums.Type;
import com.ironhack.edgeservice.model.Games;
import com.ironhack.edgeservice.repository.GamesRepository;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class EdgeControllerImplTest {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    ApplicationContext context;

    @MockBean
    private GamesClient mockGameClient;

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
        Mockito.when(mockGameClient.findAllGames()).thenReturn(List.of(game1,game2));

        MvcResult mvcResult = mockMvc.perform(get("/games"))
                .andReturn(); //Para cerrar la petición
        assertTrue(mvcResult.getResponse().getContentAsString().contains("name1"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("description2"));

        Mockito.verify(mockGameClient).findAllGames();
    }

    @Test
    void findGamesByName() throws Exception {
        Mockito.when(mockGameClient.findAllGames()).thenReturn(List.of(game1,game2));

        MvcResult mvcResult = mockMvc.perform(get("/games/names/{names}"))
                .andReturn(); //Para cerrar la petición
        assertTrue(mvcResult.getResponse().getContentAsString().contains("name1"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("name2"));

        Mockito.verify(mockGameClient).findAllGames();
    }

    @Test
    void findGamesBySeason() throws Exception {
        Mockito.when(mockGameClient.findAllGames()).thenReturn(List.of(game1,game2));

        MvcResult mvcResult = mockMvc.perform(get("/games/seasons/{seasons}"))
                .andReturn(); //Para cerrar la petición
        assertTrue(mvcResult.getResponse().getContentAsString().contains("FALL"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("WINTER"));

        Mockito.verify(mockGameClient).findAllGames();
    }

    @Test
    void findGamesByType() throws Exception {
        Mockito.when(mockGameClient.findAllGames()).thenReturn(List.of(game1,game2));

        MvcResult mvcResult = mockMvc.perform(get("/games/types/{types}"))
                .andReturn(); //Para cerrar la petición
        assertTrue(mvcResult.getResponse().getContentAsString().contains("COGNITIVE"));
        assertTrue(mvcResult.getResponse().getContentAsString().contains("ENTERTAINMENT"));

        Mockito.verify(mockGameClient).findAllGames();
    }

}
