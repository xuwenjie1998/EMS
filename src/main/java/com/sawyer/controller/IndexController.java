package com.sawyer.controller;

import com.sawyer.entity.Blog;
import com.sawyer.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.management.ValueExp;
import java.util.List;

/**
 * @author huanm
 * <p>
 * thymeleaf所有操作都需要通过controller实现跳转
 */
@Controller
public class IndexController {

    @Autowired
    BlogService blogService;

    @GetMapping(value = "/index")
    public String toIndex() {
        return "ems/login";
    }

    @GetMapping(value = "/toRegister")
    public String toRegister() {
        return "ems/regist";
    }

    @GetMapping(value = "toSave")
    public String toSave() {
        return "ems/addEmp";
    }

    @GetMapping(value = "indexPage")
    public String toIndexPage(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("BlogList",blogs);
        return "pages/blog";
    }

    @GetMapping(value = "blogDetails")
    public String toBlogDetail(Model model){
        return "pages/blog-details";
    }
}
