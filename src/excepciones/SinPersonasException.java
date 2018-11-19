/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author FRANCO
 */
public class SinPersonasException extends Exception{

    public SinPersonasException() {
         super();
    }
    
     public SinPersonasException(String mensaje){
        super(mensaje);
    }
    
}
