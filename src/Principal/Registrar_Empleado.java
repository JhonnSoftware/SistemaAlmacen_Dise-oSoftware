
package Principal;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registrar_Empleado extends javax.swing.JFrame {
    
    Empleado emp = new Empleado();
    EmpleadoDAO empDAO = new EmpleadoDAO();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Registrar_Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoMEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        txtDNIEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarEmpleado = new javax.swing.JTextField();
        btnBuscarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEmpleado = new javax.swing.JTable();
        btnEditarEmpleado = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtApellidoPEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbRolEmpleado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("DNI:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        btnRegistrarEmpleado.setBackground(new java.awt.Color(0, 134, 190));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("REGISTRAR");
        btnRegistrarEmpleado.setBorder(null);
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 40));

        btnEliminarEmpleado.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("ELIMINAR");
        btnEliminarEmpleado.setBorder(null);
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 40));

        btnNuevoEmpleado.setBackground(new java.awt.Color(0, 134, 190));
        btnNuevoEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoEmpleado.setText("NUEVO");
        btnNuevoEmpleado.setBorder(null);
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 120, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("Rol:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        txtApellidoMEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtApellidoMEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 190, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("Apellido Materno:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        txtIdEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        txtDNIEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtDNIEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 130, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("BUSCAR:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        txtBuscarEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 427, 30));

        btnBuscarEmpleado.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("BUSCAR");
        btnBuscarEmpleado.setBorder(null);
        jPanel3.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 90, 30));

        tblListaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido.P", "Apellido.M", "DNI", "Rol"
            }
        ));
        jScrollPane1.setViewportView(tblListaEmpleado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 700, 151));

        btnEditarEmpleado.setBackground(new java.awt.Color(0, 134, 190));
        btnEditarEmpleado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEmpleado.setText("EDITAR");
        btnEditarEmpleado.setBorder(null);
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 40));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setText("Apellido Paterno:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        txtApellidoPEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtApellidoPEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 190, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("EMPLEADO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        cbRolEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Almacenero", "Administrador", " " }));
        jPanel3.add(cbRolEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ListarProveedor(){
        List<Empleado> ListaProv = empDAO.ListarEmpleado();
        modelo = (DefaultTableModel) tblListaEmpleado.getModel();
        Object[] ob = new Object[5];
        
        for(int i=0; i < ListaProv.size(); i++){
            ob[0] = ListaProv.get(i).getIdEmpleado();
            ob[1] = ListaProv.get(i).getNombre();
            ob[2] = ListaProv.get(i).getApellidoPaterno();
            ob[3] = ListaProv.get(i).getApellidoMaterno();
            ob[4] = ListaProv.get(i).getDNI();
            ob[5] = ListaProv.get(i).getRol();
            modelo.addRow(ob);
        }
        tblListaEmpleado.setModel(modelo);
    }
    
    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        if(!"".equals(txtNombreEmpleado.getText()) || !"".equals(txtApellidoMEmpleado.getText()) || !"".equals(cbRolEmpleado.getSelectedIndex()) || !"".equals(txtDNIEmpleado.getText())){
            emp.setNombre(txtNombreEmpleado.getText());
            emp.setApellidoPaterno(txtApellidoPEmpleado.getText());
            emp.setApellidoMaterno(txtApellidoMEmpleado.getText());
            emp.setDNI(txtDNIEmpleado.getText());
            int selec = cbRolEmpleado.getSelectedIndex();
            emp.setRol((String)cbRolEmpleado.getItemAt(selec));
            
            empDAO.RegistrarEmpleado(emp);
            JOptionPane.showMessageDialog(null, "Proveedor Registrado");
        }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        if(!"".equals(txtIdEmpleado.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdEmpleado.getText());
                empDAO.EliminarEmpleado(id);
            }
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        txtNombreEmpleado.setText("");
        txtDNIEmpleado.setText("");
        txtApellidoMEmpleado.setText("");
        cbRolEmpleado.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed

    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JComboBox<String> cbRolEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaEmpleado;
    private javax.swing.JTextField txtApellidoMEmpleado;
    private javax.swing.JTextField txtApellidoPEmpleado;
    private javax.swing.JTextField txtBuscarEmpleado;
    private javax.swing.JTextField txtDNIEmpleado;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
