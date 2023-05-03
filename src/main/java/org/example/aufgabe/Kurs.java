package org.example.aufgabe;


//TODO Ein Repository erzeugen welches ein Objekt speichern kann, ein Objekt per ID finden kann

//TODO Datenbankentität
public class Kurs {

    //TODO automatisch generierter Primärschlüssel
    private Long id;

    //TODO Datenbankattribut, welches nicht null sein darf
    private String name;

    //TODO Datenbankattribut, welches nicht null sein darf

    private short jahr;

    //TODO Beziehung zu einem Dozent, welches nicht null sein darf und sofort mitgeladen werden soll
    private Dozent dozent;

}
