package com.example.tdd.service.impl;

import com.example.tdd.persistence.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class LocalUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private LocalUserService localUserService;

    @Test
    void name () {
    }
}