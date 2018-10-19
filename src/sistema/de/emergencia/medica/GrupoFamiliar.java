package sistema.de.emergencia.medica;

public class GrupoFamiliar extends Persona{
    private String vinculo;

    public GrupoFamiliar(String vinculo, String Nombre, String apellido, Integer DNI, String sexo, int FechaNacimiento) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.vinculo = vinculo;
    }

    
    public String getVinculo() {
        return vinculo;
    }

    
    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    
    
}
