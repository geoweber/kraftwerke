package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.repository.HerstellerRepository;
import org.springframework.stereotype.Service;

@Service
public class HerstellerService {
    private final HerstellerRepository herstellerRepository;

    public HerstellerService(HerstellerRepository herstellerRepository) {
        this.herstellerRepository = herstellerRepository;
    }
}
