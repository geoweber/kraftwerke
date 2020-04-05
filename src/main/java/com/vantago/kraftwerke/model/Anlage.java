package com.vantago.kraftwerke.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Anlage extends BaseEntity {

    /**
     * Bild der Anlage
     * FIXME si. https://vaadin.com/blog/saving-and-displaying-images-using-jpa
     */
    private byte[] bild;

    @ManyToOne
    @JoinColumn(name = "anlagetype_id", nullable = false)
    private Anlagetype anlagetype;

    /**
     * Leistung (Angabe in kW)
     */
    private Integer leistung;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate anschaffungsdatum;

    @ManyToOne
    @JoinColumn(name = "hersteller_id", nullable = false)
    private Hersteller hersteller;

    /**
     * Kaufpreis (in Tausend Euro)
     */
    private Integer kaufpreis;


    @ManyToOne
    @JoinColumn(name = "einsatzort_id", nullable = false)
    private Einsatzort einsatzort;


    /**
     * Betriebsdauer (wie lange ist die Anlage in Betrieb gewesen in Stunden)
     */
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate betriebsdauer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kraftwerk_id", nullable = false)
    private Kraftwerk kraftwerk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anlage)) return false;
        if (!super.equals(o)) return false;

        Anlage anlage = (Anlage) o;

        return id.equals(anlage.id);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
