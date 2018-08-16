package com.example.tdd.service.impl;

import com.example.tdd.persistence.repository.TweetRepository;
import com.example.tdd.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class DefaultTweetService implements TweetService {

    private final TweetRepository tweetRepository;

    @Autowired
    public DefaultTweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }
}
