package com.practicle.test.NewsWeb.Service;

import com.practicle.test.NewsWeb.Dto.CommentRequest;
import com.practicle.test.NewsWeb.Dto.CommentResponse;
import com.practicle.test.NewsWeb.Modal.Comment;
import com.practicle.test.NewsWeb.Modal.News;
import com.practicle.test.NewsWeb.Repository.CommentRepository;
import com.practicle.test.NewsWeb.Repository.NewsRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final NewsRepository newsRepository;
    private final CommentRepository commentRepository;

    @Override
    @Transactional
    public CommentResponse addComment(Long newsId, CommentRequest request) {

        News news = newsRepository.findById(newsId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "News not found"));

        Comment comment = new Comment();
        comment.setAuthorName(request.authorName().trim());
        comment.setContent(request.content().trim());
        comment.setNews(news);

        Comment saved = commentRepository.save(comment);

        return new CommentResponse(
                saved.getId(),
                saved.getAuthorName(),
                saved.getContent(),
                saved.getCreatedAt());
    }
}
