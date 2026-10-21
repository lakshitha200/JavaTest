package com.practicle.test.NewsWeb.Service;

import com.practicle.test.NewsWeb.Dto.NewsDetailResponse;
import com.practicle.test.NewsWeb.Dto.NewsHeadlineResponse;
import com.practicle.test.NewsWeb.Modal.Category;

import java.util.List;

public interface NewsService {

    List<Category> getCategories();

    List<NewsHeadlineResponse> getNewsByCategory(Long categoryId);

    NewsDetailResponse getNewsById(Long id);
}
