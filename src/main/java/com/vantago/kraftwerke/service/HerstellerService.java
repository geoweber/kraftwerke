package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Hersteller;
import com.vantago.kraftwerke.repository.HerstellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HerstellerService {
    private final HerstellerRepository repository;

    public HerstellerService(HerstellerRepository repository) {
        this.repository = repository;
    }

    public List<Hersteller> findAll() {
        return this.repository.findAll();
    }

    public Hersteller findById(Long id) {
        Optional<Hersteller> result = repository.findById(id);
        return result.orElse(null);
    }

    public Hersteller findByName(String name) {
        return repository.findByName(name);
    }
}
