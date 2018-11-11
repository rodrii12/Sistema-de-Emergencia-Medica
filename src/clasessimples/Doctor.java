package clasessimples;

import java.time.LocalDate;

public class Doctor extends Empleado{
    private Boolean disponible;
    
    public Doctor(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, LocalDate fechaNacimiento) {
        super(numeroEmpleado, Nombre, apellido, DNI, sexo, fechaNacimiento);
        disponible = true;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
    
    
}
