/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_Graficas;

import sistema.de.emergencia.medica.Hospital;

/**
 *
 * @author FRANCO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
       private Hospital hospital;
    public Principal() {
        
        hospital= new Hospital();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jBSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Afiliados = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMbajaafiliado = new javax.swing.JMenuItem();
        jMmodafiliado = new javax.swing.JMenuItem();
        jMmostrar = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Empleados = new javax.swing.JMenu();
        jMaltaemp = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMostraremp = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        Moviles = new javax.swing.JMenu();
        jMagregar = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        Afiliados.setText("Afiliados");

        jMenuItem1.setText("Alta Afiliado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Afiliados.add(jMenuItem1);

        jMbajaafiliado.setText("Baja Afiliado");
        jMbajaafiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbajaafiliadoActionPerformed(evt);
            }
        });
        Afiliados.add(jMbajaafiliado);

        jMmodafiliado.setText("Modificar Afiliado");
        Afiliados.add(jMmodafiliado);

        jMmostrar.setText("Mostrar Afiliado");
        jMmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmostrarActionPerformed(evt);
            }
        });
        Afiliados.add(jMmostrar);

        jMenuItem4.setText("Agregar Familiar");
        Afiliados.add(jMenuItem4);

        jMenuBar1.add(Afiliados);

        Empleados.setText("Empleados");

        jMaltaemp.setText("Alta Empleado");
        Empleados.add(jMaltaemp);

        jMenuItem3.setText("Baja Empleado");
        Empleados.add(jMenuItem3);

        jMostraremp.setText("Mostrar Empleado");
        Empleados.add(jMostraremp);

        jMenuItem5.setText("Modificar Empleado");
        Empleados.add(jMenuItem5);

        jMenuBar1.add(Empleados);

        Moviles.setText("Movil");

        jMagregar.setText("Agregar Movil");
        Moviles.add(jMagregar);

        jMenuItem7.setText("Baja movil");
        Moviles.add(jMenuItem7);

        jMenuBar1.add(Moviles);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMbajaafiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbajaafiliadoActionPerformed
       
        BajaAfiliado afi1 = new BajaAfiliado(hospital);
        afi1.show();

    }//GEN-LAST:event_jMbajaafiliadoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
             System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        AltaAfiliado afi = new AltaAfiliado(hospital);
        afi.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Afiliados;
    private javax.swing.JMenu Empleados;
    private javax.swing.JMenu Moviles;
    private javax.swing.JButton jBSalir;
    private javax.swing.JMenuItem jMagregar;
    private javax.swing.JMenuItem jMaltaemp;
    private javax.swing.JMenuItem jMbajaafiliado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMmodafiliado;
    private javax.swing.JMenuItem jMmostrar;
    private javax.swing.JMenuItem jMostraremp;
    // End of variables declaration//GEN-END:variables
}
