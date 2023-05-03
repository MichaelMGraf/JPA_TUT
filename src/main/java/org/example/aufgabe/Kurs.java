package org.example.aufgabe;


import jakarta.persistence.*;

@Entity
public class Kurs {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private short jahr;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Dozent dozent;


    public Kurs(String name, Dozent dozenten) {
        this.name = name;
        this.dozent = dozenten;
    }

    public Kurs() {
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                //", dozent=" + dozenten +
                '}';
    }
}
