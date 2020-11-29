package com.sawyer.dao;

import com.sawyer.entity.Blog;

import java.util.List;

/**
 * 博客持久层接口
 */
public interface BlogDao {
    List<Blog> findAll();

    Blog findOne(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    void update(Blog blog);
}
