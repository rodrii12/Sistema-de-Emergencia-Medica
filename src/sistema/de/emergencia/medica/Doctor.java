package sistema.de.emergencia.medica;

public class Doctor extends Empleado{

    public Doctor(Integer numeroEmpleado, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(numeroEmpleado, nombre, apellido, sexo, dni, direccion);
    }
    
    
    @Override
    public String toString(){
        String doctor = getNombre() +" " +getApellido() +"- MPN° "+getNumeroEmpleado();
        return doctor;
    }

    

}
