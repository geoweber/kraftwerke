package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Einsatzort;
import com.vantago.kraftwerke.repository.EinsatzortRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EinsatzortService {

    private final EinsatzortRepository repository;

    public EinsatzortService(EinsatzortRepository repository) {
        this.repository = repository;
    }

    public List<Einsatzort> findAll() {
        return this.repository.findAll();
    }

    public Einsatzort findById(Long id) {
        Optional<Einsatzort> result = repository.findById(id);
        return result.orElse(null);
    }

    public Einsatzort findByName(String name) {
        return repository.findByName(name);
    }
}
