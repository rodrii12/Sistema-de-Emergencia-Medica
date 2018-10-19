
package sistema.de.emergencia.medica;

public class Empleado extends Persona implements GestionDatos{
    private Integer numeroEmpleado;

    public Empleado(Integer numeroEmpleado, String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.numeroEmpleado = numeroEmpleado;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    
    @Override
    public void gestionarDatos() {
       
        
    }
}
