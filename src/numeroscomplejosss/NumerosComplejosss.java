/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejosss;

/**
 *
 * @author labctr
 */
public class NumerosComplejosss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroComplejo num1 = new NumeroComplejo();
        NumeroComplejo num2 = new NumeroComplejo();
        num1.cargar("-6+4i");
        System.out.println("Numero complejo: " + num1.mostrar());
        num2.cargar("-11-1i");
        System.out.println("Numero complejo: " + num2.mostrar());
        String resultadoSuma = num1.suma(num2);
        System.out.println("El resultado es: " + resultadoSuma);
    }
}
