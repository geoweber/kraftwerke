package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Anlagetype;
import com.vantago.kraftwerke.repository.AnlagetypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnlagetypeService {
    private final AnlagetypeRepository anlagetypeRepository;

    public AnlagetypeService(final AnlagetypeRepository anlagetypeRepository) {
        this.anlagetypeRepository = anlagetypeRepository;
    }


    List<Anlagetype> findAll() {
        return this.anlagetypeRepository.findAll();
    }

}
