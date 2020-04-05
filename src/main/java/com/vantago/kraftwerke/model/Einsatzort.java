package com.vantago.kraftwerke.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Einsatzort (wo steht die Anlage)
 */
@Entity
@Data
public class Einsatzort extends BaseEntity {

    @OneToMany(mappedBy = "einsatzort")
    private Set<Anlage> anlagen = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Einsatzort)) return false;
        if (!super.equals(o)) return false;

        Einsatzort object = (Einsatzort) o;

        return id.equals(object.id);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
