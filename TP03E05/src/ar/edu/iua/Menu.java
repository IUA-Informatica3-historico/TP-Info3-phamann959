package ar.edu.iua;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Menu {
    private String ifaceType;


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
        int size;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese tamaño del arreglo (número entero): ");
        size = read.nextInt();
        Arreglo a = new Arreglo(size);
        System.out.print(a.initArreglo()); System.out.println("\n¡listo!");

        return menuCLI(a);

    }


    public int menuCLI(Arreglo a){
        int opt;
        Scanner optRead = new Scanner(System.in);

        do{
            System.out.print("\n\n\n\n");
            printBorde(24, 739);
            printBorde(2, 739, false);
            System.out.print("  MENÚ DE OPCIONES  ");
            printBorde(2, 739, true);
            printBorde(24, 739);
            System.out.println("1.  Mostrar el vector tal cual fue inicializado (orden normal)");
            System.out.println("2.  Mostrar el vector en forma inversa (no modifica el vector actual)");
            System.out.println("3.  Invertir el vector mediante un método iterativo");
            System.out.println("4.  Invertir el vector mediante un método recursivo");
            System.out.println("5.  (Re)Inicializar el vector (contenido actual se descarta)");
            System.out.println("\n0.  Salir\n");
            System.out.print("\t¿Su opción? (0-4): "); opt = optRead.nextInt();
            System.out.println("");

            switch(opt){
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    printBorde(38);
                    System.out.println("1. ARREGLO NORMALIZADO  (ORDEN NORMAL)");
                    printBorde(38);
                    System.out.println("Pos:  Valor");
                    printBorde(11,175);
                    for(int i=0; i<a.getSize(); i++){
                        System.out.println(" " +(i+1) +":  " +a.getArregloNormal()[i]);
                    }

                    waitEnterKey();
                    break;

                case 2:
                    printBorde(37);
                    System.out.println("2. ARREGLO INVERTIDO  (ORDEN REVERSO)");
                    printBorde(37);
                    System.out.println("Pos:  Valor");
                    printBorde(11,175);
                    int[] tmp = a.getArregloInvertido();
                    for(int i=0; i<tmp.length; i++){
                        System.out.println(" " +(i+1) +":  " +tmp[i]);
                    }

                    waitEnterKey();
                    break;

                case 3:
                    printBorde(47);
                    System.out.println("3. INVERTIR VECTOR SOLAMENTE (MÉTODO ITERATIVO)");
                    printBorde(47);
                    a.invertirArregloIterativo();
                    System.out.println("\n¡hecho!");

                    waitEnterKey();
                    break;

                case 4:
                    printBorde(47);
                    System.out.println("4. INVERTIR VECTOR SOLAMENTE (MÉTODO RECURSIVO)");
                    printBorde(47);
                    a.invertirArregloRecursivo(0,a.getSize(false));
                    System.out.println("\n¡hecho!");

                    waitEnterKey();
                    break;

                case 5:
                    printBorde(35);
                    System.out.println("5. RE/INICIALIZAR VECTOR (RESETEAR)");
                    printBorde(35);
                    int min=10, max=50;
                    System.out.println("Valor mínimo: "); min = optRead.nextInt();
                    System.out.println("Valor máximo: "); max = optRead.nextInt();
                    if(abs(min)<abs(max))
                        a.initArreglo(abs(min), abs(max));
                    else
                        a.initArreglo(abs(max), abs(min));

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
