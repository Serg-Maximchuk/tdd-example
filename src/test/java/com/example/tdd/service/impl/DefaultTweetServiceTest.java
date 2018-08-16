package com.example.tdd.service.impl;

import com.example.tdd.persistence.repository.TweetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DefaultTweetServiceTest {

    @Mock
    private TweetRepository tweetRepository;

    @InjectMocks
    private DefaultTweetService defaultTweetService;

    @Test
    void name() {

    }
}
