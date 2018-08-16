package com.example.tdd.presentation.controller;

import com.example.tdd.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

    private final TweetService tweetService;

    @Autowired
    public TweetsController(TweetService tweetService) {
        this.tweetService = tweetService;
    }
}
