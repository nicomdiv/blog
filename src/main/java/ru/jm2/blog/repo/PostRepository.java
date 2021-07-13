package ru.jm2.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.jm2.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
