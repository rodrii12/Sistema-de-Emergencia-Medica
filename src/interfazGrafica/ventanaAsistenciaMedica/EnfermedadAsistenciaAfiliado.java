/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaAsistenciaMedica;

import clasessimples.AsistenciaMedica;
import clasessimples.AsistenciaMedicaFamiliar;
import excepciones.PersonaNoEncontradaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class EnfermedadAsistenciaAfiliado extends javax.swing.JFrame {

    GestionHospital gh;
    AsistenciaMedica asis;
    
    public EnfermedadAsistenciaAfiliado( GestionHospital gh) {
        initComponents();
        this.setVisible(true);
        this.gh = gh;
        jButton2.setVisible(false);
        jLabel2.setVisible(false);
        enfermedad.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dni = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enfermedad = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 42, 175, -1));

        jButton1.setText("Buscar Asistencia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 21, -1, 46));

        jLabel1.setText("INGRESE DNI DE LA PERSONA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 21, 175, -1));
        getContentPane().add(enfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, -1));

        jButton2.setText("Asignar Enfermedad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, 50));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 180, -1));

        jLabel3.setText("Ingrese la enfermedad detectada");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 135, 180, 20));

        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Integer d = Integer.parseInt(dni.getText());
            asis = gh.buscarAsistenciaAfiliado(d);
            dni.setVisible(false);
            jButton1.setVisible(false);
            jLabel1.setVisible(false);
            jButton2.setVisible(true);
            jLabel2.setVisible(true);  
            enfermedad.setVisible(true);
        } catch (PersonaNoEncontradaException ex) {
            Logger.getLogger(EnfermedadAsistenciaAfiliado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String e = enfermedad.getText();
        asis.setEnfemerdad(e);
        asis.getChofer().setDisponible(true);
        asis.getDotor().setDisponible(true);
        asis.getEnfermero().setDisponible(true);
        asis.getMovil().setDisponible(true);
        System.out.println(asis.getEnfemerdad());
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni;
    private javax.swing.JTextField enfermedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
