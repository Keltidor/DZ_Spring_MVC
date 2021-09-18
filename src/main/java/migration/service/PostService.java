package migration.service;

import migration.exception.NotFoundException;
import migration.post.Post;
import migration.repository.PostRepository;

import java.util.Map;
import java.util.Optional;

public class PostService {
    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Map<Long, Post> all() {
        return repository.all();
    }

    public Post getById(long id) {
        return repository.getById(id).orElseThrow(NotFoundException::new);
    }

    public Post save(Post post) {
        return repository.save(post);
    }


    public void removeById(long id) {
        repository.removeById(id);
    }
}

