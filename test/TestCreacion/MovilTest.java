/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Movil;
import excepciones.MovilNoEncontradoExeption;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class MovilTest {
    
    GestionHospital gh= new GestionHospital();
    
    public MovilTest(){
    }
    
@Test 
    public void CrearMovil (){
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        assertEquals(mv.getMarca(),"Toyota");
    }
    
@Test 
    public void EliminarMovil () throws MovilNoEncontradoExeption{
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        gh.AltaMovil(mv);
        gh.bajaMovil(mv);
        assertEquals(gh.buscarMovil(mv.getPatente()),mv);
    }
    
@Test
    public void BuscarMovil (){
        Movil mv = new Movil ("Toyota", "Hilux", "AAA123", 2015);
        String patente = "AAA123";
        assertEquals (mv.getPatente(), patente);
    }
}
