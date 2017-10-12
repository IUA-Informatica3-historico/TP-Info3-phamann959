package ar.edu.iua;

public class Arreglo {
    private int[] arreglo;


    public Arreglo(int size){
        arreglo = new int[size];
    }


    public String initArreglo(int min){
        String salida = "Inicialización del arreglo con valores aleatorios...\n";
        for(int i=0; i<arreglo.length; i++) {
            salida += i + 1 + " ... ";
            arreglo[i] = (int) (Math.random()*(min-20*min)+20*min);
        }
        return salida;
    }

    public String initArreglo(int min, int max){
        String salida = "Inicialización del arreglo con valores aleatorios...\n";
        for(int i=0; i<arreglo.length; i++) {
            salida += i + 1 + " ... ";
            arreglo[i] = (int) (Math.random()*(min-max)+max);
        }
        return salida;
    }


    public String initArreglo(){
        String salida = "Inicialización del arreglo con valores aleatorios...\n";
        for(int i=0; i<arreglo.length; i++) {
            salida += i + 1 + " ... ";
            arreglo[i] = (int) (Math.random()*(10-50)+50);
        }
        return salida;
    }

    public int getSize() {
        return arreglo.length;
    }

    public int getSize(boolean humanFormat){
        if(humanFormat)
            return arreglo.length;
        return arreglo.length-1;
    }

    public int[] getArregloNormal() {
        return arreglo;
    }


    public int[] getArregloInvertido() {
        int[] aux = new int[arreglo.length];

        for(int i=0, j=arreglo.length-1; i<arreglo.length; i++, j--) {
            aux[i] = arreglo[j];
        }

        return aux;
    }


    public void invertirArregloIterativo() {
        int[] aux = arreglo.clone();

        for(int i=0, j=arreglo.length-1; i<arreglo.length; i++, j--) {
            arreglo[i] = aux[j];
        }
    }


    public int[] invertirArregloRecursivo(int limInf, int limSup) {
        while (limInf <= limSup) {
            int tmp = arreglo[limSup];
            arreglo[limSup] = arreglo[limInf];
            arreglo[limInf] = tmp;
            return invertirArregloRecursivo(limInf+1, limSup-1);
        }
        return arreglo;
    }


    @Override
    public String toString() {
        String salida = "";
        for(int i=0; i<arreglo.length; i++)
            salida += arreglo[i] +";";

        return salida;
    }
}
