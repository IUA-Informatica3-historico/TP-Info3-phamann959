package ar.edu.iua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej06  ");
        System.out.println("============");
        System.out.println("\n");

        int num;
        Scanner read = new Scanner(System.in);
        Conversor c = new Conversor();

        String opt="N";
        Scanner optRead = new Scanner(System.in);

        do {

            System.out.print("Ingrese un número entero positivo: ");
            num = read.nextInt();

            System.out.println("");
            int onesInBinaryRepresOfDecNum = c.getOnesInBinaryRepresentOfDecNum(num); //Llamamos una sola vez a la función y almacenamos el valor obtenido
            System.out.println("Cantidad de unos en la rep. binaria: " +onesInBinaryRepresOfDecNum);
            int convertedNum = c.getBinaryNum(num); //Llamamos una sola vez a la función y almacenamos el valor obtenido
            System.out.println("(la representación binaria de '" +num +"' es '" +convertedNum +"')");

            System.out.print("\n¿Otra vez? (s/N): ");
            opt = optRead.nextLine();
            System.out.println("");

        } while(opt.equalsIgnoreCase("s") || opt.equalsIgnoreCase("y"));

        System.out.println("");
    }
}
