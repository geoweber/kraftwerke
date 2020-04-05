package com.vantago.kraftwerke.repository;

import com.vantago.kraftwerke.model.Hersteller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HerstellerRepository extends JpaRepository<Hersteller, Long> {

    Hersteller findByName(String name);
}
