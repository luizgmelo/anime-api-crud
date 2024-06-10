package com.example.anime_api.controllers;

import com.example.anime_api.dtos.AnimeRecordDTO;
import com.example.anime_api.models.AnimeModel;
import com.example.anime_api.repositories.AnimeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnimeController {
    @Autowired
    AnimeRepository animeRepository;

    @PostMapping("/anime")
    public ResponseEntity saveAnime(@RequestBody @Valid AnimeRecordDTO animeRecordDTO) {
        var newAnime = new AnimeModel();
        newAnime.setTitle(animeRecordDTO.title());
        newAnime.setDescription(animeRecordDTO.description());
        animeRepository.save(newAnime);
        return ResponseEntity.ok("Anime save sucessfully");
    }

}
