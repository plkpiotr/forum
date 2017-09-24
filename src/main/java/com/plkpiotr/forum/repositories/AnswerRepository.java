package com.plkpiotr.forum.repositories;

import com.plkpiotr.forum.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {

    @Modifying
    @Transactional
    @Query ("UPDATE Answer a SET a.useful = :bool WHERE a.id = :id")
    void setUsefulForAnswer(@Param("bool") Boolean bool, @Param("id") Long id);

    @Transactional
    void deleteAnswerById(Long id);

    Long countAnswersByUser_Id(Long id);
    Long countAnswersByUser_IdAndUseful(Long user_id, boolean useful);
    Long countAnswersByTopic_Id(Long topic_id);

    List<Answer> findAnswerByUser_IdOrderByCreatedDateDesc(Long id);
    List<Answer> findAnswerByUser_IdAndUsefulOrderByCreatedDateDesc(Long user_id, boolean useful);
    List<Answer> findAnswerByTopic_Id(Long topic_id);
}
