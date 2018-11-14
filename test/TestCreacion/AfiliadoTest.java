/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Afiliado;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */

public class AfiliadoTest {
    
             GestionHospital gh= new GestionHospital();
    public AfiliadoTest() {
    }
   
@Test
     public void crearAfiliado() {
        Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
      
     }
   
 @Test
     public void EliminarAfiliado() {

        
        Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.bajaAfiliado(afi);
       assertEquals(afi.getNombre(),"Franco");
     }
    
 @Test
 
 public void BuscarAfiliado(){

        Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.buscarAfiliado(39998672);
        assertEquals(afi.getDNI(), new Integer (39998672));//lo pudse para ver si da error
        
     
 }
 @Test
 public void VerificarAbono(){
     Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.verificarAbonoAfiliado(afi);
        
 }
 @Test
 public void ValidarAfiliado(){
     Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.validarDni(39998673);
 }
   
@Test
 public void PagarAbono(){
     Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.pagarAbonoAfiliado(afi);
 }
 
}
