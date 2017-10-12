package ar.edu.iua;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arreglo<T extends Comparable<? super T>> {

    private List<T> arreglo;
/*
    public Arreglo(String dataType, int size){
        switch(dataType) {
            case "Double":
                arreglo = new ArrayList<T>();
                break;

            case "Integer":
                arreglo = new ArrayList<T>();
                break;

            case "String":
                arreglo = new ArrayList<T>();
                break;
        }
        initArreglo(dataType, 25);
    }


    public String initArreglo(String dataType, int min){
        Random aleatorio = new Random();
        String salida = "Inicialización del arreglo con ";
        switch(dataType) {
            case "Integer":
                salida += "enteros aleatorios: ";
                int i=0;
                for(T arreglo : arreglo) {
                    i++;
                    salida += i + 1 + " ... ";
                    arreglo[i] = aleatorio.nextInt(arreglo.length());
                }
                break;

            case "Double":
                salida += "reales aleatorios: ";
                for(int i=0; i<arreglo.length; i++) {
                    salida += i + 1 + " ... ";
                    arreglo[i] = Math.random()*(min-20*min)+20*min;
                }
                break;

            case "String":
                salida += "caracteres aleatorios: ";
                String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                for(int i=0; i<arreglo.length; i++) {
                    salida += i + 1 + " ... ";
                    arreglo[i] = abecedario.charAt(aleatorio.nextInt(abecedario.length()));
                }
                break;

        }
        salida += "\nlisto!";
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
*/
}
