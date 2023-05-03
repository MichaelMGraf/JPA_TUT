package org.example.aufgabe;


import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;

@Entity
public class Dozent {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String vorname;

    @Column(nullable = false)
    private String nachname;

    @OneToMany(mappedBy = "dozent", fetch = FetchType.LAZY)
    private List<Kurs> kurse;


    public Dozent(String vorname, String nachname, Kurs... kurse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kurse = Arrays.asList(kurse);
    }

    public Dozent() {
    }

    public void setKurse(List<Kurs> kurse) {
        this.kurse = kurse;
    }

    @Override
    public String toString() {
        return "Dozent{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", kurse=" + kurse +
                '}';
    }
}
