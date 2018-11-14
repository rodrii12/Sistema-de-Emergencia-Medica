/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Chofer;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */
public class ChoferTest {
GestionHospital gh= new GestionHospital();
    public ChoferTest() {
    }
   @Test
    public void CrearChofer(){
        Chofer chofer = new Chofer(1254, "Nicolas", "Delgado", 39998672, "Masculino", LocalDate.of(1997, 06, 24));
        assertEquals(chofer.getNombre(),"Nicolas");
        
    }
         
     @Test
     public void EliminarChofer() {

        Chofer chofer = new Chofer(1254, "Nicolas", "Delgado", 39998672, "Masculino", LocalDate.of(1997, 06, 24));
        gh.bajaChofer(chofer);
        
     }
    
 @Test
 
 public void BuscarChofer(){

        Chofer chofer = new Chofer(1254, "Nicolas", "Delgado", 39998672, "Masculino", LocalDate.of(1997, 06, 24));
        gh.buscarAdmin(39998672);
        assertEquals(chofer.getDNI(), new Integer (39998672));
     
 }

 @Test
 public void ValidarChofer(){
        Chofer chofer = new Chofer(1254, "Nicolas", "Delgado", 39998672, "Masculino", LocalDate.of(1997, 06, 24));
        gh.validarDniEnfer(39998672);
        
 }
    
    
    
    
}
