package com.practicle.test.NewsWeb.Service;

import com.practicle.test.NewsWeb.Dto.CommentRequest;
import com.practicle.test.NewsWeb.Dto.CommentResponse;

public interface CommentService {

    CommentResponse addComment(Long newsId, CommentRequest request);
}
