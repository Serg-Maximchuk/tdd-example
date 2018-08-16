package com.example.tdd.model;

import lombok.Data;

@Data
public class User {

    protected Long id;

    protected String email;

    public User() {
    }

    public User(User from) {
        setId(from.getId());
        setEmail(from.getEmail());
    }
}
