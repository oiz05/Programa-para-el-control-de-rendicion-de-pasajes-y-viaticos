/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Usuario;
import Controlador.cUsuario;
import Formularios.FrmComprobarVericidadDAG;
import Formularios.FrmDevolverViaticoFaltante;
import Formularios.FrmDevolverViaticoSobrante;
import Formularios.FrmRealizarRendicionCuentas;
import Formularios.FrmRegistrarSolicitudViatico;
import Formularios.FrmRemitirSolicitudAContador;
import Formularios.FrmTrabajador;
import Formularios.FrmVerificacionSolicitudViatico;
import javax.swing.JFrame;

/**
 *
 * @author EDWIN
 */
public class FrmMenu extends javax.swing.JFrame {
    private Usuario user;

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public FrmMenu(Usuario user) {
        this.user = user;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //Habilitar o Deshabilitar opciones
        cUsuario cU=new cUsuario();
        
        if(user.getNombre_cargo().equals("COMISIONADO"))
        {
            this.jProcesos.setEnabled(false);
            
        }
        if(user.getNombre_cargo().equals("CONTADOR"))
        {
            this.jReportes.setEnabled(false);
            this.jProcesos.setEnabled(false);
        }
        if(user.getNombre_cargo().equals("TESORERO"))
        {
            this.jReportes.setEnabled(false);
            this.jProcesos.setEnabled(false);
        }
        if(user.getNombre_cargo().equals("ENCARGADO ADMINISTRATIVO"))
            {this.jMantenimiento.setEnabled(false);}
        if(user.getNombre_cargo().equals("SYSTEM"))
        {
            this.jSeguridad.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMantenimiento = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jProcesos = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jReportes = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeguridad = new javax.swing.JMenu();
        mnuUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMantenimiento.setText("Mantenimiento");

        jMenuItem1.setText("Trabajadores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMantenimiento.add(jMenuItem1);

        jMenuItem2.setText("Solicitudes de Viatico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMantenimiento.add(jMenuItem2);

        jMenuBar1.add(jMantenimiento);

        jProcesos.setText("Procesos");

        jMenuItem8.setText("Registrar Trabajador");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem8);

        jMenuItem9.setText("Registrar Solicitud de Viatico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem9);

        jMenuItem10.setText("Remitir Solicitud a Contador");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem10);

        jMenuItem13.setText("Devolver Viatico Sobrante");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem13);

        jMenuItem14.setText("Devolver Viatico Faltante");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem14);

        jMenuItem16.setText("Realizar Rendicion de Cuentas");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jProcesos.add(jMenuItem16);

        jMenuBar1.add(jProcesos);

        jReportes.setText("Reportes");

        jMenuItem12.setText("Verificar Solicitud de Viatico");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jReportes.add(jMenuItem12);

        jMenuItem15.setText("Comprobar Documento Acreditador de Gasto");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jReportes.add(jMenuItem15);

        jMenuBar1.add(jReportes);

        jSeguridad.setText("Seguridad");

        mnuUsuario.setText("Usuarios");
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });
        jSeguridad.add(mnuUsuario);

        jMenuBar1.add(jSeguridad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmTrabajador regTrabajador = new FrmTrabajador();
        regTrabajador.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        new FrmMttoUsuario().setVisible(true);
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FrmTrabajador regTrabajador = new FrmTrabajador();
        regTrabajador.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FrmRegistrarSolicitudViatico regSoliViati = new FrmRegistrarSolicitudViatico();
        regSoliViati.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrmRemitirSolicitudAContador remSoliConta = new FrmRemitirSolicitudAContador();
        remSoliConta.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        FrmDevolverViaticoSobrante devolSobra = new FrmDevolverViaticoSobrante();
        devolSobra.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FrmDevolverViaticoFaltante devolFalta = new FrmDevolverViaticoFaltante();
        devolFalta.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        FrmRealizarRendicionCuentas realiRD = new FrmRealizarRendicionCuentas();
        realiRD.setVisible(true);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FrmVerificacionSolicitudViatico veriSV = new FrmVerificacionSolicitudViatico();
        veriSV.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        FrmComprobarVericidadDAG compDAG = new FrmComprobarVericidadDAG();
        compDAG.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmRegistrarSolicitudViatico regSoliViati = new FrmRegistrarSolicitudViatico();
        regSoliViati.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMantenimiento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jProcesos;
    private javax.swing.JMenu jReportes;
    private javax.swing.JMenu jSeguridad;
    private javax.swing.JMenuItem mnuUsuario;
    // End of variables declaration//GEN-END:variables
}
