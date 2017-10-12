package ar.edu.iua;

public class Potencia {

    private String stepByStep;

    Potencia() {
        stepByStep="";
    }


    public double getPower(double base, int exponente) {

        if(exponente==0)
            return 1;
        else
            return base*getPower(base,exponente-1);
    }


    public String doPowerSbS(double base, int exponente) {
        String init = "[" +base +"]^" +exponente +"  =  ";
        stepByStep = init;

        double resultado=1;

        for(int i=1; i<=exponente; i++) {
            resultado = resultado*base;
            for(int j=exponente-1; j>=exponente-i; j--) {
                stepByStep += "[" +base +"] * ";
            }
            stepByStep += "[" +base +"]^" +(exponente-i) + "\n" +init;
        }
        stepByStep += resultado;

        return stepByStep;
    }

}
