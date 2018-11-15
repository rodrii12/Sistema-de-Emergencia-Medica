/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaAsistenciaMedica;

import clasessimples.Afiliado;
import clasessimples.Familiar;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class BuscarFamiliar extends javax.swing.JFrame {

    Afiliado afi;
    GestionHospital buscaFamiliar;
    
    public BuscarFamiliar(GestionHospital gh, Afiliado a) {
        initComponents();
        afi = a;
        buscaFamiliar = gh;
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

        dniaa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(dniaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, -1));

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel1.setText("DNI DEL FAMILIAR A ATENDER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer dni = Integer.parseInt(dniaa.getText());
        Familiar fami = afi.buscarFamiliar(dni);
        if(fami != null){
            AsistenciaMedicaParaUnFamiliar amf = new AsistenciaMedicaParaUnFamiliar(buscaFamiliar, afi, fami);
        }else JOptionPane.showMessageDialog(null, "Familiar no encontrado", "Error", ERROR);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dniaa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
