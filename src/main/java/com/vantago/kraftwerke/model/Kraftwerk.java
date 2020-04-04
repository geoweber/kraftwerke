package com.vantago.kraftwerke.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Kennung zu welchem virtuellen Kraftwerk die Erzeugungsanlage gehört (ID des virtuellen Kraftwerks)
 */
@Entity
public class Kraftwerk extends BaseEntity {

    @OneToMany(mappedBy = "anlagetype")
    private Set<Anlage> anlagen = new HashSet<>();
}