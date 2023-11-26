/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Viatico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDWIN
 */
public class FrmDevolverViaticoFaltante extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private Object[] o=new Object[5];
    /**
     * Creates new form FrmDevolverViaticoFaltante
     */
    public FrmDevolverViaticoFaltante() {
        initComponents();
        dtm= (DefaultTableModel) jDevolucionesComisionado.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCodigoTesorero = new javax.swing.JTextField();
        tfCodigoDestinatario = new javax.swing.JTextField();
        tfMontoViatico = new javax.swing.JTextField();
        tfGastoTotal = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCalcularDevolucionComisionado = new javax.swing.JButton();
        tfDevolucionComisionado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDevolucionesComisionado = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfBusquedaDevolucionComi = new javax.swing.JTextField();
        btnEditarDevolucionComi = new javax.swing.JButton();
        btnEliminarDevolucionComi = new javax.swing.JButton();
        btnBuscarDevolucionComi = new javax.swing.JButton();
        btnNuevoDevolucionComi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devolucion Viatico Faltante para Comisionado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo Tesorero:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, -1));

        jLabel2.setText("Monto Viatico:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel3.setText("Gasto Total:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel4.setText("Codigo Destinatario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        jPanel1.add(tfCodigoTesorero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 150, -1));
        jPanel1.add(tfCodigoDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, -1));
        jPanel1.add(tfMontoViatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, -1));
        jPanel1.add(tfGastoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_as.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 90, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        btnCalcularDevolucionComisionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/account_balances.png"))); // NOI18N
        btnCalcularDevolucionComisionado.setText("Calcular Devolucion a Comisionado:");
        btnCalcularDevolucionComisionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDevolucionComisionadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcularDevolucionComisionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, -1));
        jPanel1.add(tfDevolucionComisionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 120, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Devoluciones para Comisionado\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDevolucionesComisionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Tesorero", "Codigo Destinatario", "Gasto Total", "Monto Viatico", "Devolucion Comisionado"
            }
        ));
        jScrollPane1.setViewportView(jDevolucionesComisionado);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 83, 680, 284));

        jLabel5.setText("Busqueda:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 75, 20));
        jPanel2.add(tfBusquedaDevolucionComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 176, 30));

        btnEditarDevolucionComi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/layer_edit.png"))); // NOI18N
        btnEditarDevolucionComi.setText("Editar");
        jPanel2.add(btnEditarDevolucionComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        btnEliminarDevolucionComi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminarDevolucionComi.setText("Eliminar");
        jPanel2.add(btnEliminarDevolucionComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        btnBuscarDevolucionComi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/find.png"))); // NOI18N
        btnBuscarDevolucionComi.setText("Buscar");
        jPanel2.add(btnBuscarDevolucionComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        btnNuevoDevolucionComi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        btnNuevoDevolucionComi.setText("Nuevo");
        jPanel2.add(btnNuevoDevolucionComi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codTe=tfCodigoTesorero.getText();
        String codDesti=tfCodigoDestinatario.getText();
        String gasT=tfGastoTotal.getText();
        String devCom=tfDevolucionComisionado.getText();
        Viatico monto=new Viatico();
        monto.setMontoViatico(Double.parseDouble(tfMontoViatico.getText()));

        o[0]=codTe;
        o[1]=codDesti;
        o[2]=gasT;
        o[3]=monto.getMontoViatico();
        o[4]=devCom;
        dtm.addRow(o);
        
        JOptionPane.showMessageDialog(this, "La devolucion se ha realizado correctamente.");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularDevolucionComisionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDevolucionComisionadoActionPerformed
        double monto, gasT, devCom;
        
        monto=Double.parseDouble(tfMontoViatico.getText());
        gasT=Double.parseDouble(tfGastoTotal.getText());
        
        devCom=gasT-monto;
        
        tfDevolucionComisionado.setText(String.valueOf(devCom));
    }//GEN-LAST:event_btnCalcularDevolucionComisionadoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDevolverViaticoFaltante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDevolverViaticoFaltante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDevolverViaticoFaltante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDevolverViaticoFaltante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDevolverViaticoFaltante().setVisible(true);
            }
        });
    }
    private void Limpiar() {
        tfCodigoTesorero.setText("");
        tfCodigoDestinatario.setText("");
        tfMontoViatico.setText("");
        tfGastoTotal.setText("");
        tfDevolucionComisionado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDevolucionComi;
    private javax.swing.JButton btnCalcularDevolucionComisionado;
    private javax.swing.JButton btnEditarDevolucionComi;
    private javax.swing.JButton btnEliminarDevolucionComi;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevoDevolucionComi;
    private javax.swing.JTable jDevolucionesComisionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfBusquedaDevolucionComi;
    private javax.swing.JTextField tfCodigoDestinatario;
    private javax.swing.JTextField tfCodigoTesorero;
    private javax.swing.JTextField tfDevolucionComisionado;
    private javax.swing.JTextField tfGastoTotal;
    private javax.swing.JTextField tfMontoViatico;
    // End of variables declaration//GEN-END:variables
}
