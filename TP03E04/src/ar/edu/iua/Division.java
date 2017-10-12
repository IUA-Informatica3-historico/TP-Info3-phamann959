package ar.edu.iua;

import static java.lang.Math.abs;

public class Division {
    private int resultado;
    private int[] division; //pos-0: resultado | pos-1: resto

    public Division() {
        resultado = 0;
        division = new int[]{0,0};
    }


    public int[] getDivisionIterativa(int num, int divisor) {
        division[0]=0;
        division[1]=0;

        if(num == 0) {
            return division;
        }

        if(divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        for(int i=abs(num); i>=abs(divisor); i-=abs(divisor)) {
            division[0] ++;
            division[1] = i-abs(divisor);
        }

        /*
        division[0] = abs(num);
        for(int i=0; i<=abs(num); i+=abs(divisor)) {
            division[0] --;
            division[1] = i+abs(divisor)-abs(num);
        }
         */

        if( (num>0 && divisor<0) || (num<0 && divisor>0)){
            division[0]=-division[0];
        }

        return division;
    }


    public int[] getDivisionRecursiva(int num, int divisor) {

        if(num == 0) {
            division[0]=0;
            division[1]=0;
            return division;
        }

        if(num == divisor) {
            division[0]=1;
            division[1]=0;
            return division;
        }

        if(num == -divisor) {
            division[0]=-1;
            division[1]=0;
            return division;
        }

        if(divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        if(divisor == 1) {
            division[0]=num;
            division[1]=0;
            return division;
        }

        if(abs(num) < abs(divisor)) {
            division[0]=0;
            division[1]=abs(num);
            return division;
        }

        if (num > 0 && divisor > 0) {
            division[0] = getDivisionRecursiva(num - divisor, divisor)[0] + 1;
            return division;
        }

        if (num > 0 && divisor < 0) {
            division[0] = getDivisionRecursiva(num + divisor, divisor)[0] - 1;
            return division;
        }

        if (num < 0 && divisor > 0) {
            division[0] = -getDivisionRecursiva(num + divisor, divisor)[0] - 1;
            return division;
        }

        if (num < 0 && divisor < 0) {
            division[0] = getDivisionRecursiva(num - divisor, divisor)[0] + 1;
            return division;
        }

        throw new ArithmeticException("Error de detección de signos");
    }

}
