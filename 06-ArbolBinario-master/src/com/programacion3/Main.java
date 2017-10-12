package com.programacion3;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArbolBinario<Integer> ar = new ArbolBinario<>();

        ar.insert(4);
        ar.insert(2);
        ar.insert(1);
        ar.insert(3);
        ar.insert(6);
        ar.insert(5);
        ar.insert(7);

        ar.inorder();
        System.out.println(" ");
        ar.print();
    }
}
