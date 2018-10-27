
package sistema.de.emergencia.medica;

import java.util.ArrayList;

/**
 *
 * @author FRANCO
 */
public class Hospital {
    //private ArrayList<Afiliado> afiliado =  new ArrayList<Afiliado>();
    //private ArrayList<GrupoFamiliar> familiares=  new ArrayList<GrupoFamiliar>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Administrativo> administrativos =  new ArrayList<Administrativo>();
    private ArrayList<Enfermero> enfermeros =  new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes =  new ArrayList<Chofer>();

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(ArrayList<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public void setChoferes(ArrayList<Chofer> choferes) {
        this.choferes = choferes;
    }
    
}
