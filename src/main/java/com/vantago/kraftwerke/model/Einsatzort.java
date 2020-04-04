package com.vantago.kraftwerke.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Einsatzort (wo steht die Anlage)
 */
@Entity
public class Einsatzort extends BaseEntity {

    @OneToMany(mappedBy = "anlagetype")
    private Set<Anlage> anlagen = new HashSet<>();
}
