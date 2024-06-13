package com.example.anime_api.exceptions;

public class AnimeNotFoundException extends RuntimeException {
    public AnimeNotFoundException() {
        super("Anime not found!");
    }

    public AnimeNotFoundException(String message) {
        super(message);
    }
}
