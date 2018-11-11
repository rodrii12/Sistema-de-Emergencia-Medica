
package clasessimples;

public class Movil{
    private String marca;
    private String modelo;
    private String patente;
    private Integer año;
    private Boolean disponible; 

    public Movil(String marca, String modelo, String patente, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.año = año;
        disponible = true;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
