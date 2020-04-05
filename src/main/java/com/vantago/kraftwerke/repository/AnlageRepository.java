package com.vantago.kraftwerke.repository;

import com.vantago.kraftwerke.model.Anlage;
import com.vantago.kraftwerke.model.Kraftwerk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnlageRepository extends JpaRepository<Anlage, Long> {

    Anlage findByName(String name);

    List<Anlage> findByKraftwerk(Kraftwerk kraftwerk);
}

