package com.sawyer.controller;

import com.sawyer.entity.Blog;
import com.sawyer.entity.Emp;
import com.sawyer.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/blogEdit")
public class BlogEditController {

    @Autowired
    BlogService blogService;

    /**
     * 跳转到blogEdit.html
     * @return
     */
    @GetMapping(value = "/findBlog")
    public String findBlog(@RequestParam("bid") Integer bid, Model model) {
        Blog one = blogService.findOne(bid);
        model.addAttribute("one",one);
        return "pages/blogEdit";
    }

    /**
     * 更新Blog
     * @param blog
     * @return
     */
    @PostMapping(value = "/update")
    public String update(Blog blog) {
        System.out.println(blog);
        blogService.update(blog);
//        return "redirect:/blogEdit/findBlog";
        return "redirect:/blog/indexPage";
    }

    @PostMapping("/save")
    public String modify(Blog blog){
        blogService.save(blog);
        return "redirect:/blog/blogDetails";
    }
}
