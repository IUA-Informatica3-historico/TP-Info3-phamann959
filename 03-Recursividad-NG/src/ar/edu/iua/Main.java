package ar.edu.iua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner read = new Scanner(System.in);
        System.out.printf("Ingrese divisor: "); a = read.nextInt();
        System.out.printf("Ingrese dividendo: "); b = read.nextInt();
        Cociente cociente = new Cociente();
        double resultado = cociente.Cociente(a, b);

        System.out.println("Resultado: " +resultado);

    }

}
