package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
