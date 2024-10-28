package com.demo.paul.test.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping(path="/paul")
    public String home(Model model) {
        model.addAttribute("message", "Hello, Spring Boot!");
        return "Circleci CI/CD Test...................!!!!";
    }
}
