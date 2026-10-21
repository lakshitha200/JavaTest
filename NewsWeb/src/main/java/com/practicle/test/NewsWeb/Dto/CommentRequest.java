package com.practicle.test.NewsWeb.Dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CommentRequest(

        @NotBlank(message = "Name is required")
        String authorName,

        @NotBlank(message = "Comment is required")
        @Size(max = 1000, message = "Comment must be at 1000 characters")
        String content) {
}