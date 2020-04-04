package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.repository.EinsatzortRepository;
import org.springframework.stereotype.Service;

@Service
public class EinsatzortService {
    private final EinsatzortRepository einsatzortRepository;

    public EinsatzortService(EinsatzortRepository einsatzortRepository) {
        this.einsatzortRepository = einsatzortRepository;
    }
}
