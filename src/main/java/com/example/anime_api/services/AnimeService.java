package com.example.anime_api.services;

import com.example.anime_api.dtos.AnimeRecordDTO;
import com.example.anime_api.models.AnimeModel;
import com.example.anime_api.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<AnimeModel> findAll() {
        return animeRepository.findAll();
    }

    public Optional<AnimeModel> findById(UUID id) {
        return animeRepository.findById(id);
    }

    public AnimeModel save(AnimeRecordDTO animeRecordDTO) {
        var newAnime = new AnimeModel();
        newAnime.setTitle(animeRecordDTO.title());
        newAnime.setDescription(animeRecordDTO.description());
        return animeRepository.save(newAnime);
    }

    public AnimeModel update(AnimeModel anime, AnimeRecordDTO animeUpdate) {
        anime.setTitle(animeUpdate.title());
        anime.setDescription(animeUpdate.description());
        return animeRepository.save(anime);
    }

    public void deleteById(UUID id) {
        animeRepository.deleteById(id);
    }
}
