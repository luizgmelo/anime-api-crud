package com.example.anime_api.controllers;

import com.example.anime_api.dtos.AnimeRecordDTO;
import com.example.anime_api.exceptions.AnimeNotFoundException;
import com.example.anime_api.models.AnimeModel;
import com.example.anime_api.services.AnimeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class AnimeController {
    @Autowired
    private AnimeService animeService;

    @GetMapping("/anime")
    public ResponseEntity getAllAnimes() {
        return ResponseEntity.status(HttpStatus.OK).body(animeService.findAll());
    }

    @GetMapping("/anime/{id}")
    public ResponseEntity getOneAnime(@PathVariable(value = "id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(animeService.findById(id));
    }

    @PostMapping("/anime")
    public ResponseEntity saveAnime(@RequestBody @Valid AnimeRecordDTO animeRecordDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(animeService.save(animeRecordDTO));
    }

    @PutMapping("/anime/{id}")
    public ResponseEntity updateAnime(@PathVariable(value="id") UUID id,
                                      @RequestBody @Valid AnimeRecordDTO animeRecordDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(animeService.update(id, animeRecordDTO));
    }

    @DeleteMapping("/anime/{id}")
    public ResponseEntity deleteAnime(@PathVariable(value="id") UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(animeService.deleteById(id));
    }
}
