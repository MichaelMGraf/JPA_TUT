package org.example;


import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Hochschule {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "hochschule", fetch = FetchType.EAGER)
    private Collection<Student> studenten;

    public Hochschule(String name) {
        this.name = name;
    }

    public Hochschule() {
    }

    public void setStudenten(Collection<Student> studenten) {
        this.studenten = studenten;
    }

    public Collection<Student> getStudenten() {
        return studenten;
    }

    @Override
    public String toString() {
        return "Hochschule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
