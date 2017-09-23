package com.plkpiotr.forum.controllers;

import com.plkpiotr.forum.entities.User;
import com.plkpiotr.forum.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    private final UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("register")
    public String displayRegister(Model model) {
        return "register";
    }

    @PostMapping("register")
    public String registerUser(@RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("introduction") String introduction) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setIntroduction(introduction);
        userRepository.save(user);
        return "register";
    }
}