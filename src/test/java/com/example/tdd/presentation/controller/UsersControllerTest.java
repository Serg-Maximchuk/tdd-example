package com.example.tdd.presentation.controller;

import com.example.tdd.TddApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = TddApplicationTests.class)
class UsersControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void name() {

    }
}
