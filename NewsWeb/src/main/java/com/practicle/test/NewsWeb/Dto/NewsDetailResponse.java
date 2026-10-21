package com.practicle.test.NewsWeb.Dto;

import java.time.LocalDateTime;
import java.util.List;

public record NewsDetailResponse(
        Long id,
        String title,
        String content,
        LocalDateTime publishedAt,
        List<String> categories,
        List<CommentResponse> comments) {
}
