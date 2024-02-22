package com.ll.jumb_to_springboot_01.answer.dao;

import com.ll.jumb_to_springboot_01.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
