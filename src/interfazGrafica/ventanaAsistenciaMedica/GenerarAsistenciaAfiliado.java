/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaAsistenciaMedica;

import clasessimples.Afiliado;
import clasessimples.AsistenciaMedica;
import clasessimples.Chofer;
import clasessimples.Doctor;
import clasessimples.Enfermero;
import clasessimples.Movil;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class GenerarAsistenciaAfiliado extends javax.swing.JFrame {

    GestionHospital generarAsistenciaAfiliado;
    
    public GenerarAsistenciaAfiliado(GestionHospital gh) {
        initComponents();
        generarAsistenciaAfiliado = gh;
        this.setVisible(true);
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
        jButton1 = new javax.swing.JButton();
        dni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESE DNI DE AFILIADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/buscar.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 128, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 754, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/TRAS.png"))); // NOI18N
        jButton7.setText("VOLVER");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniActionPerformed

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(dni.getText().length() >= 8) evt.consume();
    }//GEN-LAST:event_dniKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer dam = Integer.parseInt(dni.getText());
        Afiliado afi = generarAsistenciaAfiliado.buscarAfiliado(dam);
        AsistenciaMedicaAfiliado ama = new AsistenciaMedicaAfiliado(generarAsistenciaAfiliado, afi);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
