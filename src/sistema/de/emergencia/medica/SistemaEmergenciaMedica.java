
package sistema.de.emergencia.medica;

import Interfaces_Graficas.Principal;
import interfazGrafica.PrincipalMenu;


public class SistemaEmergenciaMedica {

    
    public static void main(String[] args) {
        
        //LocalDate fecha1= LocalDate.of(2017, 5, 15);
        //LocalDate fecha2= LocalDate.of(2017, 5 ,17);
        //ChronoUnit.DAYS.between(fecha1, fecha2);
        GestionHospital gh= new GestionHospital();
        PrincipalMenu ventanaPrincipal= new PrincipalMenu(gh);
        
        
        //Principal p1 =new Principal();
        
        //p1.setVisible(true);//mostrar ventana
    }
    
}
