package com.blogging.app.repositories;

import com.blogging.app.entites.Category;
import com.blogging.app.entites.Post;
import com.blogging.app.entites.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface PostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByUser(Users user);
    List<Post> findByCategory(Category category);
}
