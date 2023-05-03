package org.example.aufgabe;


import java.util.List;

//TODO Ein Repository erzeugen welches ein Objekt speichern kann, ein Objekt per ID finden kann
// (einmal mit und einmal ohne der Liste an Kursen)

//TODO Datenbankentität
public class Dozent {

    //TODO automatisch generierter Primärschlüssel
    private Long id;

    //TODO Datenbankattribut, welches nicht null sein darf
    private String vorname;

    //TODO Datenbankattribut, welches nicht null sein darf
    private String nachname;

    //TODO Beziehung zu mehreren Kursen, welches nicht mitgeladen werden soll
    private List<Kurs> kurse;
}
