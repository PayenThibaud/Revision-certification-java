package org.example.ex1_Access_modifiers;


// public = tout les autres classes peuvent l utiliser.
// private = seulement dans la classe ou il est defini.
// protected = Dans le meme package, dans sa classe, ou une classe qui herite.

import org.example.ex1_Access_modifiers.Herite.ClasseHerite;
import org.example.ex1_Access_modifiers.Protected.ClasseProtected;


// Meme nom de fichier, nom de class
public class Main {
    /**
     * Javadoc multiple-line comment
     * @author Titi
     */
    // allez sur le nom de la methode / champ + alt + entrée
    // Point d entrer, entry point
    // d autre parameter possible,  String[] args, String table[], String... args
    public static void main(String... args) {


        // instanciation
        ClassePublic classePublic = new ClassePublic();

        // appel de methode
        classePublic.afficherMessage();

        // pas les bonne pratiques ,  getter/setter
        classePublic.message = "changement depuis main";
        classePublic.afficherMessage();

        ClassePrivate classePrivate = new ClassePrivate();
//        classePrivate.afficherMessagePrivate();
        classePrivate.afficherMessagePublic();

        ClasseProtected classeProtected = new ClasseProtected();
//        classeProtected.afficherMessageProtected();
        ClasseHerite classeHerite = new ClasseHerite();
        classeHerite.afficherMessageHerite();

        ClasseNoAccessModifier classeNoAccessModifier = new ClasseNoAccessModifier();
        classeNoAccessModifier.afficherMessageNoAccessModifier();
    }
}