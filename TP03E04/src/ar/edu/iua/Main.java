package ar.edu.iua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej04  ");
        System.out.println("============");
        System.out.println("\n");

        Division d = new Division();
        int[] resultadoDiv;
        Scanner read = new Scanner(System.in);
        int num;
        int divisor;
        String opt;
        Scanner optRead = new Scanner(System.in);

        do {

            System.out.print("Ingrese un dividendo (número entero): ");
            num = read.nextInt();

            System.out.print("Ingrese un divisor (número entero): ");
            divisor = read.nextInt();

            System.out.println("");
            try {
                resultadoDiv = d.getDivisionIterativa(num,divisor); //hacemos una sola vez la operación llamando solo una vez al método
                System.out.println("Calculo por método iterativo:  [" +num +"/" +divisor +"]  =  " +resultadoDiv[0] +"  (resto: " +resultadoDiv[1] +")");
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("");
            try {
                resultadoDiv = d.getDivisionRecursiva(num,divisor); //hacemos una sola vez la operación llamando solo una vez al método
                System.out.println("Calculo por método recursivo:  [" +num +"/" +divisor +"]  =  " +resultadoDiv[0] +"  (resto: " +resultadoDiv[1] +")");
            } catch (Exception e) {
                e.printStackTrace();
            }

            /* NO IMPLEMENTADO / NO SOLICITADO
            System.out.println("");
            System.out.println("Resultado paso a paso:");
            System.out.println(p.doDivisionSbS(num,divisor));
             */

            System.out.print("\n¿Otra división? (s/N): ");
            opt = optRead.nextLine();
            //opt = optRead.next();
            System.out.println("");
        } while(opt.equalsIgnoreCase("s") || opt.equalsIgnoreCase("y"));

        System.out.println("");

    }

}
