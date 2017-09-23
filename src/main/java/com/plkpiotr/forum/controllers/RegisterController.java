package com.plkpiotr.forum.controllers;

import com.plkpiotr.forum.entities.User;
import com.plkpiotr.forum.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Objects;

@Controller
public class RegisterController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegisterController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @GetMapping("register")
    public String displayRegister(Model model) {
        return "register";
    }

    @PostMapping("register")
    public String registerUser(@RequestParam("username") String username, @RequestParam("password") String password,
                               @RequestParam("introduction") String introduction, Model model) {
        User user = new User();
        // I did it on purpose to find out about Optionals:
        if (Objects.equals(introduction, ""))
            user.setIntroduction(null);
        else
            user.setIntroduction(introduction);
        user.setUsername(username);
        user.setPassword(password);
        user.setPassword(passwordEncoder.encode(password));
        user.setCreatedDate(LocalDateTime.now());
        userRepository.save(user);
        model.addAttribute("message", "User was added.");
        return "register";
    }
}