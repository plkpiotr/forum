package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    List<Topic> findTopicByCategory(String category);

}
