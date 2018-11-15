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
import javax.swing.ImageIcon;
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
    String enfer;
    
    public AsistenciaMedicaParaUnFamiliar(GestionHospital gh, Afiliado a, Familiar f, String s) {
        initComponents();
        this.setVisible(false);
        enfer = s;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes_Iconos/red-38673_960_720.png")).getImage());
        fami = f;
        afi = a;
        llenarAsistenciaMedica = gh; 
        LocalDate fecha = LocalDate.now();
        Doctor d = llenarAsistenciaMedica.doctorDisponible();
        Chofer c = llenarAsistenciaMedica.choferDisponible();
        Enfermero e = llenarAsistenciaMedica.enfermeroDisponible();
        Movil m = llenarAsistenciaMedica.movilDisponible();
        //AsistenciaMedicaFamiliar am = new AsistenciaMedicaFamiliar(f,afi, m, LocalDate.of(2018, 11,11), e, d, c, enfer);
        if(d != null){
            if(c != null){
                if(e != null){
                    if(m != null){
                        AsistenciaMedicaFamiliar am = new AsistenciaMedicaFamiliar(f,afi, m, LocalDate.of(2018, 11,11), e, d, c, enfer);		
                        this.setVisible(true);
                        nombreFamiliar.setText(fami.getNombre()+ "  "+ fami.getApellido());
                        parentezco.setText(fami.getRelacion() +" DE "+ afi.getNombre()+ "  "+ afi.getApellido());
                        dniFamiliar.setText(String.valueOf(fami.getDNI()));
                        nombreDoctor.setText(am.getDotor().getNombre());
                        enfemedad.setText(enfer);
                        patente.setText(am.getMovil().getPatente());
                        //fecha.setText(String.valueOf(am.getFecha()));
                        nombreEnfemerdo.setText(am.getEnfermero().getNombre()+ "  " +am.getEnfermero().getApellido());
                        nombreChofer.setText(am.getChofer().getNombre()+ "  "  +am.getEnfermero().getApellido());
                        //nroAfiliado.setText(String.valueOf(am.getAfiliado().getNumeroAfiliado()));
                    }else JOptionPane.showMessageDialog(this, "AMBULANCIA NO DISPONIBLE", "Error", JOptionPane.ERROR_MESSAGE);
                }else JOptionPane.showMessageDialog(this, "ENFERMERO NO DISPONIBLE", "Error", JOptionPane.ERROR_MESSAGE);
            }else JOptionPane.showMessageDialog(this, "CHOFER NO DISPONIBLE", "Error", JOptionPane.ERROR_MESSAGE);    
        }else JOptionPane.showMessageDialog(this, "DOCTOR NO DISPONIBLE", "Error", JOptionPane.ERROR_MESSAGE);
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
        jLabel3 = new javax.swing.JLabel();
        parentezco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreChofer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreFamiliar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreEnfemerdo = new javax.swing.JLabel();
        patente = new javax.swing.JLabel();
        enfemedad = new javax.swing.JLabel();
        dniFamiliar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DOCTOR DESIGNADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(nombreDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 269, 15));

        jLabel2.setText("NOMBRE COMPLETO PACIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("PARENTEZCO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(parentezco, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 141, 285, 17));

        jLabel4.setText("CHOFER DESIGNADO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(nombreChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 285, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));
        getContentPane().add(nombreFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 240, 20));

        jLabel8.setText("ENFERMERO DESIGNADO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel9.setText("PATENTE AMBULANCIA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel10.setText("DNI PACIENTE");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setText("ENFERMEDAD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, -1));
        getContentPane().add(nombreEnfemerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 270, 10));
        getContentPane().add(patente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 280, 20));
        getContentPane().add(enfemedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 280, -1));
        getContentPane().add(dniFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 300, -1));

        jLabel5.setText("ASISTENCIA MEDICA FAMILIAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dniFamiliar;
    private javax.swing.JLabel enfemedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombreChofer;
    private javax.swing.JLabel nombreDoctor;
    private javax.swing.JLabel nombreEnfemerdo;
    private javax.swing.JLabel nombreFamiliar;
    private javax.swing.JLabel parentezco;
    private javax.swing.JLabel patente;
    // End of variables declaration//GEN-END:variables
}
