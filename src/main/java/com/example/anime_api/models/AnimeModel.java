package com.example.anime_api.models;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Table (name = "animes")
public class AnimeModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAnime;

    private String title;
    private String description;

    public UUID getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(UUID idAnime) {
        this.idAnime = idAnime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
