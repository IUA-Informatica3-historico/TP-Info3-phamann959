package ar.edu.iua;

import java.util.Scanner;

public class Menu {
    private Queue q;
    private Stack s;


    public Menu() {
        //de forma
    }


    public Menu(Queue q, Stack s) {
        this q = q;
        this s = s;
    }


    public void showMenu(Queue q, Stack s) {
        int i;
        int sel;
        int num;
        Scanner intRead = new Scanner(System.in);
        Scanner stringRead = new Scanner(System.in);

        System.out.println("****************************************************************");
        System.out.println("VAMOS A PROBAR FUNCIONAMIENTO DE PILAS (Stacks) Y COLAS (Queues)");
        System.out.println("****************************************************************");
        do {
            i=0;
            System.out.println("   ===== PILAS (STACKS) =====");
            System.out.println(i++ +". [ PUSH ] Inserta un elemento");
            System.out.println(i++ +". [ POP ] Elimina un elemento");
            System.out.println(i++ +". [ TOP ] Obtiene el último elemento insertado");
            System.out.println(i++ +". [ POP&TOP ] Obtiene y elimina el último elemento");
            System.out.println("");
            System.out.println("   ===== COLAS (QUEUES) =====");
            System.out.println(i++ +". [ PUSH ] Inserta un elemento");
            System.out.println(i++ +". [ POP ] Elimina un elemento");
            System.out.println(i++ +". [ TOP ] Obtiene el último elemento insertado");
            System.out.println(i++ +". [ POP&TOP ] Obtiene y elimina el último elemento");
            System.out.println("");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("¿ Su selección? (0-" +i +")"); sel = intRead.nextInt();
            switch(sel) {
                case 0:
                    System.out.print("Ingrese un entero: "); num = intRead.nextInt();

                    break;

                default:
                    System.out.println("¡OPCIÓN INVÁLIDA!");
                    break;
            }

        } while(sel != 0);
    }
}
