package com.vantago.kraftwerke.service;

import com.vantago.kraftwerke.repository.KraftwerkRepository;
import org.springframework.stereotype.Service;

@Service
public class KraftwerkService {
    private final KraftwerkRepository kraftwerkRepository;

    public KraftwerkService(KraftwerkRepository kraftwerkRepository) {
        this.kraftwerkRepository = kraftwerkRepository;
    }
}
