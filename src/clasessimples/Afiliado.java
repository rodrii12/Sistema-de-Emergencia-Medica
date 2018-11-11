package clasessimples;

import clasessimples.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.text.DateFormatter;

public class Afiliado extends Persona{
    private Integer numeroAfiliado;
    private ArrayList<Persona> grupoFamiliar;
    private LocalDate fechaDePago;
    private Boolean pago;

    public Afiliado(Integer numeroAfiliado, String Nombre, String apellido, Integer DNI, String sexo, LocalDate FechaNacimiento, LocalDate fechaDePago) {
        super(Nombre, apellido, DNI, sexo, FechaNacimiento);
        this.numeroAfiliado = numeroAfiliado;
        this.fechaDePago = fechaDePago;
        this.pago= true;
        //ABONO HABILITADO ES LA VARIABLE PARA SABER SI ESTA PAGO EL ABONO DEL AFILIADO
    }

    public Boolean getAbonoHabilitado() {
        return pago;
    }

    public void setAbonoHabilitado(Boolean pago) {
        this.pago = pago;
    }

    public Integer getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(Integer numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }   

    public ArrayList<Persona> getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(ArrayList<Persona> grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    
}
