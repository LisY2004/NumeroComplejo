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
public class numeroComplejos {
       private int real;
       private int imaginario;
       
    public void cargar(String numero) {
       
      String[] partes = numero.split("(?=[-+])|i");

       if (partes.length == 2 || partes.length == 3) {
            
        this.real = Integer.parseInt(partes[0].trim());
       
            if ("-".equals(partes[1]) && partes.length > 2) {
                this.imaginario = -1 * Integer.parseInt(partes[2].trim());
            }else {
                    this.imaginario = Integer.parseInt(partes[1].trim());
            }}
            else 
            {
            throw new IllegalArgumentException("Formato de número complejo inválido");
       }
    }

    public String suma(numeroComplejos numero) {
        int sumaReal = this.real + numero.real;
        int sumaImaginaria = this.imaginario + numero.imaginario;
        if(sumaImaginaria >= 0){
                return sumaReal + "+" + sumaImaginaria + "i";
        }else{
                return sumaReal + "" + sumaImaginaria + "i";
        }
    }
       
    public String mostrar(){
        
        if(imaginario >= 0){
                return real+" + "+ imaginario + "i";
        }else{
                 return real+""+ imaginario + "i";
        }
    }
}
