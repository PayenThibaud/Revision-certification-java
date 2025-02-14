package org.example.ex2_order_initialization;

public class Voiture {

    // fields / attribute / proprieter / champs

    //revoir les types

    String nom;
    int vitesse;

    {
        System.out.println("cc");
        var cc = "cc";
    }

    // Constructor

    public Voiture(String nom, int vitesse) {
        this.nom = nom;
        this.vitesse = vitesse;
        System.out.println("voiture constructeur avec proprieter");
    }

    {
        System.out.println("cc, apres constructeur");
    }

    public Voiture() {
        System.out.println("voiture constructeur sans proprieter");
    }

    {
        System.out.println("cc, apres constructeur sans proprieter");
    }
}
