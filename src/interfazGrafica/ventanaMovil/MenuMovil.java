/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaMovil;

import javax.swing.ImageIcon;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class MenuMovil extends javax.swing.JFrame {
    GestionHospital menuMovil;
    /**
     * Creates new form Menu
     */
    public MenuMovil(GestionHospital gh) {
        this.menuMovil = gh;
        this.setVisible(true);
        initComponents();
//        setIconImage (new ImageIcon(getClass().getResource("/interfazGrafica/red-38673_960_720.png")).getImage()); //Agrega el icono de la ventana
    }

    private MenuMovil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAltaMovil = new javax.swing.JButton();
        BotonBajaMovil = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Emergencia Medico");
        setBackground(new java.awt.Color(255, 255, 255));

        BotonAltaMovil.setText("Alta Movil");
        BotonAltaMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaMovilActionPerformed(evt);
            }
        });

        BotonBajaMovil.setText("Baja Movil");
        BotonBajaMovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajaMovilActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/TRAS.png"))); // NOI18N
        jButton6.setText("VOLVER");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotonAltaMovil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonBajaMovil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BotonAltaMovil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BotonBajaMovil)
                .addGap(59, 59, 59)
                .addComponent(jButton6)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAltaMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaMovilActionPerformed
        FormularioAltaMovil fam = new FormularioAltaMovil(menuMovil);
    }//GEN-LAST:event_BotonAltaMovilActionPerformed

    private void BotonBajaMovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajaMovilActionPerformed
        BajaMovil bm = new BajaMovil(menuMovil);
    }//GEN-LAST:event_BotonBajaMovilActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaMovil;
    private javax.swing.JButton BotonBajaMovil;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
