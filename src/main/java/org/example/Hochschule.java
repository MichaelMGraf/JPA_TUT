package org.example;


import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Hochschule {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToOne(optional = false)
    private Stadt stadt;

    @OneToMany(mappedBy = "hochschule")
    private Collection<Student> studenten;

    public Hochschule(String name) {
        this.name = name;
    }

    public Hochschule() {
    }

    public Stadt getStadt() {
        return stadt;
    }

    public void setStadt(Stadt stadt) {
        this.stadt = stadt;
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
                ", stadt='" + stadt + '\'' +
                '}';
    }
}
