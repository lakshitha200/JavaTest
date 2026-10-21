package com.practicle.test.NewsWeb.Repository;

import com.practicle.test.NewsWeb.Modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long newsId);
}
