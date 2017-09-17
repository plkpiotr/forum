package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
