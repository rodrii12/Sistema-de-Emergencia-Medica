/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Chofer;
import excepciones.PersonaNoEncontradaException;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class ChoferTest {
    
    GestionHospital gh = new GestionHospital();
    
    public ChoferTest (){   
    }

@Test 
    public void CrearChofer () {
        Chofer ch = new Chofer (4561, "Manuel", "Gomez", 42698513, "Masculino", LocalDate.of(1978,07,20));
        assertEquals (ch.getNombre(),"Manuel");
    }

@Test
    public void EliminarChofer () throws PersonaNoEncontradaException{
        Chofer ch = new Chofer (4561, "Manuel", "Gomez", 42698513, "Masculino", LocalDate.of(1978,07,20));
        gh.altaChofer(ch);
        gh.bajaChofer(ch);
        assertEquals (gh.buscarChofer(ch.getDNI()),ch);
    }
    
@Test
    public void BuscarChofer () throws PersonaNoEncontradaException{
        Chofer ch = new Chofer (4561, "Manuel", "Gomez", 42698513, "Masculino", LocalDate.of(1978,07,20));
        gh.altaChofer(ch);
        gh.buscarChofer(ch.getDNI());
        assertEquals (gh.buscarChofer(ch.getDNI()),ch);
    }
    
@Test
    public void ValidarChofer(){
        Chofer ch = new Chofer (4561, "Manuel", "Gomez", 42698513, "Masculino", LocalDate.of(1978,07,20));
        gh.altaChofer(ch);
        assertEquals (gh.validarDni(ch.getDNI()), false);
    }
}
