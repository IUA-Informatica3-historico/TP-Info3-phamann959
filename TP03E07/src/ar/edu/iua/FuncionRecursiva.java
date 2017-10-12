package ar.edu.iua;

public class FuncionRecursiva {

    private String cadena;

    public FuncionRecursiva() {
        cadena = "";
    }


    public String getNumbersSeparatedBySpaces(int num) {
        //La condición de salida para la recursividad
        if(num == 0) {
            String tmp;
            if(cadena.length() == 0)
                tmp = "0";
            else
                tmp = cadena;
            cadena = "";
            return tmp;
        }

        else {
            //Primero, pasamos el entero a un String
            String numStr = String.valueOf(num);

            //Ahora, creamos una variable restar, que se restará al número original
            //El objetivo es ir eliminando -mediante restas-, el primer dígito del número recibido por parámetro
            String restar = ""+numStr.charAt(0);
            int i;
            for(i=1; i<numStr.length(); i++)
                restar += "0";

            //Para el primer caracter, no hay espacio. Pero a partir de ahí,
            // se van insertando pares "espacio /caracter" cada vez
            if(cadena.length() == 0)
                cadena += numStr.charAt(0);
            else
                cadena += " " +numStr.charAt(0);

            //Pero si el dígito siguiente es un cero, éste se descartará cuando
            //el dato pasa de String a int. En este caso, hay que prever como tratar
            //los ceros a la izq., que se descartan cuando el dato es un int
            String largo = String.valueOf(num-Integer.parseInt(restar));
            if(i > largo.length())
                for(int j=1; j<i-largo.length(); j++)
                    cadena += " " +"0";

            //Finalmente, tenemos el caso particular cuando el último dígito de un número
            //distinto de cero, es cero. (Por ejemplo: 1000)
            if(num-Integer.parseInt(restar) == 0  &&  i>1)
                cadena += " " + "0";

            return getNumbersSeparatedBySpaces(num-Integer.parseInt(restar));
        }

        //Fin del método
    }


}
