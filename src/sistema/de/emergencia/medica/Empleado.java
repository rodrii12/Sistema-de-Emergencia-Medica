
package sistema.de.emergencia.medica;

public class Empleado extends Persona{
    private Integer numeroEmpleado;

    public Empleado(Integer numeroEmpleado, String nombre, String apellido, boolean sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.numeroEmpleado = numeroEmpleado;
    }




    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

}
