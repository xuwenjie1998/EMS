package com.sawyer.controller;

import com.sawyer.entity.User;
import com.sawyer.service.EmpService;
import com.sawyer.service.UserService;
import com.sawyer.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * @author sawyer
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 注册方法
     *
     * @param user
     * @param code
     * @param session
     * @return
     */
    @PostMapping("/register")
    public String register(User user, String code, HttpSession session) {
        String sessionCode = (String) session.getAttribute("code");
        if (sessionCode.equalsIgnoreCase(code)) {
            userService.register(user);
            return "redirect:/index";
        } else {
            return "redirect:/toRegister";
        }
    }

    /**
     * 生成验证码
     *
     * @param session
     * @param response
     * @throws IOException
     */
    @GetMapping("/code")
    public void getVerification(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        //存入session中
        session.setAttribute("code", securityCode);
        //响应图片
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
    }

    /**
     * Get请求跳转到登录页面
     * @return
     */
    @GetMapping("toLogin")
    public String toLogin(){
        return "redirect:/index";
    }

    /**
     * Post请求跳转到登录页面
     * @param username
     * @param password
     * @param session
     * @return
     */
    @PostMapping(value = "/login")
    public String login(String username, String password,HttpSession session) {
        User login = userService.login(username, password);
        User one = userService.findOne(username);
        if (login != null) {
            session.setAttribute("username",username);
            session.setAttribute("userone",one);
            return "redirect:/emp/findAll";
        } else {
            return "redirect:/index";
        }
    }


}
