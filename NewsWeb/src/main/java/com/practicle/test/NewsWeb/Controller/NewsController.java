package com.practicle.test.NewsWeb.Controller;

import com.practicle.test.NewsWeb.Dto.NewsDetailResponse;
import com.practicle.test.NewsWeb.Dto.NewsHeadlineResponse;
import com.practicle.test.NewsWeb.Modal.Category;
import com.practicle.test.NewsWeb.Service.NewsService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/categories")
    public List<Category> getCategories() {
        return newsService.getCategories();
    }

    @GetMapping("/news")
    public List<NewsHeadlineResponse> getNews(@RequestParam Long categoryId) {
        return newsService.getNewsByCategory(categoryId);
    }

    @GetMapping("/news/{id}")
    public NewsDetailResponse getNewsById(@PathVariable Long id) {
        return newsService.getNewsById(id);
    }
}
