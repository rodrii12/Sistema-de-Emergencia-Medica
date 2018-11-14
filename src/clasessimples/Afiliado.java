package clasessimples;

import clasessimples.Persona;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.text.DateFormatter;

public class Afiliado extends Persona{
    private Integer numeroAfiliado;
    private ArrayList<Familiar> grupoFamiliar = new ArrayList<Familiar>();
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

    public ArrayList<Familiar> getGrupoFamiliar() {
        return grupoFamiliar;
    }

    public void setGrupoFamiliar(ArrayList<Familiar> grupoFamiliar) {
        this.grupoFamiliar = grupoFamiliar;
    }

    public LocalDate getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(LocalDate fechaDePago) {
        this.fechaDePago = fechaDePago;
    }
    
    public void agregarFamiliar(Familiar f){
        grupoFamiliar.add(f);
    }
    
    public Familiar buscarFamiliar(Integer dni){
        Familiar fami = null;
        for(Familiar i: grupoFamiliar){
            if(Objects.equals(i.getDNI(), dni)){
            fami = i;
            break;
            }
        }
    return fami;    
    }
    
    public boolean validarDni(Integer dni){
        Boolean estado = false;
        //recorro la lista de familiares
            for (Familiar i : grupoFamiliar) {
                //if (a.getDNI().equals(dni)) {
                    if(Objects.equals(i.getDNI(), dni)){
                    estado = true;
                }
            }
            return estado;
        }
     
    public void mostrarPrimerFamiliar(){
        try {
        System.out.println(grupoFamiliar.get(0).getNombre());    
        } catch (Exception e) {
        }
    }
}
