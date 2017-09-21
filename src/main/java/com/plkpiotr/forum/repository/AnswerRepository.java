package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    long countAnswersByUser_Id(long id);
    long countAnswersByUser_IdAndUseful(long user_id, boolean useful);

}
