package com.practicle.test.NewsWeb.Repository;

import com.practicle.test.NewsWeb.Modal.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> findNewsByCategoriesId(Long categoryId);
}
