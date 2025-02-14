package org.example.ex1_Access_modifiers.Protected;

public class ClasseProtected {
    protected String message = "Je suis dans la classe protected et accesible dans ma classe, mes heritiers et mon package";

    protected void afficherMessageProtected() {
        System.out.println(message);
    }

}
