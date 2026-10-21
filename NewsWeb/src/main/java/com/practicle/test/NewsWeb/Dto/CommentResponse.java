package com.practicle.test.NewsWeb.Dto;

import java.time.LocalDateTime;

public record CommentResponse(
        Long id,
        String authorName,
        String content,
        LocalDateTime createdAt) {
}
