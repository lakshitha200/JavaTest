package com.practicle.test.NewsWeb.Repository;

import com.practicle.test.NewsWeb.Modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
