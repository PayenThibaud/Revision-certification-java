package org.example.ex1_Access_modifiers;

 class ClasseNoAccessModifier {

      String message = "Je suis dans la classe sans Access modifier et accesible dans ma classe et mon package";

     void afficherMessageNoAccessModifier() {
         System.out.println(message);
     }
}
