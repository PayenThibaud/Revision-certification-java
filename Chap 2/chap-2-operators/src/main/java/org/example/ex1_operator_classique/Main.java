package org.example.ex1_operator_classique;

public class Main {
    public static void main(String[] args) {

        Operator op = new Operator();

        boolean bool = false;

        bool = op.inversionBoolean(bool);

        System.out.println(bool);

        int a = -1;

        a = op.positifMetEnValeur(a);
        System.out.println(a);

        a = op.inverseLeSigne(a);
        System.out.println(a);

        op.increment(5);
        op.decrement(5);

        System.out.println( op.cast('a'));
        System.out.println( op.cast(9.999));

        System.out.println(op.inversionDesBit(-100));

        
//        double x = 39.21;
//        float y = 2.1;
//        var z = x + y;

//        short x = 4;
//        short y = 4;
//        short z = x * y;

        double x = 39.21;
        float y = 2.1f;
        float y1 = 2;
//        float y2 = 2.1;  erreur manque le f
        var z = x + y;


//        float crash = 2.0/9;
        float  infini = (float) 2.0/9;
        float infini2 = 2/9;
        float infini3 =  2.0f/ 9L;
        System.out.println(infini);
        System.out.println(infini2);
        System.out.println(infini3);

        long chiffrelong = 11111111111111111_1L;  // ne pas oublier le l / L
//        long chiffrelong2 = (long) 22222222222222222_1; ne marche pas car le nombre est stock en int avt le long...

        System.out.println( (short)1921222);

        System.out.println(op.assignmentAddition(5));
    }
}
