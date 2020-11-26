package com.sawyer.controller;

import com.sawyer.entity.Blog;
import com.sawyer.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/blog")
public class BlogDetailsController {

    @Autowired
    BlogService blogService;

    @GetMapping(value = "/indexPage")
    public String toIndexPage(Model model){
        //Blog列表数据 添加到Model用以前端遍历展示
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("BlogList",blogs);
        return "pages/blog";
    }

    @RequestMapping(value = "/blogDetails")
    public String toBlogDetail(@RequestParam("bid") Integer bid, Model model) {
        Blog one = blogService.findOne(bid);
        model.addAttribute("BlogOne",one);
        System.out.println(one.toString());
        return "pages/blog-details";
    }

}
