package com.ll.jumb_to_springboot_01;

import com.ll.jumb_to_springboot_01.Entity.Question;
import com.ll.jumb_to_springboot_01.dao.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JumbToSpringboot01ApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent())
        {
            Question q = oq.get();
            assertEquals("sbb가 무엇인가요?", q.getSubject());
        }
    }

}
