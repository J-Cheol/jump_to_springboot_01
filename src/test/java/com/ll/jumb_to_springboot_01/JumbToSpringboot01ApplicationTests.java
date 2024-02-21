package com.ll.jumb_to_springboot_01;

import com.ll.jumb_to_springboot_01.Entity.Question;
import com.ll.jumb_to_springboot_01.dao.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JumbToSpringboot01ApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        List<Question> all = this.questionRepository.findAll();
        assertEquals(6, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }

}
