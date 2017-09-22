package com.plkpiotr.forum.controllers;

import com.plkpiotr.forum.entities.Answer;
import com.plkpiotr.forum.entities.Topic;
import com.plkpiotr.forum.repositories.AnswerRepository;
import com.plkpiotr.forum.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TopicController {

    private final TopicRepository topicRepository;
    private final AnswerRepository answerRepository;

    @Autowired
    public TopicController(TopicRepository topicRepository, AnswerRepository answerRepository) {
        this.topicRepository = topicRepository;
        this.answerRepository = answerRepository;
    }

    @GetMapping("topic/{id}")
    public String displayTopic(@PathVariable String id,  Model model) {
        Topic topic = topicRepository.findTopicById(Long.valueOf(id));
        List<Answer> answers = answerRepository.findAnswerByTopic_Id(Long.valueOf(id));
        model.addAttribute("topic");
        model.addAttribute("answers");
        return "topic";
    }
}