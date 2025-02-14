package org.example.ex1_Access_modifiers;

// public = access modifier
// class = un modele qui permet de créer des objets
public class ClassePublic {


    // champ / attribut

    // String = type de variable,  String reference types  / int primitive type
    // message = nom variable
    // = ...  = valeur de la variable
    public String message = "Je suis dans la classe public et accesible partout";


    // methode

    // void = type de retour,
    // afficherMessage = nom methode
    // afficherMessage() = nom signature

    public void afficherMessage() {

        // corps de la methode

        System.out.println(message);
    }

    private String coucou = "coucou";

    // (String coucou) = parameter
    // afficherMessage(String) = nom signature
    public void afficherMessage(String coucou) {
        System.out.println(coucou);
    }
}
