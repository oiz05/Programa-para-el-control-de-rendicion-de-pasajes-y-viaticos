/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDWIN
 */
public class FrmRemitirSolicitudAContador extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private Object[] o=new Object[5];
    /**
     * Creates new form FrmRemitirSolicitudAContador
     */
    public FrmRemitirSolicitudAContador() {
        initComponents();
        dtm= (DefaultTableModel) jSolicitudesEnviadas.getModel();
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
        jLabel4 = new javax.swing.JLabel();
        tfCodigoEncargadoAdministrativo = new javax.swing.JTextField();
        tfCodigoContador = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCodigoSolicitud = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSolicitudesEnviadas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfBusquedaDevolucionTeso = new javax.swing.JTextField();
        btnEditarEnvio = new javax.swing.JButton();
        btnEliminarEnvio = new javax.swing.JButton();
        btnBuscarEnvio = new javax.swing.JButton();
        btnNuevoEnvio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remitir Solicitud a Contador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo Encargado Administrativo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, -1));

        jLabel4.setText("Codigo Contador:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));
        jPanel1.add(tfCodigoEncargadoAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));
        jPanel1.add(tfCodigoContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 150, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_as.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 90, -1));

        jLabel2.setText("Codigo de Solicitud:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));
        jPanel1.add(tfCodigoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 150, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes Enviadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSolicitudesEnviadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo E.A.", "Codigo Solicitud", "Codigo Contador"
            }
        ));
        jScrollPane1.setViewportView(jSolicitudesEnviadas);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 541, 240));

        jLabel5.setText("Busqueda:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 75, 20));
        jPanel2.add(tfBusquedaDevolucionTeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 176, 30));

        btnEditarEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/layer_edit.png"))); // NOI18N
        btnEditarEnvio.setText("Editar");
        jPanel2.add(btnEditarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        btnEliminarEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminarEnvio.setText("Eliminar");
        jPanel2.add(btnEliminarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        btnBuscarEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/find.png"))); // NOI18N
        btnBuscarEnvio.setText("Buscar");
        jPanel2.add(btnBuscarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        btnNuevoEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        btnNuevoEnvio.setText("Nuevo");
        jPanel2.add(btnNuevoEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codEA=tfCodigoEncargadoAdministrativo.getText();
        String codCo=tfCodigoContador.getText();
        String codSo=tfCodigoSolicitud.getText();
        

        o[0]=codEA;
        o[1]=codSo;
        o[2]=codCo;
        dtm.addRow(o);
        
        JOptionPane.showMessageDialog(this, "La solicitud se ha enviado correctamente.");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRemitirSolicitudAContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRemitirSolicitudAContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRemitirSolicitudAContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRemitirSolicitudAContador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRemitirSolicitudAContador().setVisible(true);
            }
        });
    }
    private void Limpiar() {
        tfCodigoEncargadoAdministrativo.setText("");
        tfCodigoContador.setText("");
        tfCodigoSolicitud.setText("");
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEnvio;
    private javax.swing.JButton btnEditarEnvio;
    private javax.swing.JButton btnEliminarEnvio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevoEnvio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jSolicitudesEnviadas;
    private javax.swing.JTextField tfBusquedaDevolucionTeso;
    private javax.swing.JTextField tfCodigoContador;
    private javax.swing.JTextField tfCodigoEncargadoAdministrativo;
    private javax.swing.JTextField tfCodigoSolicitud;
    // End of variables declaration//GEN-END:variables
}
