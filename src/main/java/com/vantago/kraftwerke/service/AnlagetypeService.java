package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Anlagetype;
import com.vantago.kraftwerke.repository.AnlagetypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnlagetypeService {
    private final AnlagetypeRepository repository;

    public AnlagetypeService(final AnlagetypeRepository repository) {
        this.repository = repository;
    }


    public List<Anlagetype> findAll() {
        return this.repository.findAll();
    }

    public Optional<Anlagetype> findById(Long id) {
        return repository.findById(id);
    }

    public Anlagetype findByName(String name) {
        return repository.findByName(name);
    }

}
