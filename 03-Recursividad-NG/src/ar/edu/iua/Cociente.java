package ar.edu.iua;

public class Cociente {

    public static double Cociente(int a, int b){
        if(Math.abs(a) < Math.abs(b))
            return 0;

        if((a>0 && b>0) || (a<0 && b<0))
            return 1+Cociente(a-b,b);

        if(a>0 && b<0)
            return -1+Cociente(a+b,b);

        if(a<0 && b>0)
            return -1-Cociente(-a-b,b);

        throw new ArithmeticException("No se puede dividir por cero");

    }

}
