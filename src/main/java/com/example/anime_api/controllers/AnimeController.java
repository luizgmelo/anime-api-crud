package com.example.anime_api.controllers;

import com.example.anime_api.dtos.AnimeRecordDTO;
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

    @PostMapping("/anime")
    public ResponseEntity saveAnime(@RequestBody @Valid AnimeRecordDTO animeRecordDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(animeService.save(animeRecordDTO));
    }

    @PutMapping("/anime/{id}")
    public ResponseEntity updateAnime(@PathVariable(value="id") UUID id,
                                      @RequestBody @Valid AnimeRecordDTO animeRecordDTO) {
        Optional<AnimeModel> animeO = animeService.findById(id);
        if (animeO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(animeService.update(animeO.get(), animeRecordDTO));
    }

    @DeleteMapping("/anime/{id}")
    public ResponseEntity deleteAnime(@PathVariable(value="id") UUID id) {
        Optional<AnimeModel> animeO = animeService.findById(id);
        if (animeO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime not found");
        }
        animeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Anime deleted successfully");
    }
}
