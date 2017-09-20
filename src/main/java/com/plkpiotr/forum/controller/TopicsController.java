package com.plkpiotr.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopicsController {

    @GetMapping("topics")
    public String displayTopics(Model model) {
        return "topics";
    }
}