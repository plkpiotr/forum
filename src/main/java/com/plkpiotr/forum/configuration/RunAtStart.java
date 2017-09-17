package com.plkpiotr.forum.configuration;

import com.plkpiotr.forum.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RunAtStart {
    private final UserRepository userRepository;

    public RunAtStart(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
