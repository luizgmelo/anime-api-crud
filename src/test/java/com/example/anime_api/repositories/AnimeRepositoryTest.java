package com.example.anime_api.repositories;

import com.example.anime_api.dtos.AnimeRecordDTO;
import com.example.anime_api.models.AnimeModel;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import java.util.UUID;

@DataJpaTest
@ActiveProfiles("test")
class AnimeRepositoryTest {
    // This test is only made to understand you tests work with spring
    // don't consider test repository method because the team spring made it before

    @Autowired
    EntityManager entityManager;

    @Autowired
    AnimeRepository animeRepository;

    @Test
    @DisplayName("Should return a Anime")
    void findByIdSucess() {
        AnimeRecordDTO data = new AnimeRecordDTO( "Attack on Titan", "Em um mundo devastado por titãs, criaturas gigantes que devoram humanos, a humanidade se esconde atrás de muralhas gigantescas.");
        Optional<AnimeModel> animeO = animeRepository.findById(this.createAnime(data).getIdAnime());
        assertThat(animeO.isPresent()).isTrue();
    }

    @Test
    @DisplayName("Should not return a Anime")
    void findByIdFail() {
        UUID uuid = UUID.randomUUID();
        Optional<AnimeModel> animeO = animeRepository.findById(uuid);
        assertThat(animeO.isPresent()).isFalse();
    }

    private AnimeModel createAnime(AnimeRecordDTO animeRecordDTO) {
        AnimeModel newAnime = new AnimeModel();
        newAnime.setTitle(animeRecordDTO.title());
        newAnime.setDescription(animeRecordDTO.description());
        this.entityManager.persist(newAnime);
        return newAnime;
    }

}