package org.example;

import java.util.Random;

public class Main {


    public static double trouverPi(int nombrePoints) {

        Random random = new Random();
        int pointTombeDansLesConditions = 0;

        for (int i = 0; i < nombrePoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1) {
                pointTombeDansLesConditions++;
            }
        }

        return 4.0 * pointTombeDansLesConditions / nombrePoints;
    }

    public static void main(String[] args) {
        double PiSansMathCestNul = trouverPi(100000);
        System.out.println( PiSansMathCestNul );
    }
}

