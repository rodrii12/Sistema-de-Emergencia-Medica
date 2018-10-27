package sistema.de.emergencia.medica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author FRANCO
 */
public class Afiliado extends Persona{
    private Integer numeroAfiliado;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private int edad;

    public Afiliado(Integer numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }
    public Afiliado() {
    }
    public Afiliado(Integer numeroAfiliado, String nombre, String apellido, String sexo, String dni, String direccion, int dia,int mes,int ano) {
        super(nombre, apellido, sexo, dni, direccion);
        this.numeroAfiliado = numeroAfiliado;
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
    }

    public Integer getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(Integer numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }
    
        public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anoAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anoNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if (anoNac <= anoAc){
            if (mesNac <= mesAc){
                if (diaNac <= diaAc)
                    edad = anoAc - anoNac;
                else 
                    edad = anoAc - anoNac -1;
            }else
                edad = anoAc - anoNac -1;
        }else
            System.out.println("Error de Fecha de nacimiento");   
        return edad;
    }
      public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }
        @Override
        
    public String toString(){
        String afiliado = "Afiliado: " + getNombre() + " " +getApellido() + "\nSexo: " + getSexo() + "\nDNI N° :" + getDni() + "\nDireccion: " + getDireccion() + "\nFecha de Nacimiento: " + getFechaDeNaciemiento() + "\nEdad: " + calcularEdad();
        return afiliado;
    }
}
