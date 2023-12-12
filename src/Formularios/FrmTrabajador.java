/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Cargo;
import Clases.Trabajador;
import Clases.Usuario;
import Controlador.cTrabajador;
import Controlador.cUsuario;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
public class FrmTrabajador extends javax.swing.JFrame {
    /*private DefaultTableModel dtm;
    private Object[] o=new Object[8];*/

    /**
     * Creates new form FrmTrabajador
     */
    public FrmTrabajador() {
        /*initComponents();
        dtm= (DefaultTableModel) jTtrabajadores.getModel();+*/
        initComponents();
        this.jTtrabajadores.setModel(modelo);
        this.modelo.addColumn("Nombre");
        this.modelo.addColumn("Apellidos");
        this.modelo.addColumn("Codigo de trabajador");
        this.modelo.addColumn("Tipo de Documento");
        this.modelo.addColumn("Sexo");
        this.modelo.addColumn("Direccion");
        this.modelo.addColumn("Nombre de Cargo");
        this.modelo.addColumn("Tipo de Cargo");
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbListaTrabajadores = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtrabajadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigoTrabajador = new javax.swing.JTextField();
        cbxTipodeDocumento = new javax.swing.JComboBox<>();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        tfDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbxNombreCargo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxTipoCargo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTtrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtrabajadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTtrabajadores);

