package ar.edu.iua;

public class Factorial {

    private double factorial;

    public Factorial() {
        factorial=1;
    }


    public double getFactorial(int num) {
        factorial=1;
        while (num!=0) {
            factorial=factorial*num;
            num--;
        }

        return factorial;
    }


    /*
     * Este método calcula el factorial y va mostrando
     * lo realizado paso a paso
     * @param num es el valor al cual se le calculará el factorial
     * @return string Retorna el paso a paso.
     */
    public String doFactorialSbS(int num) {
        factorial=1;
        int i;
        String stepByStep;

        stepByStep = "El factorial de " +num +" es: ";
        for(i=num; i>0; i--) {
            stepByStep += i +"*";
        }

        stepByStep += "\b" +"\n";

        while (num!=0) {
            stepByStep += "Pasada " +i +":\t";
            stepByStep += factorial +" * " +num;

            factorial=factorial*num;

            stepByStep += "  =  " +factorial +"\n";

            num--;
            i++;
        }

        return stepByStep;
    }


}
