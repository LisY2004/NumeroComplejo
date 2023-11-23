/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejos;

/**
 *
 * @author labctr
 */
public class NumerosComplejos {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    public static void main(String[] args) {
       numeroComplejos num1 = new numeroComplejos();
       numeroComplejos num2 = new numeroComplejos();

       num1.cargar("7+5i");
       num2.cargar("-8+5i");
       
       System.out.println(       "Primer Numero: " + num1.mostrar());
       System.out.println(       "Segundo Numero: " + num2.mostrar());

       
       String resultadoSuma = num1.suma(num2);
       System.out.println("Resultado de la suma: " + resultadoSuma);
       
    }
    
    
    
}
