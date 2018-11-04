package sistema.de.emergencia.medica;

/**
 *
 * @author FRANCO
 */
public class Administrativo extends Empleado{
    private Integer numero;
    
    
    public Administrativo(Integer numeroEmpleado, String nombre, String apellido, boolean sexo, String dni, String direccion) {
        super(numeroEmpleado, nombre, apellido, sexo, dni, direccion);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
}
