package com.ll.jumb_to_springboot_01.dao;

import com.ll.jumb_to_springboot_01.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
}
