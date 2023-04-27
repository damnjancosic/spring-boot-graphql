package com.example.srpingbootgraphql.fitness.domain;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;

@Builder
public record FitnessClass(
        UUID id,
        Coach coach,
        LocalDateTime startsAt,
        LocalDateTime endsAt,
        Difficulty difficulty
) {

}