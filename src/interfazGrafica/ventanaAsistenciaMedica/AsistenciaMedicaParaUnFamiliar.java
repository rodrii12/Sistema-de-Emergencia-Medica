/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaAsistenciaMedica;

import clasessimples.Afiliado;
import clasessimples.AsistenciaMedica;
import clasessimples.AsistenciaMedicaFamiliar;
import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Enfermero;
import clasessimples.Familiar;
import clasessimples.Movil;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class AsistenciaMedicaParaUnFamiliar extends javax.swing.JFrame {

    GestionHospital llenarAsistenciaMedica;
    Afiliado afi;
    Familiar fami;
    
    public AsistenciaMedicaParaUnFamiliar(GestionHospital gh, Afiliado a, Familiar f) {
        initComponents();
        this.setVisible(true);
        fami = f;
        afi = a;
        llenarAsistenciaMedica = gh; 
        LocalDate fecha = LocalDate.now();
        Doctor d = llenarAsistenciaMedica.doctorDisponible();
        Chofer c = llenarAsistenciaMedica.choferDisponible();
        Enfermero e = llenarAsistenciaMedica.enfermeroDisponible();
        Movil m = llenarAsistenciaMedica.movilDisponible();
        AsistenciaMedicaFamiliar am = new AsistenciaMedicaFamiliar(f,afi, m, LocalDate.of(2018, 11,11), e, d, c);
        if(am != null){
            nombreFamiliar.setText(fami.getNombre());
            nombreAfiliado.setText(afi.getNombre());
            nombreDoctor.setText(am.getDotor().getNombre());
            //patenteAmbulancia.setText(am.getMovil().getPatente());
            //fecha.setText(String.valueOf(am.getFecha()));
            //enfermero.setText(am.getEnfermero().getNombre()  +am.getEnfermero().getApellido());
            nombreChofer.setText(am.getChofer().getNombre()  +am.getEnfermero().getApellido());
            //nroAfiliado.setText(String.valueOf(am.getAfiliado().getNumeroAfiliado()));
        }else JOptionPane.showInputDialog("NO SE PUDO GENERAR UNA ASISTENCIA MEDICA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreDoctor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreAfiliado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numeroAfiliado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreChofer = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreFamiliar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DOCTOR DESIGNADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 75, -1, -1));
        getContentPane().add(nombreDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 75, 269, 15));

        jLabel2.setText("NOMBRE COMPLETO AFILIADO : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 108, -1, -1));
        getContentPane().add(nombreAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 108, 221, -1));

        jLabel3.setText("NUMERO AFILIADO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 143, -1, -1));
        getContentPane().add(numeroAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 141, 285, 17));

        jLabel4.setText("NOMBRE CHOFER");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 176, -1, -1));
        getContentPane().add(nombreChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 176, 285, -1));

        jLabel5.setText("NOMBRE FAMILIAR ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        getContentPane().add(nombreFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nombreAfiliado;
    private javax.swing.JLabel nombreChofer;
    private javax.swing.JLabel nombreDoctor;
    private javax.swing.JLabel nombreFamiliar;
    private javax.swing.JLabel numeroAfiliado;
    // End of variables declaration//GEN-END:variables
}
