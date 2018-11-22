/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Enfermero;
import excepciones.PersonaNoEncontradaException;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class EnfermeroTest {
    
    GestionHospital gh = new GestionHospital();
    
    public EnfermeroTest (){
    }
    
@Test
    public void CrearEnfermero(){
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        assertEquals(en.getNombre(), "Hector");
    }
    
@Test
    public void EliminarEnfermero() throws PersonaNoEncontradaException{
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        gh.altaEnfermero(en);
        gh.bajaEnfermero(en);
        assertEquals(gh.buscarEnfermero(en.getDNI()), null);
    }
    
@Test
    public void BuscarEnfermero() throws PersonaNoEncontradaException{
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        gh.altaEnfermero(en);
        gh.buscarEnfermero(en.getDNI());
        assertEquals(gh.buscarEnfermero(en.getDNI()),en);
    }
    
@Test
    public void ValidarEnfermero(){
        Enfermero en = new Enfermero(5416, "Hector", "Perea", 20681379, "Masculino", LocalDate.of(1993,05,04));
        gh.altaEnfermero(en);
        assertEquals(gh.validarDni(en.getDNI()), false);
    }
}
