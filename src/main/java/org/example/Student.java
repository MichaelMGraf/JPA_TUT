package org.example;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long matrikelnummer;

    @Column
    private String vorname;

    @Column
    private String nachname;


    public Student(long matrikelnummer, String vorname, String nachname) {
        this.matrikelnummer = matrikelnummer;
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
