package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.model.Anlage;
import com.vantago.kraftwerke.model.Kraftwerk;
import com.vantago.kraftwerke.repository.KraftwerkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KraftwerkService {

    private final KraftwerkRepository repository;

    public KraftwerkService(final KraftwerkRepository repository) {
        this.repository = repository;
    }

    public List<Kraftwerk> findAll() {
        return this.repository.findAll();
    }

    public Optional<Kraftwerk> findById(Long id) {
        return repository.findById(id);
    }

    public Kraftwerk findByName(String name) {
        return repository.findByName(name);
    }

    /**
     * Die Methode ermittelt der Gesamtleistung aller Anlagen eines virtuellen Kraftwerks
     *
     * @param id - id des virtuallen Kraftwerks
     * @return die Gesamtleistung des Kraftwerks
     */
    public int getGesamtleistungById(Long id) {

        if (id == null || id == 0) return 0;

        Optional<Kraftwerk> result = repository.findById(id);
        if (result.isEmpty()) return 0;
        return result.get().getAnlagen().stream().mapToInt(Anlage::getLeistung).sum();
    }


}
