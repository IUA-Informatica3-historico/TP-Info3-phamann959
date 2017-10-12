package ar.edu.iua;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Random;
import static java.lang.Math.abs;

public class Menu<T> {
    private String ifaceType;
    private Random aleatorio = new Random();

    public Menu() {
        ifaceType="CLI";
    }


    public Menu(String ifaceType) {
        this.ifaceType = ifaceType;
    }


    public void start() {
        if(ifaceType=="CLI")
            startCLI();
        else
            startGUI();
    }


    private void waitEnterKey() {
        System.out.print("\nPresione 'Intro' para regresar al menú... ");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String doBorde(int n) {
        String borde = "";
        for(int i=0; i<n; i++) {
            borde += (char)739;
        }
        return borde;
    }

    private void printBorde(int n) {
        for(int i=0; i<n; i++) {
            System.out.print((char)739);
        }
        System.out.println();
    }

    private void printBorde(int n, int code) {
        for(int i=0; i<n; i++) {
            System.out.print((char)code);
        }
        System.out.println();
    }

    private void printBorde(int n, int code, boolean ret) {
        for(int i=0; i<n; i++) {
            System.out.print((char)code);
        }
        if(ret)
            System.out.println();
    }

    private void printBorde(int n, boolean ret) {
        for(int i=0; i<n; i++) {
            System.out.print((char)739);
        }
        if(ret)
            System.out.println();
    }


    public int startCLI(){
        Ordenamiento o = new Ordenamiento();

        int size;
        Scanner read = new Scanner(System.in);


        return menuCLI();

    }


    public int menuCLI(){
        //Arreglo<Integer> aInt;
        //Arreglo<Double> aDou;
        //Arreglo<String> aStr;
        List<Integer> arrayInt = new ArrayList<Integer>();
        List<Double> arrayDou = new ArrayList<Double>();
        String arrayStr = "";
        int opt;
        Scanner optRead = new Scanner(System.in);

        do{
            System.out.print("\n\n\n\n");
            printBorde(24, 739);
            printBorde(2, 739, false);
            System.out.print("  MENÚ DE OPCIONES  ");
            printBorde(2, 739, true);
            printBorde(24, 739);
            int i=0;
            int size;
            System.out.println("    ===========================");
            System.out.println("    INICIAR UN ARREGLO DE DATOS");
            System.out.println("    ===========================");
            System.out.println(i++ +".  Inicializar un vector de números enteros");
            System.out.println(i++ +".  Inicializar un vector de números reales");
            System.out.println(i++ +".  Inicializar un vector con una cadena caracteres");
            System.out.println("    ===========================");
            System.out.println("    ORDENAR EL ARREGLO DE DATOS");
            System.out.println("    ===========================");
            System.out.println(i++ +".  Ordenar vector mediante uso de Inserción");
            System.out.println(i++ +".  Ordenar vector mediante uso de ShellSort");
            System.out.println(i++ +".  Ordenar vector mediante uso de QuickSort");
            System.out.println("    ===========================");
            System.out.println("    VISUALIZACIÓN DE DATOS");
            System.out.println("    ===========================");
            System.out.println(i++ +".  Mostrar el vector en su estado actual");
            System.out.println("\n0.  Salir\n");
            System.out.print("\t¿Su opción? (0-" +i +"): "); opt = optRead.nextInt();
            System.out.println("");

            switch(opt){
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    printBorde(38);
                    System.out.println(opt +".  Inicializar un vector de números enteros");
                    printBorde(38);
                    System.out.println("¿Tamaño? (cant. de elementos del arreglo): ");
                    size = optRead.nextInt();
                    for(int n=0; n<size; n++) {
                        arrayInt.add(aleatorio.nextInt(size));
                    }

                    waitEnterKey();
                    break;

                case 2:
                    printBorde(43);
                    System.out.println(opt +".  Inicializar un vector de números reales");
                    printBorde(43);
                    System.out.println("¿Tamaño? (cant. de elementos del arreglo): ");
                    size = optRead.nextInt();
                    for(int n=0; n<size; n++) {
                        arrayInt.add(aleatorio.nextInt(size));
                    }

                    waitEnterKey();
                    break;

                case 3:
                    printBorde(51);
                    System.out.println(opt +".  Inicializar un vector con una cadena caracteres");
                    printBorde(51);
                    System.out.println("¿Tamaño? (cant. de elementos del arreglo): ");
                    size = optRead.nextInt();
                    String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                    for(int n=0; n<size; n++) {
                        arrayStr += abecedario.charAt(aleatorio.nextInt(abecedario.length()));
                    }

                    waitEnterKey();
                    break;

                case 4:
                    printBorde(44);
                    System.out.println(opt +".  Ordenar vector mediante uso de Inserción");
                    printBorde(44);
                    //CÓDIGO AQUÍ

                    waitEnterKey();
                    break;

                case 5:
                    printBorde(44);
                    System.out.println(opt +".  Ordenar vector mediante uso de ShellSort");
                    printBorde(44);
                    //CÓDIGO AQUÍ

                    waitEnterKey();
                    break;

                case 6:
                    printBorde(44);
                    System.out.println(opt +".  Ordenar vector mediante uso de QuickSort");
                    printBorde(44);
                    //CÓDIGO AQUÍ

                    waitEnterKey();
                    break;

                default:
                    System.out.print("¡Opción inválida!");
                    System.out.print("Intente nuevamente");
                    waitEnterKey();
                    break;
            }

        } while(opt != 0);


        System.out.println("");
        return 0;
    }


    public int startGUI() {
        //Este parece ser un buen lugar para comenzar a practicar JavaFX...
        return 1;
    }


}
