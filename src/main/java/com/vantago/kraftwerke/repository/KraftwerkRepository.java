package com.vantago.kraftwerke.repository;

import com.vantago.kraftwerke.model.Kraftwerk;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KraftwerkRepository extends JpaRepository<Kraftwerk, Long> {
    Kraftwerk findByName(String name);
}
