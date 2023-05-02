package org.example;

import jakarta.persistence.*;

@Entity
public class Stadt {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToOne(mappedBy = "stadt")
    private Hochschule hochschule;

    public Stadt(String name) {
        this.name = name;
    }

    public Stadt() {
    }

    public void setHochschule(Hochschule hochschule) {
        this.hochschule = hochschule;
    }

    @Override
    public String toString() {
        return "Stadt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
