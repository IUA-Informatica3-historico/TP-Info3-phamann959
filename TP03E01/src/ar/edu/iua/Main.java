package ar.edu.iua;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej01  ");
        System.out.println("============");
        System.out.println("\n");

        int numero;
        Scanner read = new Scanner(System.in);
        Factorial fact = new Factorial();

        System.out.print("Ingrese un número para calcular el factorial: ");
        numero = read.nextInt();

        System.out.println(fact.doFactorialSbS(numero));

        System.out.println("Factorial:\t" +fact.getFactorial(numero));

        System.out.println("");
    }
}
