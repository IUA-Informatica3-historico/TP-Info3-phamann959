package ar.edu.iua;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("============");
        System.out.println("  TP03Ej07  ");
        System.out.println("============");
        System.out.println("\n");

        int num;
        Scanner read = new Scanner(System.in);

        String opt="N";
        Scanner optRead = new Scanner(System.in);

        FuncionRecursiva fr = new FuncionRecursiva();

        do {
            System.out.print("Ingrese un número entero positivo: ");
            num = read.nextInt();
            if(num<0)
                System.out.println("ERROR: ¡El número debe ser positivo!");
            else {
                System.out.println("Ingresado: " +num);
                String procesado = fr.getNumbersSeparatedBySpaces(num);
                System.out.println("Procesado: " +procesado);
            }
            System.out.println("");

            System.out.print("\n¿Otra vez? (s/N): ");
            opt = optRead.nextLine();
            System.out.println("");
        } while(opt.equalsIgnoreCase("s") || opt.equalsIgnoreCase("y"));

        System.out.println("");
    }
}
