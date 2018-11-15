/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaMovil;

import Interfaces_Graficas.VerficarCampoVacioException;
import clasessimples.Movil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author REC
 */
public class FormularioAltaMovil extends javax.swing.JFrame {

    GestionHospital formularioAltaMovil;
    
    public FormularioAltaMovil(GestionHospital gh) {
        this.setVisible(true);
        initComponents();
        formularioAltaMovil = gh;
        setIconImage (new ImageIcon(getClass().getResource("/interfazGrafica/red-38673_960_720.png")).getImage()); //Agrega el icono de la ventana
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreAuto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        modeloAuto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patenteAuto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        añoAuto = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema de Emergencias Medica");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/guardar.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("MARCA");

        nombreAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreAutoKeyTyped(evt);
            }
        });

        jLabel2.setText("MODELO");

        modeloAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloAutoActionPerformed(evt);
            }
        });
        modeloAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modeloAutoKeyTyped(evt);
            }
        });

        jLabel3.setText("PATENTE");

        patenteAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteAutoActionPerformed(evt);
            }
        });
        patenteAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patenteAutoKeyTyped(evt);
            }
        });

        jLabel4.setText("AÑO");

        añoAuto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                añoAutoKeyTyped(evt);
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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(nombreAuto)
                        .addComponent(modeloAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(patenteAuto)
                        .addComponent(añoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modeloAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patenteAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(añoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    try{ 
        // String patente = "AAA123";
         Pattern p = Pattern.compile("[A-Z]{3}[0-9]{3}"); //Formato de la patente, 3 letras 3 números
         Matcher m = p.matcher(patenteAuto.getText());

         formularioAltaMovil.verificarDatosMovil(nombreAuto.getText(),modeloAuto.getText(),patenteAuto.getText()); 

         if (m.matches()) {
                 JOptionPane.showMessageDialog(this, "Se ha añadido el vehiculo","Añadido", JOptionPane.INFORMATION_MESSAGE);
                 formularioAltaMovil.AltaMovil(new Movil(nombreAuto.getText(),modeloAuto.getText(),patenteAuto.getText(), Integer.parseInt(añoAuto.getText())));
         }else{
              JOptionPane.showMessageDialog(null, "matricula incorrecta (AAA111) ", "ERROR", JOptionPane.ERROR_MESSAGE); 
             }
         } catch(VerficarCampoVacioException cav){
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos obligatorios ", "Atencion!", JOptionPane.QUESTION_MESSAGE); 
         }   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void patenteAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteAutoActionPerformed

    private void modeloAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloAutoActionPerformed

    private void nombreAutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAutoKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_nombreAutoKeyTyped

    private void modeloAutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloAutoKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_modeloAutoKeyTyped

    private void patenteAutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patenteAutoKeyTyped
        char c = evt.getKeyChar();
        
        //if(Character.isLetter(c)) evt.consume();// SOLAMENTE NUMEROS
        
        if(patenteAuto.getText().length() >= 6) evt.consume();
    }//GEN-LAST:event_patenteAutoKeyTyped

    private void añoAutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoAutoKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();// SOLAMENTE NUMEROS
        
        if(añoAuto.getText().length() >= 4) evt.consume();
    }//GEN-LAST:event_añoAutoKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField añoAuto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField modeloAuto;
    private javax.swing.JTextField nombreAuto;
    private javax.swing.JTextField patenteAuto;
    // End of variables declaration//GEN-END:variables
}
