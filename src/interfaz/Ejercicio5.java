/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.CuentaDavivienda;
import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Ejercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio5
     */
    public Ejercicio5() {
        initComponents(); 
        cmdGuardar.setEnabled(true);
        cmbDavivienda.setEnabled(false);
        cmdTramite.setEnabled(false);
        cmdBorrar.setEnabled(true);
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
        txtNumeroCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosAdjuntos = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cmdGuardar = new javax.swing.JButton();
        cmdTramite = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmbDavivienda = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 2, 18)); // NOI18N
        jLabel1.setText("Ejercicio5");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 153));
        jLabel2.setText("numero de cuenta (Davivienda)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("identificacion del usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("saldo actual de la cuenta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtSaldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 255));
        jLabel5.setText("interes anual (porcentaje)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        jPanel1.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDatosAdjuntos.setEditable(false);
        txtDatosAdjuntos.setBackground(new java.awt.Color(0, 255, 255));
        txtDatosAdjuntos.setColumns(20);
        txtDatosAdjuntos.setFont(new java.awt.Font("Lucida Sans", 2, 18)); // NOI18N
        txtDatosAdjuntos.setForeground(new java.awt.Color(204, 0, 204));
        txtDatosAdjuntos.setRows(5);
        txtDatosAdjuntos.setSelectedTextColor(new java.awt.Color(153, 255, 102));
        jScrollPane1.setViewportView(txtDatosAdjuntos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 190));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 420, 190));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("datos adjuntos\n");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        cmdGuardar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdGuardar.setForeground(new java.awt.Color(51, 0, 255));
        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, -1));

        cmdTramite.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdTramite.setForeground(new java.awt.Color(153, 102, 255));
        cmdTramite.setText("Tramite Bancario");
        cmdTramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTramiteActionPerformed(evt);
            }
        });
        jPanel1.add(cmdTramite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 204, 51));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, -1));

        cmbDavivienda.setBackground(new java.awt.Color(0, 51, 51));
        cmbDavivienda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Opciones ", "Actualizar Saldo", "Ingresar Saldo", "Retirar ", "Mostrar " }));
        jPanel1.add(cmbDavivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(698, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
      if (txtNumeroCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese numero de cuenta davivienda", "error", JOptionPane.ERROR_MESSAGE);
            txtNumeroCuenta.requestFocusInWindow();
        } else if (Integer.parseInt(txtNumeroCuenta.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El número de cuenta no puede ser 0", "error", JOptionPane.ERROR_MESSAGE);
            txtNumeroCuenta.requestFocusInWindow();
            txtNumeroCuenta.selectAll();
        } else if (txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese identificacion del usuario", "error", JOptionPane.ERROR_MESSAGE);
            txtId.requestFocusInWindow();
        } else if (Integer.parseInt(txtId.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "Identificacion del usuario no puede ser cero ", "error", JOptionPane.ERROR_MESSAGE);
            txtId.requestFocusInWindow();
            txtId.selectAll();
        } else if (txtSaldoActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese saldo actual de la cuenta davivienda", "error", JOptionPane.ERROR_MESSAGE);
            txtSaldoActual.requestFocusInWindow();
        } else if (Integer.parseInt(txtSaldoActual.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El saldo actual no puede ser cero", "error", JOptionPane.ERROR_MESSAGE);
            txtSaldoActual.requestFocusInWindow();
            txtSaldoActual.selectAll();
        } else if (txtInteres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese interes anual", "error", JOptionPane.ERROR_MESSAGE);
            txtInteres.requestFocusInWindow();
        } else if (Integer.parseInt(txtInteres.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El interes anual no puede ser 0", "error", JOptionPane.ERROR_MESSAGE);
            txtInteres.requestFocusInWindow();
            txtInteres.selectAll();
        } else {
            JOptionPane.showMessageDialog(this, "Cuenta davivienda ya guardada efectivamante en el sistema");
            txtNumeroCuenta.setEditable(false);
            txtId.setEditable(false);
            txtSaldoActual.setEditable(false);
            txtInteres.setEditable(false);
            cmdGuardar.setEnabled(false);
            cmbDavivienda.setEnabled(true);
            cmdTramite.setEnabled(true);
            cmdBorrar.setEnabled(true); 
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdTramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTramiteActionPerformed
     txtDatosAdjuntos.setText(""); 
      CuentaDavivienda userdata,admin;
        int numerocuenta, id_cliente,operacion;
        String datos, ret;
        long saldo_actual, interes, ingreso = 0, actualizar = 0, retiro;
        numerocuenta = Integer.parseInt(txtNumeroCuenta.getText());
        id_cliente = Integer.parseInt(txtId.getText());
        saldo_actual = Long.parseLong(txtSaldoActual.getText());
        interes =Long.parseLong(txtInteres.getText());
        operacion = cmbDavivienda.getSelectedIndex();
        userdata=new CuentaDavivienda(numerocuenta, id_cliente, saldo_actual, interes); 
        JOptionPane.showMessageDialog(this,"Realice todas sus operaciones y conozca todo lo que puede hacer, en el nuevo davivienda.netbeans@interfazgraffic.org");
        switch (operacion) {
            case 0:
            JOptionPane.showMessageDialog(this, "Seleccione tramite a realizar en nuestro servidor", "Error", JOptionPane.ERROR_MESSAGE);
            cmbDavivienda.requestFocusInWindow();
            break;
            case 1:
            actualizar = userdata.actualizaciondatos();
            txtSaldoActual.setText("" + actualizar);
            JOptionPane.showMessageDialog(this, "Saldo actualizado en el sistema !Puede Continuar! ");
            break;
            case 2:
            int sw = 1;
            do {
                try {
                    ingreso =Long.parseLong(JOptionPane.showInputDialog(this, "Cantidad de dinero a ingresar en la cuenta davivienda"));
                    actualizar = userdata.ingresarinformacion(ingreso);
                    if (actualizar == 0) {
                        JOptionPane.showMessageDialog(this, "El valor a ingresar es negativo !No Puede Continuar!", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 1;
                    } else {
                        JOptionPane.showMessageDialog(this, "Saldo ingresado en la cuenta davivienda");
                        txtSaldoActual.setText("" + actualizar);
                        sw = 1;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite un numero que el sistema pueda registrar", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                    int res = JOptionPane.showConfirmDialog(this, "Desea salir de nuestro servidor", "Salir", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                    } else {
                        sw = 0;
                    }
                }
            } while (sw == 0);

            break;
            case 3:
            sw = 1;
            do {
                try {
                    retiro =Long.parseLong(JOptionPane.showInputDialog(this, "Cantidad de dinero a retirar en la cuenta davivienda"));
                    actualizar = userdata.retirodavivienda(retiro);
                    if (actualizar >= 0) {
                        JOptionPane.showMessageDialog(this, "Saldo retirado en la cuenta davivienda");
                        txtSaldoActual.setText("" + actualizar);
                        sw = 1;
                    } else {
                        JOptionPane.showMessageDialog(this, "El valor a retirar es negativo !No Puede Continuar!", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 1;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite un numero que el sistema pueda registrar", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                    int res = JOptionPane.showConfirmDialog(this, "Desea salir de nuestro servidor", "Salir", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                    } else {
                        sw = 0;
                    }
                }
            } while (sw == 0);

            break;
            case 4:
            admin = userdata.mostrarinformacion();
            datos = "El numero de la cuenta es: " + admin.getNumerocuenta()+ "\n"
            + "El numero de identificacion del cliente es: " + admin.getIdentificacion()+ "\n"
            + "El saldo actual es: " + admin.getSaldoactual()+ " \n"
            + "El interes anual es de: " + admin.getInteresanual()+ "%";
            txtDatosAdjuntos.setText(datos);
            break;
      
           
        }      
            
          
      
      
    }//GEN-LAST:event_cmdTramiteActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtNumeroCuenta.setText("");
        txtId.setText("");
        txtSaldoActual.setText("");
        txtInteres.setText("");
        txtDatosAdjuntos.setText("");
        txtNumeroCuenta.setEditable(true);
        txtId.setEditable(true);
        txtSaldoActual.setEditable(true);
        txtInteres.setEditable(true);
        cmdGuardar.setEnabled(true);
        cmbDavivienda.setEnabled(false);
        cmbDavivienda.setSelectedIndex(0);
        cmdTramite.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtNumeroCuenta.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuentaKeyTyped
       char c=evt.getKeyChar(); 
      if(!Character.isDigit(c)){ 
        getToolkit(); 
      evt.consume();
      }
    }//GEN-LAST:event_txtNumeroCuentaKeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
      char c=evt.getKeyChar(); 
      if(!Character.isDigit(c)){ 
       getToolkit(); 
       evt.consume();
      }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtSaldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoActualKeyTyped
      char c=evt.getKeyChar(); 
      if(!Character.isDigit(c)){ 
        getToolkit(); 
        evt.consume();
      }
    }//GEN-LAST:event_txtSaldoActualKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
      char c=evt.getKeyChar(); 
       if(!Character.isDigit(c)){ 
        getToolkit(); 
        evt.consume(); 
       } 
    }//GEN-LAST:event_txtInteresKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDavivienda;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdTramite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDatosAdjuntos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
