package com.example.tdd.model;

import lombok.Data;

@Data
public class Tweet {

    protected Long id;

    public Tweet() {
    }

    public Tweet(Tweet from) {
        setId(from.getId());
    }

}
