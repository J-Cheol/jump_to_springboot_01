package com.ll.jumb_to_springboot_01;

import com.ll.jumb_to_springboot_01.Entity.Answer;
import com.ll.jumb_to_springboot_01.Entity.Question;
import com.ll.jumb_to_springboot_01.dao.AnswerRepository;
import com.ll.jumb_to_springboot_01.dao.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JumbToSpringboot01ApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;
    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        Answer a = new Answer();
        a.setContent("네 자동으로 생성됩니다.");
        a.setQuestion((q));
        a.setCreateDate(LocalDateTime.now());
        this.answerRepository.save(a);
    }

}
