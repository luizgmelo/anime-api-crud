package com.example.anime_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(AnimeNotFoundException.class)
    private ResponseEntity<String> animeNotFoundHandler(AnimeNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime not found!");
    }
}
