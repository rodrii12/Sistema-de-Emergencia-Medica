
package sistema.de.emergencia.medica;

import clasessimples.Administrativo;
import clasessimples.Afiliado;
import clasessimples.AsistenciaMedica;
import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Empleado;
import clasessimples.Enfermero;
import clasessimples.Movil;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

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
          
          public Boolean verificarAbonoAfiliado(Afiliado afiliado){
              Boolean a = true;
              LocalDate fechaActual= LocalDate.now();
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)>60){
                    afiliado.setAbonoHabilitado(false);
                    a = false;
                    //DEBE EL ABONO NO PUEDE SER ATENDIDO
              }
              else{
                    a = true;
                    //ACCION QUE VA A HACER SI ESTA HABILITADO PARA ATENDERLO CON EL SISTEMA MEDICO                    
              }
          return a;    
          }
          
          
          
          public void pagarAbonoAfiliado(Afiliado afiliado){
              LocalDate fechaActual= LocalDate.now();
              if(ChronoUnit.DAYS.between(afiliado.getFechaDePago(), fechaActual)<60){
                    JOptionPane.showConfirmDialog(null , "EL ABONO YA ESTA PAGADO");
              }
              else{
                  afiliado.setFechaDePago(fechaActual);
                  afiliado.setAbonoHabilitado(true);
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
          public boolean validarDni(Integer dni){
            Boolean estado = false;
            //recorro la lista de afiliados
            for (Afiliado a : afiliados) {
                //if (a.getDNI().equals(dni)) {
                    if(Objects.equals(a.getDNI(), dni)){
                    estado = true;
                }
            }
            return estado;
    }
          
          public Doctor doctorDisponible(){
              Doctor b = null;
              for(Empleado i: empleados){
                  if(i instanceof Doctor){
                      Doctor a = (Doctor)i;
                      if(a.getDisponible()){
                          b = a;
                          b.setDisponible(false);
                          break;
                      }
                  }
                  
              }
          return b;
          }
          
          public Enfermero enfermeroDisponible(){
              Enfermero b = null;
              for(Empleado i: empleados){
                  if(i instanceof Enfermero){
                      Enfermero a = (Enfermero)i;
                      if(a.getDisponible()){
                          b = a;
                          b.setDisponible(false);
                          break;
                      }
                  }
                  
              }
          return b;
          }
          
          public Chofer choferDisponible(){
              Chofer b = null;
              for(Empleado i: empleados){
                  if(i instanceof Chofer){
                      Chofer a = (Chofer)i;
                      if(a.getDisponible()){
                          b = a;
                          b.setDisponible(false);
                          break;
                      }
                  
                  }
              }
          return b;
        }
          
          public Movil movilDisponible(){
              Movil b = null;
              for(Movil i: moviles){
                  if(i.getDisponible()){
                          b = i;
                          b.setDisponible(false);
                          break;
                      }
                  }
                  
              
          return b;
          }
          
          public AsistenciaMedica generarAsistencia(Afiliado a){
              LocalDate fecha = LocalDate.now();
              AsistenciaMedica am = null;
              Doctor d = doctorDisponible();
              Chofer c = choferDisponible();
              Enfermero e = enfermeroDisponible();
              Movil m = movilDisponible();
              if(verificarAbonoAfiliado(a)){
                  if(d != null){
                      if(c != null){
                          if(e != null){
                              if(m != null){
                                  am.setAfiliado(a);
                                  am.setChofer(c);
                                  am.setDotor(d);
                                  am.setEnfermero(e);
                                  am.setFecha(fecha);
                                  am.setMovil(m);
                              }
                          }
                      }
                  }
              }
          
          return am;
          }
          
          public boolean validarDniEnfer(Integer dni){
          Boolean estado = false;
          //recorro la lista de afiliados
           for (Empleado e : empleados) {
                //if (a.getDNI().equals(dni)) {
                    if(Objects.equals(e.getDNI(), dni)){
                    estado = true;
                }
            }
            return estado;
    }    
 
          public Movil buscarMovil(String patente){
              Movil b = null;
              for(Movil i: moviles){
                  if(i instanceof Movil){
                      Movil a = (Movil)i;
                      if(Objects.equals(a.getPatente(), patente)){
                            //Movil encontrado
                            b = a;
              
                      }
                  }
              }
          return b;    
          }  
}
