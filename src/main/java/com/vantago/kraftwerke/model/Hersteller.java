package com.vantago.kraftwerke.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Hersteller extends BaseEntity {

    @OneToMany(mappedBy = "anlagetype")
    private Set<Anlage> anlagen = new HashSet<>();
}
