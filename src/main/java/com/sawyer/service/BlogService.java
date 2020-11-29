package com.sawyer.service;

import com.sawyer.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findOne(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    void update(Blog blog);

}
