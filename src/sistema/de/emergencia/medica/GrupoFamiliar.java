package sistema.de.emergencia.medica;

public class GrupoFamiliar extends Persona{
    private String vinculo;

    public GrupoFamiliar(String vinculo, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.vinculo = vinculo;
    }

    
    public String getVinculo() {
        return vinculo;
    }

    
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    
    
}
