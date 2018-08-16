package com.example.tdd.service.impl;

import com.example.tdd.persistence.repository.UserRepository;
import com.example.tdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LocalUserService implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public LocalUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
