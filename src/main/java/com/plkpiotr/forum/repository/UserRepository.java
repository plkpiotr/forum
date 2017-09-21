package com.plkpiotr.forum.repository;

import com.plkpiotr.forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String username);
    User getUserById(Long Id);

}
