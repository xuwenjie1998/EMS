package com.sawyer.ems_thymeleaf;

import com.sawyer.dao.BlogDao;
import com.sawyer.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class Test {

    @Autowired
    BlogDao blogDao;

    @org.junit.jupiter.api.Test
    public void test1(){
//        List<Blog> blogList = blogDao.findAll();
//        for (Blog blog:blogList){
//            System.out.println(blog);
//        }
        Blog blog = new Blog();
        blog.setTitle("sdhfud忘掉积分");
        blog.setUserId("90da7c50-31a7-4191-b7bc-be2341034043");
//        blogDao.save(blog);

        Date date = new Date(2020,10,5);
        System.out.println(date.getDay());
    }

}
