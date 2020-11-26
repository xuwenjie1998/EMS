package com.sawyer.dao;

import com.sawyer.entity.Blog;

import java.util.List;

/**
 * 博客持久层接口
 */
public interface BlogDao {
    List<Blog> findAll();

    Blog findOne();

    void save(Blog blog);

    void delete(String id);

    void update(Blog blog);
}
