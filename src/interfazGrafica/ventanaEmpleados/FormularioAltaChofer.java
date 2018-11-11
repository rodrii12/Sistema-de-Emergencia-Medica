/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica.ventanaEmpleados;

import Interfaces_Graficas.DNIException;
import Interfaces_Graficas.Metodos;
import clasessimples.Administrativo;
import interfazGrafica.ventanasafiliados.*;
import clasessimples.Afiliado;
import clasessimples.Chofer;
import clasessimples.Doctor;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import sistema.de.emergencia.medica.GestionHospital;

/**
 *
 * @author Miguel
 */
public class FormularioAltaChofer extends javax.swing.JFrame {

    GestionHospital ventanaFormularioAltaChofer;
    
    public FormularioAltaChofer(GestionHospital gh) {
        initComponents();
        ventanaFormularioAltaChofer = gh;
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
        nombreaad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellidoaad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dniaad = new javax.swing.JTextField();
        sexoad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        diaFechaNacimientoaad = new javax.swing.JTextField();
        mesFechaNacimientoaad = new javax.swing.JTextField();
        anioFechaNacimientoaad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numeroDeEmpleado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NOMBRE");

        nombreaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreaadKeyTyped(evt);
            }
        });

        jLabel2.setText("APELLIDO");

        apellidoaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoaadKeyTyped(evt);
            }
        });

        jLabel3.setText("DNI");

        dniaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniaadKeyTyped(evt);
            }
        });

        sexoad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino\t", "Femenino", " " }));
        sexoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoadActionPerformed(evt);
            }
        });

        jLabel4.setText("SEXO");

        diaFechaNacimientoaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFechaNacimientoaadActionPerformed(evt);
            }
        });
        diaFechaNacimientoaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diaFechaNacimientoaadKeyTyped(evt);
            }
        });

        mesFechaNacimientoaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesFechaNacimientoaadKeyTyped(evt);
            }
        });

        anioFechaNacimientoaad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioFechaNacimientoaadActionPerformed(evt);
            }
        });
        anioFechaNacimientoaad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anioFechaNacimientoaadKeyTyped(evt);
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

        jButton1.setText("INSCRIBIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(271, 271, 271))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dniaad, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(nombreaad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(164, 164, 164)
                                            .addComponent(sexoad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel2)
                                                    .addComponent(apellidoaad, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(numeroDeEmpleado))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(diaFechaNacimientoaad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(mesFechaNacimientoaad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(anioFechaNacimientoaad))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(549, 549, 549)))
                            .addComponent(jLabel6))
                        .addContainerGap(96, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaFechaNacimientoaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesFechaNacimientoaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioFechaNacimientoaad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(136, 136, 136))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_nombreaadKeyTyped

    private void apellidoaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)) evt.consume();
    }//GEN-LAST:event_apellidoaadKeyTyped

    private void dniaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(dniaad.getText().length() >= 8) evt.consume();
    }//GEN-LAST:event_dniaadKeyTyped

    private void diaFechaNacimientoaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFechaNacimientoaadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFechaNacimientoaadActionPerformed

    private void diaFechaNacimientoaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaFechaNacimientoaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(diaFechaNacimientoaad.getText().length() >= 2) evt.consume();
    }//GEN-LAST:event_diaFechaNacimientoaadKeyTyped

    private void mesFechaNacimientoaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesFechaNacimientoaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(mesFechaNacimientoaad.getText().length() >= 2) evt.consume();
    }//GEN-LAST:event_mesFechaNacimientoaadKeyTyped

    private void anioFechaNacimientoaadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioFechaNacimientoaadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioFechaNacimientoaadActionPerformed

    private void numeroDeEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroDeEmpleadoKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(numeroDeEmpleado.getText().length() >= 4) evt.consume();
    }//GEN-LAST:event_numeroDeEmpleadoKeyTyped

    private void anioFechaNacimientoaadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anioFechaNacimientoaadKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)) evt.consume();
        
        if(anioFechaNacimientoaad.getText().length() >= 4) evt.consume();
    }//GEN-LAST:event_anioFechaNacimientoaadKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        
        Integer dn,mn,an,numeroEmpleado, dni;
        dni = Integer.parseInt(dniaad.getText());
        dn= Integer.parseInt(diaFechaNacimientoaad.getText());
        mn=Integer.parseInt(mesFechaNacimientoaad.getText());
        an=Integer.parseInt(anioFechaNacimientoaad.getText());
        numeroEmpleado=Integer.parseInt(numeroDeEmpleado.getText());
        String sexo = (String) sexoad.getSelectedItem();
        LocalDate fechaNacimiento = LocalDate.of(an, mn, dn);
        
        Metodos.validarDNI(dni);
        boolean  encontrado = ventanaFormularioAltaChofer.validarDniEnfer(dni);

            //si lo encuentro, muestro un error
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "Ya existe un Empleado con ese DNI",
                        "Error", JOptionPane.ERROR_MESSAGE);
                //limpiar dni
                this.dniaad.setText("");
            } else {
                //Sino esta en la lista, lo añado
                ventanaFormularioAltaChofer.altaChofer(new Chofer(numeroEmpleado, nombreaad.getText(), apellidoaad.getText(), dni, sexo,fechaNacimiento));
                JOptionPane.showMessageDialog(this, "Se ha añadido el Chofer",
                    "Añadido", JOptionPane.INFORMATION_MESSAGE);
                
                //limpiar casillas si es correcto
           this.dniaad.setText("");
           this.nombreaad.setText("");
           this.apellidoaad.setText("");
           this.anioFechaNacimientoaad.setText("");
           this.mesFechaNacimientoaad.setText("");
           this.diaFechaNacimientoaad.setText("");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numeroDeEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDeEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDeEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioFechaNacimientoaad;
    private javax.swing.JTextField apellidoaad;
    private javax.swing.JTextField diaFechaNacimientoaad;
    private javax.swing.JTextField dniaad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mesFechaNacimientoaad;
    private javax.swing.JTextField nombreaad;
    private javax.swing.JTextField numeroDeEmpleado;
    private javax.swing.JComboBox<String> sexoad;
    // End of variables declaration//GEN-END:variables
}
