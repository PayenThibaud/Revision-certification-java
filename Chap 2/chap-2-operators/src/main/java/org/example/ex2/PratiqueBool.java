package org.example.ex2;

public class PratiqueBool {

    private boolean sout(boolean a){
        System.out.println( "boolean : " + a);
        return a;
    }

    public boolean barre(boolean a, boolean b)
    {
        System.out.println( "Barre : ");
        if (sout(a) | sout(b)) {
            return true;
        }
        return false;
    }

    public boolean deuxBarre(boolean a, boolean b)
    {
        System.out.println( "2 Barre : ");
        if (sout(a) || sout(b)) {
            return true;
        }
        return false;
    }

    public boolean et(boolean a, boolean b)
    {
        System.out.println( "et : ");
        if (sout(a) & sout(b)) {
            return true;
        }
        return false;
    }

    public boolean deuxEt(boolean a, boolean b)
    {
        System.out.println( "2 Et : ");
        if (sout(a) && sout(b)) {
            return true;
        }
        return false;
    }

    // different   :  XOR
    public boolean chapeau(boolean a, boolean b)
    {
        System.out.println( "chapeau : ");
        return sout(a) ^ sout(b);
    }
}
