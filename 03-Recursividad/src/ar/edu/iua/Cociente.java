package ar.edu.iua;

public class Cociente {

    public double Cociente(int a, int b) {

        int c = a+b;
        System.out.println("a: ", a);
        System.out.println("b: ", b);
        System.out.println("c: ", c);
        if(c < b)
            return 1;
        return 1 + Cociente(c,b);

    }
}
