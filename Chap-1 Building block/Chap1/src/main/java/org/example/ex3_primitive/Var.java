package org.example.ex3_primitive;


// attention var en mini ne marche pas
public class Var {

    private Var pandaBear;

    public void testScope(String var){
        var = var.toUpperCase();
        {
            String var2 = var;

//            var morning = "", morning = null;
//             var sun = "", moon = "";

        }
        System.out.println(var);
//        System.out.println(var2);
    }
}
