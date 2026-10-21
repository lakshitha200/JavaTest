package com.practicle.test.NewsWeb.Controller;

import com.practicle.test.NewsWeb.Dto.CommentRequest;
import com.practicle.test.NewsWeb.Dto.CommentResponse;
import com.practicle.test.NewsWeb.Service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/news")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/{id}/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public CommentResponse addComment(
            @PathVariable Long id,
            @Valid @RequestBody CommentRequest request) {

        return commentService.addComment(id, request);
    }
}
