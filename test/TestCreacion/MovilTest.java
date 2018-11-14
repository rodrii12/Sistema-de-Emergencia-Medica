/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Movil;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author FRANCO
 */
public class MovilTest {
    
    GestionHospital gh= new GestionHospital();

    public MovilTest() {
    }
    
    @Test
    
    public void CrearMovil(){
        Movil mv = new Movil("FORD", "Falcon", "ABC432", 1998);
        assertEquals(mv.getMarca(),"FORD");
    }
 
 @Test
 
    public void BajaMovil(){
        Movil mv = new Movil("FORD", "Falcon", "ABC432", 1998);
        gh.bajaMovil(mv);
    }
 
}
