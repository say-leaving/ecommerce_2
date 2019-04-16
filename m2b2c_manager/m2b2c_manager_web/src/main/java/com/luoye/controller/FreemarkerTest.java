package com.luoye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerTest {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("name","test");
        return "hello";
    }
    @RequestMapping("/hi")
    public String sayHi(Model model){
        model.addAttribute("name","test2");
        return "hi";
    }
}
