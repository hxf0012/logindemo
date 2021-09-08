package com.example.login.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页网址：http://localhost:8081/user/index
 */
@Controller
public class IndexController {

    // 测试网页 http://localhost:8081/user/hello
//    @RequestMapping("/hello")
//    @ResponseBody
//    public String sayHello() {
//        return "Hello Spring Boot.";
//    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public ModelAndView getIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/index");
        return mav;
    }

}
