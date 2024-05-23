package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
