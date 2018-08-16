package com.example.tdd.service;

import com.example.tdd.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(Long id);

    User create(User prototype);

    User save(User saveMe);

    void deleteUser(Long id);

}
