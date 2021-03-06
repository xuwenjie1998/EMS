package com.sawyer.service;

import com.sawyer.dao.BlogDao;
import com.sawyer.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 博客业务层,增删改查
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> findAll() {
        return blogDao.findAll();
    }

    @Override
    public Blog findOne(Integer id) {
        return blogDao.findOne(id);
    }

    @Override
    public void save(Blog blog) {
        blogDao.save(blog);
    }

    @Override
    public void delete(Integer id) {
        blogDao.delete(id);
    }

    @Override
    public void update(Blog blog) {
        blogDao.update(blog);
    }
}
