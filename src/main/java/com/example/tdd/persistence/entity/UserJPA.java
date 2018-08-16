package com.example.tdd.persistence.entity;

import com.example.tdd.model.User;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class UserJPA extends User {

    public UserJPA(User from) {
        super(from);
    }

    @Id
    @GeneratedValue
    @Override
    public Long getId() {
        return id;
    }
}
