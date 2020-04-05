package com.vantago.kraftwerke.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

/**
 * Kennung zu welchem virtuellen Kraftwerk die Erzeugungsanlage gehört (ID des virtuellen Kraftwerks)
 */
@Entity
@Data
public class Kraftwerk extends BaseEntity {

    @OneToMany(mappedBy = "kraftwerk", fetch = FetchType.EAGER)
    private Set<Anlage> anlagen = new HashSet<>();

    @Transient
    private long gesamtleistung;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kraftwerk)) return false;
        if (!super.equals(o)) return false;

        Kraftwerk object = (Kraftwerk) o;

        return id.equals(object.id);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
