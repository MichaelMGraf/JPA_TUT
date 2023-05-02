package org.example;


import jakarta.persistence.*;

@Entity
@SequenceGenerator(name = "matrikelnummer_sequenz", initialValue = 5291380)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matrikelnummer_sequenz")
    private Long matrikelnummer;

    @Column
    private String vorname;

    @Column
    private String nachname;

    @ManyToOne
    private Hochschule hochschule;


    public Student(String vorname, String nachname, Hochschule hochschule) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.hochschule = hochschule;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelnummer=" + matrikelnummer +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", hochschule=" + hochschule +
                '}';
    }
}
