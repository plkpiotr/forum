package com.plkpiotr.forum.controller;

import com.plkpiotr.forum.entity.Answer;
import com.plkpiotr.forum.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AnswersController {

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswersController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    // TODO: add admin panel for all answers!

    @GetMapping("answers/{id}")
    public String displayAnswersByUser(@PathVariable String id, Model model) {
        List<Answer> answers = answerRepository.findAnswerByUser_IdOrderByLastModifiedDateDesc(Long.parseLong(id));
        model.addAttribute("answers", answers);
        return "answers";
    }

    @GetMapping("answers/useful/{id}")
    public String displayUsefulAnswersByUser(@PathVariable String id, Model model) {
        List<Answer> answers = answerRepository.findAnswerByUser_IdAndUsefulOrderByLastModifiedDateDesc(Long.parseLong(id), true);
        model.addAttribute("answers", answers);
        return "answers";
    }
}
