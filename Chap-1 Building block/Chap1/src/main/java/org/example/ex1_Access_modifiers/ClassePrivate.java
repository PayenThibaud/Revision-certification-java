package org.example.ex1_Access_modifiers;

public class ClassePrivate {
    private String message = "Je suis dans la classe private et accesible que dans ma classe";

    private void afficherMessagePrivate() {
        System.out.println(message);
    }

    public void afficherMessagePublic() {
        afficherMessagePrivate();
    }
}