        jLabel1.setText("Búsqueda:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/find.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pencil_add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/to_do_list_cheked_all.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancel.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtbListaTrabajadores.addTab("Listado de trabajadores", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 20));

        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel4.setText("Codigo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel5.setText("Tipo de Documento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel6.setText("Sexo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel7.setText("Direccion:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        tfCodigoTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoTrabajadorActionPerformed(evt);
            }
        });
        jPanel3.add(tfCodigoTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 124, -1));

        cbxTipodeDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Carnet de Extranjeria", "RUC", " " }));
        cbxTipodeDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipodeDocumentoActionPerformed(evt);
            }
        });
        jPanel3.add(cbxTipodeDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 130, -1));
        jPanel3.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 236, -1));
        jPanel3.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 236, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No especificado", " " }));
        jPanel3.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 120, -1));
        jPanel3.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 240, 30));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/save_as.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 100, 30));

        jLabel8.setText("Nombre de Cargo:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        cbxNombreCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comisionado", "Encargado Administrativo", "Contador", "Tesorero", " ", " " }));
        jPanel3.add(cbxNombreCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 130, -1));

        jLabel9.setText("Tipo de Cargo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel10.setText("REGISTRO DE TRABAJADOR");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        cbxTipoCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe", "Operario", " ", " " }));
        jPanel3.add(cbxTipoCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtbListaTrabajadores.addTab("Registro de trabajadores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtbListaTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbListaTrabajadores, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel modelo = new DefaultTableModel();
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        //LIMPIAR
        tfCodigoTrabajador.setText("");
        cbxTipodeDocumento.setSelectedIndex(0);
        cbxSexo.setSelectedIndex(0);
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        cbxNombreCargo.setSelectedIndex(0);
        cbxTipoCargo.setSelectedIndex(0);
        tfCodigoTrabajador.grabFocus();
      
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbxTipodeDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipodeDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipodeDocumentoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String codT=tfCodigoTrabajador.getText();
        String tipoDocumento=cbxTipodeDocumento.getSelectedItem().toString();
        String sexo=cbxSexo.getSelectedItem().toString();
        String nombre=tfNombre.getText();
        String apellidos=tfApellidos.getText();
        String direccion=tfDireccion.getText();
        String nombreCargo=cbxNombreCargo.getSelectedItem().toString();
        String tipoCargo=cbxTipoCargo.getSelectedItem().toString();
        Cargo cargo1=new Cargo();
        cargo1.setNombreCargo(nombreCargo);
        cargo1.setTipoCargo(tipoCargo);
        /*
        o[0]=codT;
        o[1]=nombre;
        o[2]=apellidos;
        o[3]=tipoDocumento;
        o[4]=sexo;
        o[5]=direccion;
        o[6]=nomCargo;
        o[7]=tipoCargo;
        dtm.addRow(o);*/
        
        this.modelo.addRow(new Object[]{
            this.tfCodigoTrabajador.getText(),
            this.tfNombre.getText(),
            this.tfApellidos.getText(),
            this.cbxTipodeDocumento.getSelectedItem(),
            this.cbxSexo.getSelectedItem(),
            this.tfDireccion.getText(),
            this.cbxNombreCargo.getSelectedItem(),
            this.cbxTipoCargo.getSelectedItem()
        
        });
        //BASE DE DATOS-----------------------------------------------------------
        //GUARDAR EN LA BASE DE DATOS:
        Trabajador t1=new Trabajador(codT,nombre,apellidos,tipoDocumento,sexo,direccion,cargo1);
        cTrabajador tbj=new cTrabajador();
        tbj.addTrabajador(t1);
        
        
        //-------------------------------------------------------------------------
        
        //VALIDAR INGRESO DE DATOS
        JOptionPane.showMessageDialog(this, "El trabajador se ha registrado correctamente.");
        

        //LIMPIAR
        tfCodigoTrabajador.setText("");
        cbxTipodeDocumento.setSelectedIndex(0);
        cbxSexo.setSelectedIndex(0);
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        cbxNombreCargo.setSelectedIndex(0);
        cbxTipoCargo.setSelectedIndex(0);
       
    }//GEN-LAST:event_btnGuardarActionPerformed
        int filas;
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String []datos=new String[8];
        datos[0]=tfCodigoTrabajador.getText();
        datos[1]=tfNombre.getText();
        datos[2]=tfApellidos.getText();
        datos[3]=this.cbxTipodeDocumento.getSelectedItem().toString();
        datos[4]=this.cbxSexo.getSelectedItem().toString();
        datos[5]=tfDireccion.getText();
        datos[6]=this.cbxNombreCargo.getSelectedItem().toString();
        datos[7]=this.cbxTipoCargo.getSelectedItem().toString();
        
        for(int i=0; i<jTtrabajadores.getColumnCount();i++){
            modelo.setValueAt(datos[i], filas, i);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila_seleccionada = jTtrabajadores.getSelectedRow();
        if(fila_seleccionada>=0){
            modelo.removeRow(fila_seleccionada);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una fila por favor");
        }
        
        //LIMPIAR
        tfCodigoTrabajador.setText("");
        cbxTipodeDocumento.setSelectedIndex(0);
        cbxSexo.setSelectedIndex(0);
        tfNombre.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        cbxNombreCargo.setSelectedIndex(0);
        cbxTipoCargo.setSelectedIndex(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTtrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtrabajadoresMouseClicked
        int fila_seleccionada = jTtrabajadores.getSelectedRow();
        tfCodigoTrabajador.setText(jTtrabajadores.getValueAt(fila_seleccionada, 0).toString());
        tfNombre.setText(jTtrabajadores.getValueAt(fila_seleccionada, 1).toString());
        tfApellidos.setText(jTtrabajadores.getValueAt(fila_seleccionada, 2).toString());
        cbxTipodeDocumento.setSelectedItem(jTtrabajadores.getValueAt(fila_seleccionada, 3).toString());
        cbxSexo.setSelectedItem(jTtrabajadores.getValueAt(fila_seleccionada, 4).toString());
        tfDireccion.setText(jTtrabajadores.getValueAt(fila_seleccionada, 5).toString());
        cbxNombreCargo.setSelectedItem(jTtrabajadores.getValueAt(fila_seleccionada, 6).toString());
        cbxTipoCargo.setSelectedItem(jTtrabajadores.getValueAt(fila_seleccionada, 7).toString());
        filas=fila_seleccionada;
    
    }//GEN-LAST:event_jTtrabajadoresMouseClicked

    private void tfCodigoTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoTrabajadorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        //BOTON LISTAR----------------------------------------------------------
        if(tfBusqueda.getText().isEmpty()){
        cTrabajador tbj=new cTrabajador();

        //Mostrar los datos
            DefaultTableModel dtm = (DefaultTableModel) jTtrabajadores.getModel();
            while(dtm.getRowCount()>0)dtm.removeRow(0);
            
            for (Trabajador aux : tbj.getTrabajadores()) {
                Vector fila = new Vector();
                fila.add(aux.getNombre());
                fila.add(aux.getApellido());
                fila.add(aux.getCodigo());
                fila.add(aux.getTipoDocumento());
                fila.add(aux.getSexo());
                fila.add(aux.getDireccion());
                fila.add(aux.getCargo().getTipoCargo());
                fila.add(aux.getCargo().getNombreCargo());
                dtm.addRow(fila);
            }
        }
        //------------------------------------------------------------------------
        
        
        //BASE DE DATOS---------------------------------------------
        //BUSCAR POR CODIGO_TRABAJADOR EN LA BASE DE DATOS:
        
        cTrabajador ctb=new cTrabajador();
        Trabajador aux=new Trabajador();
        DefaultTableModel dtm=new DefaultTableModel();
        aux=ctb.getTrabajador(tfBusqueda.getText());
        System.out.println(ctb.getTrabajador(tfBusqueda.getText()).getNombre());
        Vector fila = new Vector();
                fila.add(aux.getNombre());
                fila.add(aux.getApellido());
                fila.add(aux.getCodigo());
                fila.add(aux.getTipoDocumento());
                fila.add(aux.getSexo());
                fila.add(aux.getDireccion());
                fila.add(aux.getCargo().getTipoCargo());
                fila.add(aux.getCargo().getNombreCargo());
                dtm.addRow(fila);
                
                
               
            
            for (int i = 1; i <= dtm.getColumnCount(); i++) {
                modelo.addColumn(dtm.getColumnName(i));
            }

            // Llenar el modelo con los datos de la consulta
            while (resultado.next()) {
                Object[] fila = new Object[numColumnas];
                for (int i = 1; i <= numColumnas; i++) {
                    fila[i - 1] = resultado.getObject(i);
                }
                modelo.addRow(fila);
            }

            // Mostrar los resultados en la tabla
            tablaResultados.setModel(modelo);
            
            
        //cTrabajador tbj=new cTrabajador();
        //tbj.getTrabajador(tfBusqueda.getText());
        
        /*
        if(!tfBusqueda.getText().isEmpty()){
            cTrabajador ctr=new cTrabajador();
            DefaultTableModel dtm = (DefaultTableModel) jTtrabajadores.getModel();
            
            Vector fila = new Vector();
            for (int i = 0; i < ctr.getTrabajadores().size(); i++) {
                
                if (tfBusqueda.getText().equalsIgnoreCase(ctr.getTrabajadores().get(i).getCodigo())) {
                    Trabajador aux=new Trabajador();
                    aux.setCodigo(ctr.getTrabajador(tfBusqueda.getText()).getCodigo());
                    System.out.println(aux.getCodigo());
                    fila.add(aux.getCodigo());
                    fila.add(aux.getNombre());
                    fila.add(aux.getApellido());
                    fila.add(aux.getTipoDocumento());
                    fila.add(aux.getSexo());
                    fila.add(aux.getDireccion());
                    fila.add(aux.getCargo().getTipoCargo());
                    fila.add(aux.getCargo().getNombreCargo());
                    dtm.addRow(fila);
                }
            }
        }
       
    */
        //----------------------------------------------------------
        
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
            java.util.logging.Logger.getLogger(FrmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTrabajador().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbxNombreCargo;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxTipoCargo;
    private javax.swing.JComboBox<String> cbxTipodeDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTtrabajadores;
    private javax.swing.JTabbedPane jtbListaTrabajadores;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfCodigoTrabajador;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
