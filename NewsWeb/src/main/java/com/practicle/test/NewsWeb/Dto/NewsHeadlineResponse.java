package com.practicle.test.NewsWeb.Dto;

import java.time.LocalDateTime;

public record NewsHeadlineResponse(
        Long id,
        String title,
        LocalDateTime publishedAt) {
}
