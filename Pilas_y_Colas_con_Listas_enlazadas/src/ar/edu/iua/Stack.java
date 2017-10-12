package ar.edu.iua;

import java.nio.BufferUnderflowException;

//pila
public class Stack<T> {

    private Node<T> top;

    public Stack() {
        top = null;
    }


    /**
     * Indica si la pila está vacía o no
     * @return verdadero o falso, dependiendo del estado de la pila
     */
    public boolean isEmpty() {
        return top == null;
    }


    /**
     * Vacía completamente la pila
     * Usar con cuidado
     */
    public void makeEmpty() {
        top = null;
    }


    /**
     * Inserta un nuevo elemento en la pila
     * @param data es el elemento a insertar
     */
    public void push(T data) {
        Node<T> aux = new Node<T>(data, top);
    }


    /**
     * Obtiene el último elemento insertado en la pila
     * Este método no realiza ninguna modificación en la pila
     * @return el último elemento o dato de la pila
     * @throws Exception si la pila está vacía
     */
    public T top() throws Exception {
        if(null == top)
            throw new Exception("");
        return top.getData();
    }


    /**
     * Remueve el último elemento insertado en la pila
     * @throws Exception si la pila está vacía
     */
    public void pop() throws Exception {
        if(isEmpty())
            throw new Exception("Pila vacía al remover");
        top = top.getNext();
    }


    /**
     * Obtiene el último elemento insertado en la pila
     * Este método modificaca la pila ya que el elemento devuelto
     * es extraído de la pila
     * @return el último elemento o dato de la pila
     * @throws Exception si la pila está vacía
     */
    public T topAndPop() throws Exception {
        if(null == top)
            throw new Exception("Pila vacía en topAndPop");
        T tmp = top.getData();
        top = top.getNext();
        return tmp;
    }


}
