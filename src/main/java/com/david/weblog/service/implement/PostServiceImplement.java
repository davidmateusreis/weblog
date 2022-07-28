package com.david.weblog.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.weblog.model.Post;
import com.david.weblog.repository.PostRepository;
import com.david.weblog.service.PostService;

@Service
public class PostServiceImplement implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAll() {

        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {

        return postRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {

        return postRepository.save(post);
    }

}