package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Kraftwerk;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KraftwerkServiceTest {


    @Autowired
    private KraftwerkService service;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        assertEquals(5, service.findAll().size());
    }

    @Test
    void findById() {
        Kraftwerk object = service.findById(1L).get();
        assertEquals("Kraftwerk 1", object.getName());
        assertEquals(2, object.getAnlagen().size());
    }

    @Test
    void findByName() {
        assertEquals("Kraftwerk 1", service.findByName("Kraftwerk 1").getName());
    }


    @Test
    void getGesamtleistung() {
        assertEquals(service.getGesamtleistungById(1L), 400000);
    }
}