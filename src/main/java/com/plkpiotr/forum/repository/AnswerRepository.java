package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    long countAnswersByUser_Id(long id);
    long countAnswersByUser_IdAndUseful(long user_id, boolean useful);

    List<Answer> findAnswerByUser_Id(long id);
    List<Answer> findAnswerByUser_IdAndUseful(long user_id, boolean useful);
}
