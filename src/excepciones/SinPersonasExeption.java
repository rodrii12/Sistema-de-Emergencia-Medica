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
public class SinPersonasExeption extends NullPointerException {

    public SinPersonasExeption() {
         super();
    }
    
     public SinPersonasExeption(String mensaje){
        super(mensaje);
    }
    
}
