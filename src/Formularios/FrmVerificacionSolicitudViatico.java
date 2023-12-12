
package Formularios;


import Clases.SolicitudViatico;
import Controlador.cTrabajador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formularios.FrmRegistrarSolicitudViatico;
import java.util.Vector;
import javax.swing.JOptionPane;
public class FrmVerificacionSolicitudViatico extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    

   
    public FrmVerificacionSolicitudViatico() {
        initComponents();
        this.jTListado.setModel(modelo);
        this.modelo.addColumn("Codigo de Solicitud");
        this.modelo.addColumn("Codigo del Remitente");
        this.modelo.addColumn("Fecha de la Solicitud");
        this.modelo.addColumn("Fecha de Ida");
        this.modelo.addColumn("Fecha de Retorno");
        this.modelo.addColumn("Tipo de Viaje");
        this.modelo.addColumn("Monto");
        this.modelo.addColumn("Estado de solicitud");
        
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
        jLabel2 = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbxEstado = new javax.swing.JComboBox<>();
        btnEditar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListado = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verificacion de Solicitudes de Viaticos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Búsqueda:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        tfBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(tfBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel4.setText("Estado de Solicitud:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 110, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_as.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Denegado", " " }));
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 140, -1));

        btnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/layer_edit.png"))); // NOI18N
        btnEditar1.setText("Editar");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jTListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListadoMouseClicked(evt);
            }
        });
        jTListado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTListadoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTListado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 690, 300));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/find.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        /*int fila_seleccionada = jVerificacionSolicitudes.getSelectedRow();
        if(fila_seleccionada>=0){
            modelo.removeRow(fila_seleccionada);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila por favor");
        }
        
        tfCodigoSolicitud.setText("");
        tfCodigoComisionado.setText("");
        cbxEstado.setSelectedIndex(0);*/
         
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNuevoActionPerformed
    int filas;
    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        String []datos=new String[8];
        datos[7]=cbxEstado.getSelectedItem().toString();
        
        for(int i=0; i<jTListado.getColumnCount();i++){
            modelo.setValueAt(datos[i], filas, i);
        }
        
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tfBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBusquedaActionPerformed

    private void jTListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListadoMouseClicked
        int fila_seleccionada = jTListado.getSelectedRow();
        cbxEstado.setSelectedItem(jTListado.getValueAt(fila_seleccionada, 7).toString());
        filas=fila_seleccionada;
    }//GEN-LAST:event_jTListadoMouseClicked

    private void jTListadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTListadoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTListadoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // String cod=tfBusqueda.getText();
        // int i=0;
        // TODO add your handling code here:
        //BOTON LISTAR----------------------------------------------------------
        if(tfBusqueda.getText().isEmpty()){
            cTrabajador tbj=new cTrabajador();

            //Mostrar los datos
            DefaultTableModel dtm = (DefaultTableModel) jTListado.getModel();
            while(dtm.getRowCount()>0)dtm.removeRow(0);

            for (SolicitudViatico aux : tbj.getSolicitudes()) {
                Vector fila = new Vector();
                fila.add(aux.getCodSolicitud());
                fila.add(aux.getComisionado().getCodigo());
                fila.add(aux.getFechaSolicitud());
                fila.add(aux.getFechaIda());
                fila.add(aux.getFechaRetorno());
                fila.add(aux.getTipoViaje());
                fila.add(aux.getMonto().getMontoViatico());
                fila.add(aux.getEstado());
                dtm.addRow(fila);
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVerificacionSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVerificacionSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVerificacionSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVerificacionSolicitudViatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVerificacionSolicitudViatico().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListado;
    private javax.swing.JTextField tfBusqueda;
    // End of variables declaration//GEN-END:variables

    /*private void getListado() {
        tablaRegistroSV=(DefaultTableModel)FrmRegistrarSolicitudViatico.getJTListado().getModel();
    }*/
}
