package com.vantago.kraftwerke.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Typ der Erzeugungsanlage (Windrad etc.)
 */
@Entity
@Data
public class Anlagetype extends BaseEntity {
    @OneToMany(mappedBy = "anlagetype")
    private Set<Anlage> anlagen = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anlagetype)) return false;
        if (!super.equals(o)) return false;

        Anlagetype object = (Anlagetype) o;

        return id.equals(object.id);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
