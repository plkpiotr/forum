package com.plkpiotr.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController {

    @RequestMapping("/topic")
    public String displayTopic(Model model) {
        return "topic";
    }
}