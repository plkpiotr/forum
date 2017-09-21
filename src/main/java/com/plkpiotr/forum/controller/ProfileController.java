package com.plkpiotr.forum.controller;

import com.plkpiotr.forum.entity.User;
import com.plkpiotr.forum.repository.AnswerRepository;
import com.plkpiotr.forum.repository.TopicRepository;
import com.plkpiotr.forum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {

    private final UserRepository userRepository;
    private final TopicRepository topicRepository;
    private final AnswerRepository answerRepository;

    @Autowired
    public ProfileController(UserRepository userRepository, TopicRepository topicRepository, AnswerRepository answerRepository) {
        this.userRepository = userRepository;
        this.topicRepository = topicRepository;
        this.answerRepository = answerRepository;
    }

    @GetMapping("profile")
    public String displayMyProfile(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username = ((UserDetails)principal).getUsername();

        User user = userRepository.getUserByUsername(username);

        Long numberOfTopics = topicRepository.countTopicsByUser_Id(user.getId());
        Long numberOfAnswers = answerRepository.countAnswersByUser_Id(user.getId());
        Long numberOfHelped = answerRepository.countAnswersByUser_IdAndUseful(user.getId(), true);

        model.addAttribute("user", user);
        model.addAttribute("numberOfTopics", numberOfTopics);
        model.addAttribute("numberOfAnswers", numberOfAnswers);
        model.addAttribute("numberOfHelped", numberOfHelped);
        return "profile";
    }

    @GetMapping("profile/{id}")
    public String displayProfileById(@PathVariable Long id, Model model) {
        User user = userRepository.getUserById(id);

        Long numberOfTopics = topicRepository.countTopicsByUser_Id(id);
        Long numberOfAnswers = answerRepository.countAnswersByUser_Id(id);
        Long numberOfHelped = answerRepository.countAnswersByUser_IdAndUseful(id, true);

        model.addAttribute("user", user);
        model.addAttribute("numberOfTopics", numberOfTopics);
        model.addAttribute("numberOfAnswers", numberOfAnswers);
        model.addAttribute("numberOfHelped", numberOfHelped);

        return "profile";
    }
}