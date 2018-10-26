
package sistema.de.emergencia.medica;

public class Movil implements Registro{
    private String marca;
    private String modelo;
    private String patente;
    private int año;

    public Movil(String marca, String modelo, String patente, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.año = año;
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

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void registrar() {
        
        
    }
   
}
