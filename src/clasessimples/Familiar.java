package clasessimples;

import java.time.LocalDate;

/**
 *
 * @author Miguel
 */
public class Familiar extends Persona {
    
    private String relacion; 
    
    public Familiar(String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento, String relacion) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.relacion= relacion;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    
    
}
