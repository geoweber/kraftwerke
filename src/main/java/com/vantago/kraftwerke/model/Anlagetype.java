package com.vantago.kraftwerke.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Typ der Erzeugungsanlage (Windrad etc.)
 */
@Entity
public class Anlagetype extends BaseEntity {
    @OneToMany(mappedBy = "anlagetype")
    private Set<Anlage> anlagen = new HashSet<>();
}
