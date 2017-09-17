package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
