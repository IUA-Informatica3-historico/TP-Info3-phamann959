package ar.edu.iua;


public class Ordenamiento<T extends Comparable<T>> {


    /** Método de ordenamiento insertionSort
     * En el peor de los casos, el tiempo de ejecución en O(n^2).
     * En el mejor caso (cuando el array ya está ordenado), el tiempo de ejecución es O(n).
     * @param a vector de números enteros
     */
    public void insertionSortInt(T []a) {

        //Se comienza por el segundo elemento
        for(int p = 1; p<a.length; p++) {
            T tmp = a[p]; //se almacena el segundo elemento
            int j = p;

            //Mientras queden posiciones y el valor de tmp sea menor que los de la izquierda se desplaza a al derecha
            for( ; j>0 && tmp.compareTo(a[j-1])<0; j-- )
                a[j] = a[j-1];
            a[j] = tmp; //aux de vuelta a su sitio
        }

        //Fin del método de Inserción rápida
    }

}
