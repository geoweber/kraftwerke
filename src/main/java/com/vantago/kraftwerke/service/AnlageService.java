package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.repository.AnlageRepository;
import org.springframework.stereotype.Service;

@Service
public class AnlageService {
    private final AnlageRepository anlageRepository;

    public AnlageService(AnlageRepository anlageRepository) {
        this.anlageRepository = anlageRepository;
    }
}
