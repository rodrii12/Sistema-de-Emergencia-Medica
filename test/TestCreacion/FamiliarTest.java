/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Familiar;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class FamiliarTest {
    
    GestionHospital gh = new GestionHospital();
    
    public FamiliarTest(){
       
    }
    
@Test
    public void CrearFamiliar(){
        Familiar fa = new Familiar ("Maria", "Nieva", 23715946, "Femenino", LocalDate.of(2004,07,24), "Hijo");
        assertEquals(fa.getNombre(),"Maria");
    }
    
/*@Test
    public void EliminarFamiliar(){
        Familiar fa = new Familiar ("Maria", "Nieva", 23715946, "Femenino", LocalDate.of(2004,07,24), "Hijo");
        gh.altaAfiliado(fa);
        
    }*/
}
