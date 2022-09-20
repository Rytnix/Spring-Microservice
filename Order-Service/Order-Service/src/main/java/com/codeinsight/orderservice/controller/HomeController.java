package com.codeinsight.orderservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api")
public class HomeController {


    @GetMapping("/home")
    public String showHomepage(){
        return "index";
    }
}
