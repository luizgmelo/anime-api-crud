package com.example.anime_api.dtos;

import jakarta.validation.constraints.NotBlank;

public record AnimeRecordDTO(@NotBlank String title, @NotBlank String description) {}
