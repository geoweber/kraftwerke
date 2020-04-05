package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Anlage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AnlageServiceTest {


    @Autowired
    private AnlageService service;

    @Autowired
    private AnlagetypeService anlagetypeService;

    @Autowired
    private EinsatzortService einsatzortService;

    @Autowired
    private HerstellerService herstellerService;

    @Autowired
    private KraftwerkService kraftwerkService;

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
        assertEquals("Anlage 1", service.findById(1L).orElseThrow().getName());
    }

    @Test
    void findByName() {
        assertEquals("Anlage 1", service.findByName("Anlage 1").getName());
    }

    @Test
    void save() {
        Anlage object = this.getAnlage();
        service.save(object);
        assertEquals(3, service.findAll().size());
        service.delete(object);
        assertEquals(2, service.findAll().size());
    }


    @Test
    void delete() {
        Anlage object = this.getAnlage();
        service.save(object);
        assertEquals(3, service.findAll().size());
        service.delete(object);
        assertEquals(2, service.findAll().size());
    }

    private Anlage getAnlage() {
        Anlage object = new Anlage();
        object.setAnlagetype(anlagetypeService.findByName("Windrad"));
        object.setAnschaffungsdatum(LocalDate.now());
        object.setBetriebsdauer(LocalDate.now());
        object.setEinsatzort(einsatzortService.findByName("Ratingen"));
        object.setHersteller(herstellerService.findByName("Hersteller 1"));
        object.setKaufpreis(1000);
        object.setKraftwerk(kraftwerkService.findByName("Kraftwerk 1"));
        object.setLeistung(2000);
        object.setName("NameTest");
        object.setId(null);
        object.setBild(null);
        return object;
    }
}