package com.paul.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = {"/paul"})
    public String home() {
        return "Hello Paul";
    }
}