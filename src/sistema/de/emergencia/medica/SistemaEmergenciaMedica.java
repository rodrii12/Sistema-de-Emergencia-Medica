
package sistema.de.emergencia.medica;


import clasessimples.Afiliado;
import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Enfermero;
import clasessimples.Movil;
import interfazGrafica.PrincipalMenu;
import java.time.LocalDate;
import java.time.Month;


public class SistemaEmergenciaMedica {

    
    public static void main(String[] args) {
        
        //LocalDate fecha1= LocalDate.of(2017, 5, 15);
        //LocalDate fecha2= LocalDate.of(2017, 5 ,17);
        //ChronoUnit.DAYS.between(fecha1, fecha2);
        GestionHospital gh= new GestionHospital();
        Afiliado afi = new Afiliado(1313, "Miguel", "Cejas", 40724994, "Masculino", LocalDate.of(1998,05,13),LocalDate.of(2018, 11, 11));
        Movil mv = new Movil("AUDI", "TT", "XXX123", 2018);
        gh.AltaMovil(mv);
        Doctor doctor = new Doctor(1111, "Raul", "asd", 11111111, "Masculino", LocalDate.of(1998, 05, 13));
        Chofer chofer = new Chofer(2222, "marito", "cabeza", 22222222, "Masculino", LocalDate.of(1998, 06, 13));
        Enfermero enfer = new Enfermero(3333, "andres", "casd", 33333333, "Femenino", LocalDate.of(1992, 12, 25));
        
        gh.altaDoctor(doctor);
        gh.altaAfiliado(afi);
        gh.altaChofer(chofer);
        gh.altaEnfermero(enfer);
        gh.altaAfiliado(afi);
        PrincipalMenu ventanaPrincipal= new PrincipalMenu(gh);
        
        
        

    }
    
}
