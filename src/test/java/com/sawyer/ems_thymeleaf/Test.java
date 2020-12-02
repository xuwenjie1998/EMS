package com.sawyer.ems_thymeleaf;

import com.sawyer.dao.BlogDao;
import com.sawyer.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAdder;

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
//        Blog blog = new Blog();
//        blog.setTitle("sdhfud忘掉积分");
//        blog.setUserId("90da7c50-31a7-4191-b7bc-be2341034043");
////        blogDao.save(blog);
//
//        Date date = new Date(2020,10,5);
//        System.out.println(date.getDay());

        Date date1 = new Date();
        System.out.println(date1.toString());
        long time = date1.getTime();
        System.out.println("time :"+time);
        System.out.println(System.currentTimeMillis());
        java.sql.Date date = new java.sql.Date(time);
        System.out.println(date);

        java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println("111"+currentDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date1);
        System.out.println(format);
    }

    @org.junit.jupiter.api.Test
    public void test3(){
        LongAdder count = new LongAdder();
        count.add(1);
        count.add(1);
        count.add(1);
        long l = count.longValue();
        System.out.println(l);
//        int a = 1/0;
//        System.out.println(a);
        int b = 0/1;
        System.out.println(b);
    }

    @org.junit.jupiter.api.Test
    public void test4(){
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        System.out.println(i);
    }


    public enum SeasonEnum {
        SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);
    private int seq;
    SeasonEnum(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;

            }
    }

    public static void main(String[] args) {
//        SeasonEnum
//        if (空格a == b 空格) 反例


//        if (flag == 0) {
//            System.out.println(say);
//        }
        Math.abs(1);
        
    }

}
