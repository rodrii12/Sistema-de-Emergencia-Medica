package clasessimples;

import java.time.LocalDate;

public class Chofer extends Empleado{
    
    private Boolean disponible;
    
    public Chofer(Integer numeroEmpleado, String nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, nombre, apellido, DNI, sexo, fechaNacimiento);
        this.disponible = true;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    
    
}
