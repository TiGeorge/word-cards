package com.example.wordcards.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/", "/index"})
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("training/wordsCards")
    public String startTraining() {
        return "training/wordsCards";
    }

}
