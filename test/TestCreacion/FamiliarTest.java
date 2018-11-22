/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCreacion;

import clasessimples.Afiliado;
import clasessimples.Familiar;
import excepciones.PersonaNoEncontradaException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
@Test
    public void BuscarFamiliar() throws PersonaNoEncontradaException{
            Familiar fa = new Familiar ("Maria", "Nieva", 23715946, "Femenino", LocalDate.of(2004,07,24), "Hijo");
            Afiliado afi = new Afiliado(2506, "Franco", "Carrizo", 39998673, "Masculino", LocalDate.of(1997,06,25),LocalDate.of(2018, 11, 14));
            afi.agregarFamiliar(fa);
            gh.altaAfiliado(afi);
            //gh.buscarAfiliado(afi.getDNI()).buscarFamiliar(fa.getDNI());
            assertEquals(gh.buscarAfiliado(afi.getDNI()).buscarFamiliar(fa.getDNI()), fa);
        }
}
