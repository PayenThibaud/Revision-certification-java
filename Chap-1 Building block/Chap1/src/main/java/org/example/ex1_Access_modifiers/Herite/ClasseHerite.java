package org.example.ex1_Access_modifiers.Herite;

import org.example.ex1_Access_modifiers.Protected.ClasseProtected;

public class ClasseHerite extends ClasseProtected {

    public void afficherMessageHerite() {
        afficherMessageProtected();
    }
}
