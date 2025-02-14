package org.example.ex2_order_initialization;


// interieure du {} (brace)= code block
public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.nom = "A";
        voiture.nom = new String("WAT");
        System.out.println(voiture.nom);
        String nom = "A";
        {
            // permet de mettre des variable qui ne sont pas utilisable dehors.
            nom = "B";
            System.out.println(nom);
            String nom2 = "C";
            System.out.println(nom2);
        }
        System.out.println(nom);
//         System.out.println(nom2);   // n existe pas.
        voiture = null;
        System.out.println(voiture);
//        System.out.println(voiture.nom);

        String block = """ 
               "" ok \n
                doe""";

        System.out.println(block);
    }
}
