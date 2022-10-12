package de.ostfalia.ftse.kunde.controller;

import de.ostfalia.ftse.kunde.entity.Kunde;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;


public class KundenController implements Serializable {

    private final ConcurrentHashMap<String, Kunde> kunden;

    public KundenController() {
        this.kunden = new ConcurrentHashMap<>();
        this.kunden.put("1",new Kunde("Damann","Klaus","1", LocalDate.now()));
        this.kunden.put("2",new Kunde("Müller","Berndt","2", LocalDate.now()));
        this.kunden.put("3",new Kunde("Gutenschwanger","Kai","3", LocalDate.now()));
        this.kunden.put("4",new Kunde("Huhn","Michaela","4", LocalDate.now()));
    }

    public ConcurrentHashMap<String, Kunde> getKunden() {
        return kunden;
    }
}
