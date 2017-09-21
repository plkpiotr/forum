package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Topic;
import com.plkpiotr.forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findTopicsByCategory(String category);
    List<Topic> findTopicsByUser_Id(Long id);

}
