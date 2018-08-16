package com.example.tdd.service.impl;

import com.example.tdd.model.User;
import com.example.tdd.persistence.repository.UserRepository;
import com.example.tdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class LocalUserService implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public LocalUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return Collections.emptyList();
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User create(User prototype) {
        return null;
    }

    @Override
    public User save(User saveMe) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
