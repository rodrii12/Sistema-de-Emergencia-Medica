
package sistema.de.emergencia.medica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author FRANCO
 */
public class GestionHospital {
    private ArrayList<Afiliado> afiliado =  new ArrayList<Afiliado>();
    private ArrayList<GrupoFamiliar> familiares=  new ArrayList<GrupoFamiliar>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Administrativo> administrativos =  new ArrayList<Administrativo>();
    private ArrayList<Enfermero> enfermeros =  new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes =  new ArrayList<Chofer>();

    public ArrayList<Afiliado> getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(ArrayList<Afiliado> afiliado) {
        this.afiliado = afiliado;
    }

    public ArrayList<GrupoFamiliar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<GrupoFamiliar> familiares) {
        this.familiares = familiares;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(ArrayList<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }

    public void setChoferes(ArrayList<Chofer> choferes) {
        this.choferes = choferes;
    }
    
    
        public void addAfiliado(Afiliado afi){
        
        afiliado.add(afi);
        
    }
    
        public boolean validarDni(String dni){
        
            //recorro la lista de afiliados
            for (Afiliado a : afiliado) {
                if (a.getDni().equals(dni)) {
                    return true;
                }
            }
            return false;
    }
    public Afiliado buscarDni(String dni){
            for (Afiliado a : afiliado) {
                if (a.getDni().equals(dni)) {
                    return a;
                }
            }
            return null;
    }
    
    public boolean deleteAfiliado( String dni){
            for (int i=0; i<afiliado.size();i++) {
                if (afiliado.get(i).getDni().equals(dni)) {
                afiliado.remove(i);
                return true;
                }
            }
            return false;
    
    }
    
            /*private ArrayList<clasessimples.Empleado> empleados;
          private ArrayList<clasessimples.Movil> moviles;
          private ArrayList<clasessimples.Afiliado> afiliados = new ArrayList<>();
          
          public GestionHospital(){
              //ArrayList<Afiliado> afiliados= new ArrayList<Afiliado>();
          }
          
          public void altaAfiliado(clasessimples.Afiliado afiliado){
              afiliados.add(afiliado);
          }
          
          public void bajaAfiliado(clasessimples.Afiliado afiliado){
              afiliados.remove(afiliado);
          }
          
          public clasessimples.Afiliado buscarAfiliado(Integer dni){
              for(clasessimples.Afiliado i: afiliados){
                 // if(i instanceof Afiliado){
                      //Afiliado a= (Afiliado)i;
                      if(i.getDNI()==dni){
                          return i;
                      //}
                  }
              }
          return null;
          }
          
          public void verificarAbonoAfiliado(clasessimples.Afiliado afiliado){
              LocalDate fechaActual= LocalDate.now();
              //Period periodo = Period.between(fechaActual, afiliado.getFechaDePago());
              // LA FUNCION CHRONOUNIT ME DEVUELVE LA CANTIDAD DE DIAS EN TIPO LONG "TENER EN CUENTA A lA HORA DE COMPARAR"
              // EL PERIOD NO ME SIRVIO
              //System.out.println(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual));
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)>60){
                    afiliado.setAbonoHabilitado(1);
                    System.out.println("SE ENTRO AL PRIMER IF");
                    //DEBE EL ABONO NO PUEDE SER ATENDIDO
              }
              else{
                    System.out.println("SE ENTRO AL ELSE");
                    //ACCION QUE VA A HACER SI ESTA HABILITADO PARA ATENDERLO CON EL SISTEMA MEDICO                    
              }
          }
          
          
          
          public void pagarAbonoAfiliado(clasessimples.Afiliado afiliado){
              LocalDate fechaActual= LocalDate.now();
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)<60){
                    //NO DEBE PAGAR ABONO, ESTA AL DIA
              }
              else{
                  afiliado.setFechaDePago(fechaActual);
                  afiliado.setAbonoHabilitado(0);
                  //PAGADO
              }
          }
          
          public void mostrarPrimerAfliado(){
             System.out.println("nombre: "+afiliados.get(0).getNombre());
            //for(Afiliado i: afiliados)
              // if(i instanceof Afiliado){
               //Afiliado a= (Afiliado)i;
              //}
          }
          
          public void altaDoctor(clasessimples.Doctor doctor){
              empleados.add(doctor);
          } 
          
          public void altaEnfermero(clasessimples.Enfermero enfermero){
              empleados.add(enfermero);
          } 
          
          public void AltaMovil(clasessimples.Movil movil){
              moviles.add(movil);
          }
          
          public void altaChofer(clasessimples.Chofer chofer){
              empleados.add(chofer);
          }
          
          public void bajaChofer(clasessimples.Chofer chofer){
              empleados.remove(chofer);
          }
          
          
          public void bajaDoctor(clasessimples.Doctor doctor){
              empleados.remove(doctor);
          }
          
          public void bajaEnfermero(clasessimples.Enfermero enfermero){
              empleados.remove(enfermero);
          }
          
          public void bajaMovil(clasessimples.Movil movil){
              moviles.remove(movil);
          }
          
          public clasessimples.Doctor buscarDoctor(Integer dni){
              clasessimples.Doctor b = null;
              for(clasessimples.Empleado i: empleados){
                  if(i instanceof clasessimples.Doctor){
                      clasessimples.Doctor a= (clasessimples.Doctor)i;
                      if(a.getDNI()==dni){
                            //DOCTOR ENCONTRADO
                            b = a;
                            break;
                      }
                  }
              }
          return b;    
          }*/
}
