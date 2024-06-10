package com.example.anime_api.repositories;

import com.example.anime_api.models.AnimeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AnimeRepository extends JpaRepository<AnimeModel, UUID> {}
