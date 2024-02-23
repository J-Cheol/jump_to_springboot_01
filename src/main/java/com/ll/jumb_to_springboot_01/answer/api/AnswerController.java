package com.ll.jumb_to_springboot_01.answer.api;

import com.ll.jumb_to_springboot_01.question.Entity.Question;
import com.ll.jumb_to_springboot_01.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final QuestionService questionService;

    public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam(value = "content") String content) {
        Question question = this.questionService.getQuestion(id);
        // TODO: 답변을 저장한다.
        return String.format("redirect:/question/detail/%s", id);
    }
}
