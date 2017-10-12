package ar.edu.iua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej03  ");
        System.out.println("============");
        System.out.println("\n");

        Producto p = new Producto();
        Scanner read = new Scanner(System.in);
        int num1;
        int num2;
        String opt;
        Scanner optRead = new Scanner(System.in);

        do {

            System.out.print("Ingrese un primer un número entero: ");
            num1 = read.nextInt();

            System.out.print("Ingrese un segundo número entero: ");
            num2 = read.nextInt();

            System.out.println("");
            System.out.println("Calculo por método iterativo:  [" +num1 +"*" +num2 +"]  =  " +p.getProductoIterativo(num1,num2));

            System.out.println("");
            try {
                System.out.println("Calculo por método recursivo:  [" +num1 +"*" +num2 +"]  =  " +p.getProductoRecursivo(num1,num2));
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* NO IMPLEMENTADO / NO SOLICITADO
            System.out.println("");
            System.out.println("Resultado paso a paso:");
            System.out.println(p.doProductoSbS(num1,num2));
             */

            System.out.print("\n¿Otra multiplicación? (s/N): ");
            opt = optRead.nextLine();
            //opt = optRead.next();
            System.out.println("");
        } while(opt.equalsIgnoreCase("s") || opt.equalsIgnoreCase("y"));

        System.out.println("");

    }

}
