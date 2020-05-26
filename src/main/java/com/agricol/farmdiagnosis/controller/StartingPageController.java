package com.agricol.farmdiagnosis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartingPageController {
    @RequestMapping("/")
    public String homePage() {
        return "home";
    }
}
