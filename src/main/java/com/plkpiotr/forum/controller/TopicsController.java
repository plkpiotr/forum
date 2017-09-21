package com.plkpiotr.forum.controller;

import com.plkpiotr.forum.entity.Topic;
import com.plkpiotr.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class TopicsController {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicsController(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @GetMapping("topics")
    public String displayAllTopics(Model model) {
        List<Topic> topics = topicRepository.findAll();
        model.addAttribute("topics", topics);
        return "topics";
    }

    @GetMapping("topics/{category}")
    public String displayTopicsByCategory(@PathVariable String category, Model model) {
        List<Topic> topics = topicRepository.findTopicByCategory(category);
        model.addAttribute("topics", topics);
        return "topics";
    }
}