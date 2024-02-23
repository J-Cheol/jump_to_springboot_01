package com.ll.jumb_to_springboot_01.answer.service;


import com.ll.jumb_to_springboot_01.answer.dao.AnswerRepository;
import com.ll.jumb_to_springboot_01.answer.entity.Answer;
import com.ll.jumb_to_springboot_01.question.Entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }

}
