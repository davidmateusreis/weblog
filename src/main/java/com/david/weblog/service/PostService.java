package com.david.weblog.service;

import java.util.List;

import com.david.weblog.model.Post;

public interface PostService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}