
package sistema.de.emergencia.medica;

import clasessimples.Administrativo;
import clasessimples.Afiliado;
import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Empleado;
import clasessimples.Enfermero;
import clasessimples.Movil;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author FRANCO
 */
    public class GestionHospital {
          private ArrayList<clasessimples.Empleado> empleados = new ArrayList<>();
          private ArrayList<clasessimples.Movil> moviles = new ArrayList<>();
          private ArrayList<clasessimples.Afiliado> afiliados = new ArrayList<>();
          
          public GestionHospital(){
              //ArrayList<Afiliado> afiliados= new ArrayList<Afiliado>();
          }
          
          public void altaAfiliado(Afiliado afiliado){
              afiliados.add(afiliado);
          }
          
          public void bajaAfiliado(Afiliado afiliado){
              afiliados.remove(afiliado);
          }
          
          public Afiliado buscarAfiliadoPorNumero(Integer numero){
              Afiliado a = null;
              for(Afiliado i: afiliados){
                 // if(i instanceof Afiliado){
                      //Afiliado a= (Afiliado)i;
                      if(Objects.equals(i.getNumeroAfiliado(), numero)){
                          a = i;

                      //}
                  }
              }
                return a;
          }
          
          public Afiliado buscarAfiliado(Integer dni){
              Afiliado a = null;
              for(Afiliado i: afiliados){
                 // if(i instanceof Afiliado){
                      //Afiliado a= (Afiliado)i;
                      if(Objects.equals(i.getDNI(), dni)){
                          a = i;

                      //}
                  }
              }
                return a;
            }
          
          public void verificarAbonoAfiliado(Afiliado afiliado){
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
          
          
          
          public void pagarAbonoAfiliado(Afiliado afiliado){
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
             System.out.println("nombre: "+afiliados.get(0).getNumeroAfiliado());
            //for(Afiliado i: afiliados)
              // if(i instanceof Afiliado){
               //Afiliado a= (Afiliado)i;
              //}
          }
          
          public void mostrarPrimerEmpleado(){
              System.out.println("nombre: "+empleados.get(0).getNombre());
          }
          
          public void altaDoctor(Doctor doctor){
              empleados.add(doctor);
          } 
          
          public void altaEnfermero(Enfermero enfermero){
              empleados.add(enfermero);
          } 
          
          public void AltaMovil(Movil movil){
              moviles.add(movil);
          }
          
          public void altaChofer(Chofer chofer){
              empleados.add(chofer);
          }
          
          public void bajaChofer(Chofer chofer){
              empleados.remove(chofer);
          }
          
          
          public void bajaDoctor(Doctor doctor){
              empleados.remove(doctor);
          }
          
          public void bajaEnfermero(Enfermero enfermero){
              empleados.remove(enfermero);
          }
          
          public void bajaMovil(Movil movil){
              moviles.remove(movil);
          }
          
          public void altaAdmin(Administrativo admin){
              empleados.add(admin);
          }
          
          public void bajaAdmin(Administrativo admin){
              empleados.remove(admin);
          }
          
          public Doctor buscarDoctor(Integer dni){
              Doctor b = null;
              for(Empleado i: empleados){
                  if(i instanceof Doctor){
                      Doctor a = (Doctor)i;
                      if(Objects.equals(a.getDNI(), dni)){
                            //DOCTOR ENCONTRADO
                            b = a;
              
                      }
                  }
              }
          return b;    
          }
          
          public Administrativo buscarAdmin(Integer dni){
              Administrativo b = null;
              for(Empleado i: empleados){
                  if(i instanceof Administrativo){
                      Administrativo a = (Administrativo)i;
                      if(Objects.equals(a.getDNI(), dni)){
                            //DOCTOR ENCONTRADO
                            b = a;
              
                      }
                  }
              }
          return b;    
          }
          
          public Chofer buscarChofer(Integer dni){
              Chofer b = null;
              for(Empleado i: empleados){
                  if(i instanceof Chofer){
                      Chofer a = (Chofer)i;
                      if(Objects.equals(a.getDNI(), dni)){
                            //DOCTOR ENCONTRADO
                            b = a;
              
                      }
                  }
              }
          return b;    
          }
          
          public Enfermero buscarEnfermero(Integer dni){
              Enfermero b = null;
              for(Empleado i: empleados){
                  if(i instanceof Enfermero){
                      Enfermero a = (Enfermero)i;
                      if(Objects.equals(a.getDNI(), dni)){
                            //DOCTOR ENCONTRADO
                            b = a;
              
                      }
                  }
              }
          return b;    
          }
          
          public void modificarAfiliado(Afiliado afi,Integer numeroAfiliado, String Nombre, String apellido, Integer DNI, LocalDate FechaNacimiento){
              for(Afiliado i: afiliados){
                 // if(i instanceof Afiliado){
                      //Afiliado a= (Afiliado)i;
                      if(Objects.equals(i.getNumeroAfiliado(), numeroAfiliado)){
                          i.setNombre(Nombre);
                          i.setApellido(apellido);
                          i.setDNI(DNI);
                          i.setFechaNacimiento(FechaNacimiento);

                      //}
                  }
              }
          }
       
}
