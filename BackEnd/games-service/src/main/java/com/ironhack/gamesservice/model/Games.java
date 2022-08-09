package com.ironhack.gamesservice.model;

import com.ironhack.gamesservice.enums.Season;
import com.ironhack.gamesservice.enums.Type;

import javax.persistence.*;

@Entity
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private String name;

    private String description;
    @Enumerated(EnumType.STRING)
    private Season season;
    @Enumerated(EnumType.STRING)
    private Type type;

    public Games() {
    }

    public Games(String image, String name, String description, Season season, Type type) {
        this.image = image;
        this.name = name;
        this.description = description;
        this.season = season;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
