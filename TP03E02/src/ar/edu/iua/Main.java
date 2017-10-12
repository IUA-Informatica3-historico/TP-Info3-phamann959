package ar.edu.iua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej02  ");
        System.out.println("============");
        System.out.println("\n");

        Potencia p = new Potencia();
        Scanner read = new Scanner(System.in);
        double b;
        int exp;

        System.out.print("Ingrese la base: ");
        b = read.nextDouble();

        System.out.print("Ingrese el exponente: ");
        exp = read.nextInt();

        System.out.println("");
        System.out.println("Calculando [" +b +"]^" +exp +"  =  " +p.getPower(b,exp));

        System.out.println("");
        System.out.println("Resultado paso a paso:");
        System.out.println(p.doPowerSbS(b,exp));

        System.out.println("");

    }

}
