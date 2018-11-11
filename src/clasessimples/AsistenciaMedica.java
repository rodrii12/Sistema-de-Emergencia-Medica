
package clasessimples;

import clasessimples.Enfermero;
import clasessimples.Movil;
import java.time.LocalDate;


public class AsistenciaMedica {
    
    private Afiliado afiliado;
    private Movil movil;
    private LocalDate fecha;
    private Enfermero enfermero;
    private Doctor dotor;
    private Chofer chofer;

    public AsistenciaMedica(Afiliado afiliado, Movil movil, LocalDate fecha, Enfermero enfermero, Doctor dotor, Chofer chofer) {
        this.afiliado = afiliado;
        this.movil = movil;
        this.fecha = fecha;
        this.enfermero = enfermero;
        this.dotor = dotor;
        this.chofer = chofer;
    }    

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    public Doctor getDotor() {
        return dotor;
    }

    public void setDotor(Doctor dotor) {
        this.dotor = dotor;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
    
    
}
