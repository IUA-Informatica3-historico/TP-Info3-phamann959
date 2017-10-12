package ar.edu.iua;

public class IntArray {
    private int[] arreglo;

    public IntArray(int size){
        arreglo = new int[size];
        initArreglo(25);
    }

    public IntArray(int size, int min){
        arreglo = new int[size];
        initArreglo(min);
    }

    public IntArray(int size, int min, int max){
        arreglo = new int[size];
        initArreglo(min, max);
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

}
