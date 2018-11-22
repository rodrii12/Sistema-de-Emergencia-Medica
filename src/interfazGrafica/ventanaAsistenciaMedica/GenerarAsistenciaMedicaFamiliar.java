/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaAsistenciaMedica;

import excepciones.VerficarCampoVacioException;
import clasessimples.Afiliado;
import excepciones.PersonaNoEncontradaException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class GenerarAsistenciaMedicaFamiliar extends javax.swing.JFrame {

    GestionHospital generarAsistenciaMedicaFamiliar;
    
    public GenerarAsistenciaMedicaFamiliar(GestionHospital gh) {
        initComponents();
        generarAsistenciaMedicaFamiliar = gh;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        dniaa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grupo Familiar");
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setText("DNI DEL AFILIADO CABEZA");

        dniaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniaaKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/buscar.png"))); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/TRAS.png"))); // NOI18N
        jButton7.setText("VOLVER");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniaa, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dniaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
     generarAsistenciaMedicaFamiliar.verificarCampoDNI(dniaa.getText());  
        Integer dni = Integer.parseInt(dniaa.getText());
        Afiliado a = generarAsistenciaMedicaFamiliar.buscarAfiliado(dni);
        
            if(generarAsistenciaMedicaFamiliar.verificarAbonoAfiliado(a)){
                BuscarFamiliar bf = new BuscarFamiliar(generarAsistenciaMedicaFamiliar, a);
            }else JOptionPane.showMessageDialog(this, "ABONO NO PAGO", "Error", JOptionPane.ERROR_MESSAGE);
            
    }catch(VerficarCampoVacioException cav){
        JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos obligatorios ", "Atencion!", JOptionPane.QUESTION_MESSAGE);
    }catch (PersonaNoEncontradaException ex) {
               JOptionPane.showMessageDialog(this," AFILIADO NO ENCONTRADO" , "Error", JOptionPane.ERROR_MESSAGE);
    }catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, " NO HAY NINGUN AFILIADO EN EL SISTEMA", "Atencion!", JOptionPane.QUESTION_MESSAGE);
}    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void dniaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniaaKeyTyped
         char C= evt.getKeyChar();
     if(Character.isLetter(C))
     {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dniaa.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
         getToolkit().beep();
         evt.consume();
         JOptionPane.showMessageDialog(this, "Ingrese solo numeros","Error", JOptionPane.ERROR_MESSAGE);
         dniaa.setCursor(null);
     }
     else if(dniaa.getText().length() >= 8){
         evt.consume();
         getToolkit().beep();
         JOptionPane.showMessageDialog(this, "Longitud maxima de ocho caracteres","Error", JOptionPane.ERROR_MESSAGE);
     } 
    }//GEN-LAST:event_dniaaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dniaa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
