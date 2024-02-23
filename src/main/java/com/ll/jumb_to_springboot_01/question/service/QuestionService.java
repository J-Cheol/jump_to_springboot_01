package com.ll.jumb_to_springboot_01.question.service;

import com.ll.jumb_to_springboot_01.question.Entity.Question;
import com.ll.jumb_to_springboot_01.question.dao.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}
