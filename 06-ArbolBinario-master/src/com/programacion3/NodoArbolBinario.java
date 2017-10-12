package com.programacion3;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

class NodoArbolBinario<T extends Comparable> {
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    private T dato;
    private NodoArbolBinario<T> izq;
    private NodoArbolBinario<T> der;

    public NodoArbolBinario(T d) {
        dato = d;
        izq = null;
        der = null;
    }

    public void insert(T d) {
        if (dato.compareTo(d) > 0) {
            if (izq == null)
                izq = new NodoArbolBinario<T>(d);
            else
                izq.insert(d);
        } else {
            if (der == null)
                der = new NodoArbolBinario<T>(d);
            else
                der.insert(d);
        }
    }

    public void insert(NodoArbolBinario<T> nodo) {
        if (dato.compareTo(nodo.getDato()) > 0) {
            if (izq == null)
                izq = nodo;
            else
                izq.insert(nodo);
        } else {
            if (der == null)
                der = nodo;
            else
                der.insert(nodo);
        }
    }

    public NodoArbolBinario<T> delete(T d) throws Exception {
        int comp = dato.compareTo(d);
        if (comp < 0) {
            if (der != null)
                der = der.delete(d);
            else
                throw new Exception("No se encontró");
        } else if (comp > 0) {
            if (izq != null)
                izq = izq.delete(d);
            else
                throw new Exception("No se encontró");
        } else {
            if (der != null) {
                der.insert(izq);
                return der;
            } else {
                return izq;
            }
        }
        return this;
    }

    public void preorder() {
        System.out.print(dato.toString() + " ");
        if (izq != null)
            izq.preorder();
        if (der != null)
            der.preorder();
    }

    public void inorder() {
        if (izq != null)
            izq.inorder();
        System.out.print(dato.toString() + " ");
        if (der != null)
            der.inorder();
    }

    public void postorder() {
        if (izq != null)
            izq.postorder();
        if (der != null)
            der.postorder();
        System.out.print(dato.toString() + " ");
    }

    public void print(boolean esDerecho, String identacion) {
        if (der != null) {
            der.print(true, identacion + (esDerecho ? "     " : "|    "));
        }
        System.out.print(identacion);
        if (esDerecho) {
            System.out.print(" /");
        } else {
            System.out.print(" \\");
        }
        System.out.print("-- ");
        System.out.println(dato);
        if (izq != null) {
            izq.print(false, identacion + (esDerecho ? "|    " : "     "));
        }
    }
}
