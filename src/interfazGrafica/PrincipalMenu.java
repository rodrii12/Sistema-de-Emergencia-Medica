/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import interfazGrafica.ventanasafiliados.MenuAfiliados;
import clasessimples.Afiliado;
import interfazGrafica.ventanaAsistenciaMedica.MenuAsistenciaMedica;
import interfazGrafica.ventanaEmpleados.MenuEmpleados;
import interfazGrafica.ventanaMovil.MenuMovil;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class PrincipalMenu extends javax.swing.JFrame {

    private GestionHospital ventanap;
    private LocalDate fechaDePago = LocalDate.of(1994, 05, 13);
    
    public PrincipalMenu(GestionHospital h) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        //setTitle("EMERGENCIA MEDICA");
        ventanap= h;
        setVisible(true);
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes_Iconos/red-38673_960_720.png")).getImage());
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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Emergencia Medica");
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/afiliado.png"))); // NOI18N
        jButton1.setToolTipText("Menu Afiliado");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 170, 130, 106);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/empleado.png"))); // NOI18N
        jButton4.setToolTipText("Menu Empleado");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 320, 179, 106);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/asistencia.png"))); // NOI18N
        jButton5.setToolTipText("Menu Emergencia");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(260, 320, 130, 106);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/movil.png"))); // NOI18N
        jButton6.setToolTipText("Menu Flota");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(230, 170, 200, 106);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/FondoMenuP.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1000, 570));
        jLabel2.setMinimumSize(new java.awt.Dimension(1000, 570));
        jLabel2.setPreferredSize(new java.awt.Dimension(1000, 570));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 570);
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuAfiliados a = new MenuAfiliados(ventanap);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuEmpleados me= new MenuEmpleados(ventanap);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuAsistenciaMedica mam = new MenuAsistenciaMedica(ventanap);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuMovil mv = new MenuMovil(ventanap);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
