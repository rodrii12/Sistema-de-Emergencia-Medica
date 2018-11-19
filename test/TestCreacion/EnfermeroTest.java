/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Administrativo;
import clasessimples.Enfermero;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */
public class EnfermeroTest {
GestionHospital gh= new GestionHospital();

    public EnfermeroTest() {
    }
    
    @Test
    public void CrearEnfermero(){
                Enfermero enfer = new Enfermero(4587, "Nahuel", "Carrizo", 12345678, "Masculino", LocalDate.of(1990, 12, 25));
                assertEquals(enfer.getNombre(),"Nahuel");

    }
 
     @Test
     public void EliminarEnfermero() {

        Enfermero enfer = new Enfermero(4587, "Nahuel", "Carrizo", 12345678, "Masculino", LocalDate.of(1990, 12, 25));
        gh.bajaEnfermero(enfer);
        
       
     }
    
 @Test
 
 public void BuscarEnfermero(){

        Enfermero enfer = new Enfermero(4587, "Nahuel", "Carrizo", 12345678, "Masculino", LocalDate.of(1990, 12, 25));
//        gh.buscarAdmin(39998674);
        assertEquals(enfer.getDNI(), new Integer (12345678));
     
 }

 @Test
 public void ValidarEnfermero(){
                Enfermero enfer = new Enfermero(4587, "Nahuel", "Carrizo", 12345678, "Masculino", LocalDate.of(1990, 12, 25));
        gh.validarDniEnfer(39998674);
 }
            
}
