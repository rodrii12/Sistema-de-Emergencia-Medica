/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Administrativo;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */
public class AdministrativoTest {

    public AdministrativoTest() {
    }
    GestionHospital gh= new GestionHospital();
@Test
    public void CrearAdministrativo(){
        Administrativo ad = new Administrativo(8957,"Juanito", "Alcachofa",39998674, "Masculino",LocalDate.of(1990, 12, 25));
        
         assertEquals(ad.getNombre(),"Juanito");
           
}
    
 
     @Test
     public void EliminarAdministrativo() {

          Administrativo ad = new Administrativo(8957,"Juanito", "Alcachofa",39998674, "Masculino",LocalDate.of(1990, 12, 25));
        gh.bajaAdmin(ad);
        
       
     }
    
 @Test
 
 public void BuscarAdministrativo(){

        Administrativo ad = new Administrativo(8957,"Juanito", "Alcachofa",39998674, "Masculino",LocalDate.of(1990, 12, 25));
        gh.buscarAdmin(39998674);
        assertEquals(ad.getDNI(), new Integer (39998672));
     
 }

 @Test
 public void ValidarAdministrativo(){
        Administrativo ad = new Administrativo(8957,"Juanito", "Alcachofa",39998674, "Masculino",LocalDate.of(1990, 12, 25));
        gh.validarDniEnfer(39998674);
 }
    
}
