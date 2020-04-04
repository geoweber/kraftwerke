package com.vantago.kraftwerke.repository;

import com.vantago.kraftwerke.model.Anlage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface KraftwerkRepository extends JpaRepository<Anlage, Long> {
}
