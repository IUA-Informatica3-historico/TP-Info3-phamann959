package ar.edu.iua;

import javax.management.RuntimeErrorException;

import static java.lang.Math.abs;

public class Producto {
    private int resultado;

    public Producto() {
        resultado = 0;
    }

    public int getProductoIterativo(int num1, int num2) {
        if(num1 == 0 || num2 == 0)
            return 0;

        resultado=0;
        for(int i=0; i<abs(num2); i++) {
            resultado += abs(num1);
        }

        if( (num1>0 && num2<0) || (num1<0 && num2>0))
            return -resultado;
        return resultado;
    }

    public int getProductoRecursivo(int num1, int num2) throws Exception {
        if(num1 == 0 || num2 == 0)
            return 0;
        else {
            if (num1 > 0 && num2 > 0)
                return  (num1 + getProductoRecursivo(num1, num2-1));

            if (num1 > 0 && num2 < 0)
                return -(num1 - getProductoRecursivo(num1, num2+1));

            if (num1 < 0 && num2 > 0)
                return -(-num1 - getProductoRecursivo(num1, num2-1));

            if (num1 < 0 && num2 < 0)
                return  (-num1 + getProductoRecursivo(num1, num2+1));

        throw new Exception("Error al detectar signos de números");
        }

    }
}
