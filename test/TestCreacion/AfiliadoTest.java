/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Afiliado;
import excepciones.PersonaNoEncontradaException;
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
        Afiliado afi = new Afiliado(2506,"Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        assertEquals(afi.getNombre(),"Franco");// PARA VER SI ESTA CREADO EL AFILIADO COMPARO CON EL NOMBRE
     }
   
 @Test
     public void EliminarAfiliado() throws PersonaNoEncontradaException {
       Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
       gh.altaAfiliado(afi);
       gh.bajaAfiliado(afi);
       assertEquals(gh.buscarAfiliado(afi.getDNI()),afi);
     }
    
 @Test
 
 public void BuscarAfiliado() throws PersonaNoEncontradaException{

        Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
        gh.altaAfiliado(afi);
        gh.buscarAfiliado(afi.getDNI());
        assertEquals(gh.buscarAfiliado(afi.getDNI()), afi);//lo pudse para ver si da error
        
     
 }
 @Test
 public void VerificarAbono(){
     Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
     gh.altaAfiliado(afi);
     assertEquals(gh.verificarAbonoAfiliado(afi),true);
    }
}
