package com.example.tdd.model;

import lombok.Data;

@Data
public class User {

    protected Long id;

    public User() {
    }

    public User(User from) {
        setId(from.getId());
    }
}
