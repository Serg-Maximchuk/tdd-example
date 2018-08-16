package com.example.tdd.model;

import lombok.Data;

@Data
public class Tweet {

    protected Long id;

    protected User author;

    public Tweet() {
    }

    public Tweet(Tweet from) {
        setId(from.getId());
        setAuthor(from.getAuthor());
    }

}
