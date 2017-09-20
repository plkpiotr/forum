package com.plkpiotr.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("profile")
    public String displayMyProfile(Model model) {
        return "profile";
    }

    @GetMapping("profile/")
    public String displayProfile(Model model) {
        return "profile";
    }
}