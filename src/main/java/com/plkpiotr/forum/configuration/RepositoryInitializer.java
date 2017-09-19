package com.plkpiotr.forum.configuration;

import com.plkpiotr.forum.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class RepositoryInitializer {
    private final UserRepository userRepository;

    public RepositoryInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
