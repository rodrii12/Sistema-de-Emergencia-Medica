/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaEmpleados;

import Interfaces_Graficas.DNIException;
import Interfaces_Graficas.Metodos;
import interfazGrafica.ventanasafiliados.*;
import clasessimples.Afiliado;
import clasessimples.Doctor;
import clasessimples.Enfermero;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class FormularioAltaDoctor extends javax.swing.JFrame {

    GestionHospital ventanaFormularioAltaDoctor;
    
    public FormularioAltaDoctor(GestionHospital tipoDeEmpleadoAlta) {
        initComponents();
        ventanaFormularioAltaDoctor = tipoDeEmpleadoAlta;
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
        nombread = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dniad = new javax.swing.JTextField();
        sexoad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        diaFechaNacimientoaa = new javax.swing.JTextField();
        mesFechaNacimientoaa = new javax.swing.JTextField();
        anioFechaNacimientoaa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numeroDeEmpleado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NOMBRE");

        nombread.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreadKeyTyped(evt);
            }
        });

        jLabel2.setText("APELLIDO");

        apellidoad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoadKeyTyped(evt);
            }
        });

        jLabel3.setText("DNI");

        dniad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniadKeyTyped(evt);
            }
        });

        sexoad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino\t", "Femenino", " " }));
        sexoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoadActionPerformed(evt);
            }
        });

        jLabel4.setText("SEXO");

        diaFechaNacimientoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFechaNacimientoaaActionPerformed(evt);
            }
        });
        diaFechaNacimientoaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diaFechaNacimientoaaKeyTyped(evt);
            }
        });

        mesFechaNacimientoaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesFechaNacimientoaaKeyTyped(evt);
            }
        });

        anioFechaNacimientoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioFechaNacimientoaaActionPerformed(evt);
            }
        });
        anioFechaNacimientoaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anioFechaNacimientoaaKeyTyped(evt);
            }
        });

        jLabel5.setText("DD     /     MM     /     AAAA");

        jLabel6.setText("FECHA DE NACIMIENTO");

        jLabel8.setText("NUMERO DE EMPLEADO");

        numeroDeEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDeEmpleadoActionPerformed(evt);
            }
        });
        numeroDeEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroDeEmpleadoKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/guardar.png"))); // NOI18N
        jButton1.setText("INSCRIBIR");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_Iconos/TRAS.png"))); // NOI18N
        jButton4.setText("VOLVER");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dniad)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(nombread)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(diaFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mesFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(anioFechaNacimientoaa))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sexoad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(apellidoad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(numeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombread, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diaFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anioFechaNacimientoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_nombreadKeyTyped

    private void apellidoadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_apellidoadKeyTyped

    private void dniadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(dniad.getText().length() >= 8) evt.consume();
    }//GEN-LAST:event_dniadKeyTyped

    private void diaFechaNacimientoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFechaNacimientoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFechaNacimientoaaActionPerformed

    private void diaFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaFechaNacimientoaaKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(diaFechaNacimientoaa.getText().length() >= 2) evt.consume();
    }//GEN-LAST:event_diaFechaNacimientoaaKeyTyped

    private void mesFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesFechaNacimientoaaKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(mesFechaNacimientoaa.getText().length() >= 2) evt.consume();
    }//GEN-LAST:event_mesFechaNacimientoaaKeyTyped

    private void anioFechaNacimientoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioFechaNacimientoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioFechaNacimientoaaActionPerformed

    private void anioFechaNacimientoaaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anioFechaNacimientoaaKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(anioFechaNacimientoaa.getText().length() >= 4) evt.consume();
    }//GEN-LAST:event_anioFechaNacimientoaaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        Integer dn,mn,an,numeroEmpleado, dni;
        dni = Integer.parseInt(dniad.getText());
        dn= Integer.parseInt(diaFechaNacimientoaa.getText());
        mn=Integer.parseInt(mesFechaNacimientoaa.getText());
        an=Integer.parseInt(anioFechaNacimientoaa.getText());
        numeroEmpleado=Integer.parseInt(numeroDeEmpleado.getText());
        String sexo = (String) sexoad.getSelectedItem();
        LocalDate fechaNacimiento = LocalDate.of(an, mn, dn);
        
            Metodos.validarDNI(dni);
        boolean  encontrado = ventanaFormularioAltaDoctor.validarDniEnfer(dni);

            //si lo encuentro, muestro un error
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Ya existe un Empleado con ese DNI",
                        "Error", JOptionPane.ERROR_MESSAGE);
                
                this.dniad.setText("");
            } else {
                //Sino esta en la lista, lo añado
                ventanaFormularioAltaDoctor.altaDoctor(new Doctor(numeroEmpleado, nombread.getText(), apellidoad.getText(), dni, sexo, fechaNacimiento));
                JOptionPane.showMessageDialog(this, "Se ha añadido el Doctor",
                        "Añadido", JOptionPane.INFORMATION_MESSAGE);
           
                this.dniad.setText("");
                this.nombread.setText("");
                this.apellidoad.setText("");
                this.anioFechaNacimientoaa.setText("");
                this.mesFechaNacimientoaa.setText("");
                this.diaFechaNacimientoaa.setText("");
                this.numeroDeEmpleado.setText("");
           

            }
     } catch (DNIException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
     } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
     }    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sexoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoadActionPerformed
        
    }//GEN-LAST:event_sexoadActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void numeroDeEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroDeEmpleadoKeyTyped
        char c = evt.getKeyChar();

        if(Character.isLetter(c)) evt.consume();

        if(numeroDeEmpleado.getText().length() >= 4) evt.consume();
    }//GEN-LAST:event_numeroDeEmpleadoKeyTyped

    private void numeroDeEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDeEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDeEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioFechaNacimientoaa;
    private javax.swing.JTextField apellidoad;
    private javax.swing.JTextField diaFechaNacimientoaa;
    private javax.swing.JTextField dniad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mesFechaNacimientoaa;
    private javax.swing.JTextField nombread;
    private javax.swing.JTextField numeroDeEmpleado;
    private javax.swing.JComboBox<String> sexoad;
    // End of variables declaration//GEN-END:variables
}
