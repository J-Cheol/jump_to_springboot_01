package com.ll.jumb_to_springboot_01.question.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

    @GetMapping("/question/list")
    @ResponseBody
    public String list() {
        return "question list";
    }
}
