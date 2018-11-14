/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;


import clasessimples.Doctor;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */
public class DoctorTest {
GestionHospital gh= new GestionHospital();

    public DoctorTest() {
    }
    @Test
         public void crearDoctor() {
             
                Doctor doctor = new Doctor(1111, "Franco", "Carrizo", 11111111, "Masculino", LocalDate.of(1997, 06, 25)); 
                assertEquals(doctor.getNombre(),"Nicolas");
     }
         
                  
     @Test
     public void EliminarDoctor() {

                Doctor doctor = new Doctor(1111, "Franco", "Carrizo", 11111111, "Masculino", LocalDate.of(1997, 06, 25));   
                gh.bajaDoctor(doctor);
        
     }
    
 @Test
 
 public void BuscarDoctor(){

                Doctor doctor = new Doctor(1111, "Franco", "Carrizo", 11111111, "Masculino", LocalDate.of(1997, 06, 25));   
        gh.buscarDoctor(11111111);
        assertEquals(doctor.getDNI(), new Integer (11111111));
     
 }

 @Test
 public void ValidarDoctor(){
                Doctor doctor = new Doctor(1111, "Franco", "Carrizo", 11111111, "Masculino", LocalDate.of(1997, 06, 25));   
        gh.validarDniEnfer(11111111);
        
 }
    
}
