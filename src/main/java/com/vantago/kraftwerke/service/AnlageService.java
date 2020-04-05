package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Anlage;
import com.vantago.kraftwerke.repository.AnlageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnlageService {
    private final AnlageRepository repository;

    public AnlageService(AnlageRepository repository) {
        this.repository = repository;
    }

    public List<Anlage> findAll() {
        return this.repository.findAll();
    }

    public Optional<Anlage> findById(Long id) {
        return repository.findById(id);
    }

    public Anlage findByName(String name) {
        return repository.findByName(name);
    }

    public Anlage save(Anlage object) {
        return repository.save(object);
    }

    public void delete(Anlage object) {
        repository.delete(object);
    }


}
