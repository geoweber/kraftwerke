package com.vantago.kraftwerke.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EinsatzortServiceTest {

    @Autowired
    private EinsatzortService service;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        assertEquals(2, service.findAll().size());
    }

    @Test
    void findById() {
        assertEquals("Ratingen", service.findById(1L).getName());
    }

    @Test
    void findByName() {
        assertEquals("Ratingen", service.findByName("Ratingen").getName());
    }
}