/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaEmpleados;

import clasessimples.Administrativo;
import clasessimples.Doctor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class BajaAdmin extends javax.swing.JFrame {
    
    GestionHospital bajaAdmin;
    Administrativo adminParaEliminar;
    
    public BajaAdmin(GestionHospital gh) {
        initComponents();
        bajaAdmin = gh;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage (new ImageIcon(getClass().getResource("/Imagenes_Iconos/red-38673_960_720.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dnibd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mostrarNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mostrarApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mostrarNumeroDeEmpleado = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja Administracion");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setText("INGRESE DNI DEL EMPLEADO:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        mostrarNombre.setEditable(false);
        mostrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDO");

        mostrarApellido.setEditable(false);

        jLabel4.setText("NUMERO DE EMPLEADO");

        mostrarNumeroDeEmpleado.setEditable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/TRAS.png"))); // NOI18N
        jButton2.setText("VOLVER");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/BORRAR.png"))); // NOI18N
        jButton3.setText("ELIMINAR");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dnibd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mostrarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(mostrarNombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarNumeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(dnibd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mostrarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mostrarNumeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer dni= Integer.parseInt(dnibd.getText());
        adminParaEliminar = bajaAdmin.buscarAdmin(dni);
        if(adminParaEliminar != null){
            mostrarNombre.setText(adminParaEliminar.getNombre());
            mostrarApellido.setText(adminParaEliminar.getApellido());
            mostrarNumeroDeEmpleado.setText(String.valueOf(adminParaEliminar.getDNI()));
        }else JOptionPane.showMessageDialog(this," No se ha encontrado el Empleado Administrativo" , "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //bajaAdmin.bajaAdmin(adminParaEliminar);
        
        if(adminParaEliminar != null){
           bajaAdmin.bajaAdmin(adminParaEliminar);
           JOptionPane.showMessageDialog(this, "Se ha eliminado correctamente",
            "Eliminado", JOptionPane.INFORMATION_MESSAGE);
           this.mostrarNombre.setText("");
           this.mostrarApellido.setText("");
           this.mostrarNumeroDeEmpleado.setText("");
           
        }
        else{
            JOptionPane.showMessageDialog(this," no se pudo eliminar" , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mostrarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dnibd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mostrarApellido;
    private javax.swing.JTextField mostrarNombre;
    private javax.swing.JTextField mostrarNumeroDeEmpleado;
    // End of variables declaration//GEN-END:variables
}
