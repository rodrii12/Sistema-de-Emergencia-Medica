
package sistema.de.emergencia.medica;

import java.util.ArrayList;

/**
 *
 * @author FRANCO
 */
public class Hospital {
    private ArrayList<Afiliado> afiliado =  new ArrayList<Afiliado>();
    private ArrayList<GrupoFamiliar> familiares=  new ArrayList<GrupoFamiliar>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Administrativo> administrativos =  new ArrayList<Administrativo>();
    private ArrayList<Enfermero> enfermeros =  new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes =  new ArrayList<Chofer>();

    public ArrayList<Afiliado> getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(ArrayList<Afiliado> afiliado) {
        this.afiliado = afiliado;
    }

    public ArrayList<GrupoFamiliar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<GrupoFamiliar> familiares) {
        this.familiares = familiares;
    }

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
    
    
        public void addAfiliado(Afiliado afi){
        
        afiliado.add(afi);
        
    }
    
        public boolean validarDni(String dni){
        
            //recorro la lista de afiliados
            for (Afiliado a : afiliado) {
                if (a.getDni().equals(dni)) {
                    return true;
                }
            }
            return false;
    }
    public Afiliado buscarDni(String dni){
            for (Afiliado a : afiliado) {
                if (a.getDni().equals(dni)) {
                    return a;
                }
            }
            return null;
    }
    
    public boolean deleteAfiliado( String dni){
            for (int i=0; i<afiliado.size();i++) {
                if (afiliado.get(i).getDni().equals(dni)) {
                afiliado.remove(i);
                return true;
                }
            }
            return false;
    
    }
}
