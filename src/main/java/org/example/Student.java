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


    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelnummer=" + matrikelnummer +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
