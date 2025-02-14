package org.example.ex1_operator_classique;

// Operand  =  x  ,  y ,  5 , 12
// Operator =  *  ;  /  , +  ,  =
public class Operator {

    // Unary Operator

    public boolean inversionBoolean (boolean true_or_false){
        return !true_or_false;  // inverse
    }

    public int inversionDesBit (int a) {
        return ~a;  // inverse le binaire,  0001  = 1110     inverse le signe et -1
    }

    public int positifMetEnValeur (int a) {
        return +a;  // ne fait rien
    }

    public int inverseLeSigne (int a){
        return -a;
    }

    public void increment(int a){
        int b = a;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
    }

    public void decrement(int a){
        int b = a;
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--b);
    }

    public int cast(double a){
        return (int) a;
    }

    public byte cast(char a){
        return (byte) a;
    }

    public int cast2(char a){
        return  a;
    }


    public int assignmentAddition(int a){
        return a += a;
    }
    public int assignmentSubtraction(int a){
        return a -= a;
    }
    public int assignmentMultiplication(int a){
        return a *= a;
    }
    public int assignmentDivision(int a){
        return a /= a;
    }

}
