package com.github.keler147.workshopmongo.services;
import com.github.keler147.workshopmongo.domain.Post;
import com.github.keler147.workshopmongo.repository.PostRepository;
import com.github.keler147.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        if (post.isEmpty()) {
            throw new ObjectNotFoundException("Post not found!");
        }
        return post.get();
    }
}
