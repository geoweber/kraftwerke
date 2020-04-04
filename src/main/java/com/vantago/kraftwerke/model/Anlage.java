package com.vantago.kraftwerke.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
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
    private LocalDate Betriebsdauer;

    @ManyToOne
    @JoinColumn(name = "kraftwerk_id", nullable = false)
    private Kraftwerk kraftwerk;
}
