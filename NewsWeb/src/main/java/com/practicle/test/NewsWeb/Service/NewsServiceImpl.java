package com.practicle.test.NewsWeb.Service;


import com.practicle.test.NewsWeb.Dto.CommentResponse;
import com.practicle.test.NewsWeb.Dto.NewsDetailResponse;
import com.practicle.test.NewsWeb.Dto.NewsHeadlineResponse;
import com.practicle.test.NewsWeb.Modal.Category;
import com.practicle.test.NewsWeb.Modal.News;
import com.practicle.test.NewsWeb.Repository.CategoryRepository;
import com.practicle.test.NewsWeb.Repository.CommentRepository;
import com.practicle.test.NewsWeb.Repository.NewsRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;
    private final CategoryRepository categoryRepository;
    private final CommentRepository commentRepository;

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<NewsHeadlineResponse> getNewsByCategory(Long categoryId) {

        if (!categoryRepository.existsById(categoryId)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found");
        }

        return newsRepository
                .findNewsByCategoriesId(categoryId)
                .stream()
                .map(news -> new NewsHeadlineResponse(
                        news.getId(),
                        news.getTitle(),
                        news.getPublishedAt()))
                .toList();
    }

    @Override
    public NewsDetailResponse getNewsById(Long id) {

        News news = newsRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "News not found"));

        List<String> categories = news.getCategories()
                .stream()
                .map(Category::getName)
                .toList();

        List<CommentResponse> comments = commentRepository
                .findByNewsId(id)
                .stream()
                .map(comment -> new CommentResponse(
                        comment.getId(),
                        comment.getAuthorName(),
                        comment.getContent(),
                        comment.getCreatedAt()))
                .toList();

        return new NewsDetailResponse(
                news.getId(),
                news.getTitle(),
                news.getContent(),
                news.getPublishedAt(),
                categories,
                comments);
    }
}
