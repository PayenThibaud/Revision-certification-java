package org.example.ex2;

public class Main {
    public static void main(String[] args) {

        boolean a = false;
        boolean test = (a == true);

        var objet1 = new Object();
        var objet2 = new Object();
        var objet3 = objet1;
        System.out.println(objet1 == objet2);
        System.out.println(objet1 == objet3);
        System.out.println(null == null);

        System.out.println(5 < 6);
        System.out.println(5 < 5);
        System.out.println(5 <= 5);

        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println("String detected: " + obj);
        }

        Integer chiffre = 2;
        if (chiffre instanceof Integer) {
            System.out.println("Integer detected: " + chiffre);
        }

        PratiqueBool bool = new PratiqueBool();

        System.out.println(bool.barre(true, false));
        bool.barre(false, true);

        bool.deuxBarre(true, false);
        bool.deuxBarre(false, true);

        bool.et(true, false);
        bool.et(false, true);

        bool.deuxEt(true, false);
        bool.deuxEt(false, true);

        System.out.println(bool.chapeau(true, false));
        System.out.println(bool.chapeau(true, true));
        System.out.println(bool.chapeau(false, false));


        System.out.println(1 | 11);    // compare les bits,  0001 1011 => 1011
        System.out.println(11 | ~11);  // inverse rend tj 1100 0011 => 1111 soit -1

        System.out.println(1 & 11); // compare les bits, 0001 1011 => 0001
        System.out.println(11 & ~11);  // fera tj 0

        System.out.println(1 ^ 11);  // bool les bit, 0001 1011 => 1010
        System.out.println(11 ^ ~11);  // fera tj -1


        if (true ^ false) {
            System.out.println("C est vrai");
        } else {
            System.out.println("C est faux");
        }

        //ternaire   / ternary operator

        String resultatTernaire = (true ^ false) ? "C est vrai" : "C est faux";
        System.out.println(resultatTernaire);
        System.out.println((true ^ true) ? "C est vrai" : "C est faux");

        double fruit = 1000000000000000000L;


        int pig = (short) 4;
        pig = pig++;
        pig++;
        long goat = (int) 2;
        goat -=1.0;
        System.out.println(pig +" - "+goat);

        int sample2 = 3 * 2 % -3;
        System.out.println(sample2);


//        int WTF = (long) 9999;   ne pqs oublier aue les += etc ... font un caste auto
        int wtf2 = 2;
        wtf2 +=  (long) 99999999;
    }
}