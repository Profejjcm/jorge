package es.calcularPI;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalcPI {

     public static void main(String[] args) {
         final int NUM_DIG = 10;  // Para sacar la constante seleccionamos el número a extraer, click derecho refactor, introduce, varibale y ahí le ponemos el nombre, publica y que reemplace las otras ocurrencias       
        MathContext mc = new MathContext(NUM_DIG);         
        compute(NUM_DIG, mc);
    }
    //Para sacar el método seleccionamos el códgio que queremos sacar, click derecho refactor, introduce, method, ahi le damos nombre y lo seleccionamos como público.
    public static void compute(final int NUM_DIG, MathContext mc) {
        //meter en el método compute
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(NUM_DIG);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = ClasePadre.piFunction(k, mc);
            //meter en el método piFunction                
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
     
}
