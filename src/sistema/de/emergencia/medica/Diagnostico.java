package sistema.de.emergencia.medica;

/**
 *
 * @author FRANCO
 */
public class Diagnostico {
    private String tipo;
    private String observacion;
    private String tratamiento;

    public Diagnostico(String tipo, String observacion, String tratamiento) {
        this.tipo = tipo;
        this.observacion = observacion;
        this.tratamiento = tratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
     @Override
    public String toString(){
        String diagnostico = "\nDiagnostico Paciente " + "\nTipo: "+getTipo()+ "\nObservacion: "+getObservacion()+".\nTratamiento: "+getTratamiento();
        return diagnostico;
    }   
    
}
