package com.vantago.kraftwerke.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AnlagetypeServiceTest {

    @Autowired
    private AnlagetypeService service;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        assertEquals(3, service.findAll().size());
    }

    @Test
    void findById() {
        assertEquals("Windrad", service.findById(1L).get().getName());
    }

    @Test
    void findByName() {
        assertEquals("Windrad", service.findByName("Windrad").getName());
    }
}