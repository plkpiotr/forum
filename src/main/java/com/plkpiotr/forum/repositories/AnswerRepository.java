package com.plkpiotr.forum.repositories;

import com.plkpiotr.forum.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    Long countAnswersByUser_Id(Long id);
    Long countAnswersByUser_IdAndUseful(Long user_id, boolean useful);

    List<Answer> findAnswerByUser_IdOrderByLastModifiedDateDesc(Long id);
    List<Answer> findAnswerByUser_IdAndUsefulOrderByLastModifiedDateDesc(Long user_id, boolean useful);
}
