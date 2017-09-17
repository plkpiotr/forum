package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}
