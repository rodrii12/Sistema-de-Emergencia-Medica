/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Doctor;
import excepciones.PersonaNoEncontradaException;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class DoctorTest {
    
    GestionHospital gh = new GestionHospital();
    
    public DoctorTest(){
    }
    
@Test
    public void CrearDoctor(){
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        assertEquals (d.getNombre(), "Melisa");
    }
    
@Test
    public void EliminarDoctor() throws PersonaNoEncontradaException{
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        gh.altaDoctor(d);
        gh.bajaDoctor(d);
        assertEquals (gh.buscarDoctor(d.getDNI()),d);
    }
    
@Test
    public void BuscarDoctor() throws PersonaNoEncontradaException{
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        gh.altaDoctor(d);
        gh.buscarDoctor(d.getDNI());
        assertEquals(gh.buscarDoctor(d.getDNI()),d);
    }
    
@Test
    public void ValidarDoctor(){
        Doctor d = new Doctor (6179, "Melisa", "Aguirrez", 47103985, "Femenino", LocalDate.of (1989,03,11));
        gh.altaDoctor(d);
        assertEquals(gh.validarDni(d.getDNI()), false);
    }
}
