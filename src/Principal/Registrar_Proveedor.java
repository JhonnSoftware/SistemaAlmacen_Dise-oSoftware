
package Principal;

import java.util.List;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import static Principal.TresPasos_RegistrarPedido.Content_Pasos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class Registrar_Proveedor extends javax.swing.JPanel {
    
    JpanelLoader jpload = new JpanelLoader();
    
    Proveedor prov = new Proveedor();
    ProveedorDAO provDAO = new ProveedorDAO();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Registrar_Proveedor() {
        initComponents();
        ListarProveedor();
        this.txtIdProveedor.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        txtDireccionProveedor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoProveedor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtRUCProveedor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarProveedor = new javax.swing.JTextField();
        btnBuscarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProveedor = new javax.swing.JTable();
        btnEditarProveedor = new javax.swing.JButton();
        btnSiguienteDerecha = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 230, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("RUC:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        btnRegistrarProveedor.setBackground(new java.awt.Color(0, 134, 190));
        btnRegistrarProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedor.setText("REGISTRAR");
        btnRegistrarProveedor.setBorder(null);
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 40));

        btnEliminarProveedor.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.setBorder(null);
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 120, 40));

        btnNuevoProveedor.setBackground(new java.awt.Color(0, 134, 190));
        btnNuevoProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProveedor.setText("NUEVO");
        btnNuevoProveedor.setBorder(null);
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 120, 40));

        txtDireccionProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 230, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        txtTelefonoProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 230, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("Telefono:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        txtIdProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 30, 30));

        txtRUCProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtRUCProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 230, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("BUSCAR:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 256, -1, -1));

        txtBuscarProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 250, 427, 30));

        btnBuscarProveedor.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProveedor.setText("BUSCAR");
        btnBuscarProveedor.setBorder(null);
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 90, 30));

        tblListaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "RUC"
            }
        ));
        tblListaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaProveedor);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 887, 120));

        btnEditarProveedor.setBackground(new java.awt.Color(0, 134, 190));
        btnEditarProveedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProveedor.setText("EDITAR");
        btnEditarProveedor.setBorder(null);
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 120, 40));

        btnSiguienteDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloDerecha_1.png"))); // NOI18N
        btnSiguienteDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteDerechaMouseClicked(evt);
            }
        });
        jPanel3.add(btnSiguienteDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 70, 70));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));
    }// </editor-fold>//GEN-END:initComponents
    
    public void ListarProveedor(){
        List<Proveedor> ListaProv = provDAO.ListarProveedor();
        modelo = (DefaultTableModel) tblListaProveedor.getModel();
        Object[] ob = new Object[5];
        
        for(int i=0; i < ListaProv.size(); i++){
            ob[0] = ListaProv.get(i).getIdProveedor();
            ob[1] = ListaProv.get(i).getNombre();
            ob[2] = ListaProv.get(i).getTelefono();
            ob[3] = ListaProv.get(i).getDireccion();
            ob[4] = ListaProv.get(i).getRuc();
            modelo.addRow(ob);
        }
        tblListaProveedor.setModel(modelo);
    }
    
    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if(!"".equals(txtIdProveedor.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdProveedor.getText());
                provDAO.EliminarProveedor(id);
                LimpiarTabla();
                ListarProveedor();
            }
        } 
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        if(!"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText()) || !"".equals(txtRUCProveedor.getText())){
            prov.setNombre(txtNombreProveedor.getText());
            prov.setTelefono(txtTelefonoProveedor.getText());
            prov.setDireccion(txtDireccionProveedor.getText());
            prov.setRuc(txtRUCProveedor.getText());
            
            provDAO.RegistrarProveedor(prov);
            JOptionPane.showMessageDialog(null, "Proveedor Registrado"); 
            LimpiarTabla();
            ListarProveedor();
        }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        txtNombreProveedor.setText("");
        txtRUCProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        if("".equals(txtIdProveedor.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
            if(!"".equals(txtNombreProveedor.getText()) || !"".equals(txtRUCProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())){
                prov.setNombre(txtNombreProveedor.getText());
                prov.setRuc(txtRUCProveedor.getText());
                prov.setTelefono(txtTelefonoProveedor.getText());
                prov.setDireccion(txtDireccionProveedor.getText());
                prov.setIdProveedor(Integer.parseInt(txtIdProveedor.getText()));
                provDAO.EditarProveedor(prov);
                JOptionPane.showMessageDialog(null, "SE HA EDITADO CORRECTAMENTE EL PROVEEDOR"); 
                LimpiarTabla();
                ListarProveedor();
            }else{
                JOptionPane.showMessageDialog(null, "Los campos estan vacios");
            }
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnSiguienteDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteDerechaMouseClicked
        Registrar_OrdenDeCompra regisOrdenCompra = new Registrar_OrdenDeCompra();
        regisOrdenCompra.setSize(1140, 590);
        
        Content_Pasos.removeAll();
        Content_Pasos.add(regisOrdenCompra, BorderLayout.CENTER);
        Content_Pasos.revalidate();
        Content_Pasos.repaint();
    }//GEN-LAST:event_btnSiguienteDerechaMouseClicked

    private void tblListaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaProveedorMouseClicked
        int fila = tblListaProveedor.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(tblListaProveedor.getValueAt(fila, 0).toString());
        txtNombreProveedor.setText(tblListaProveedor.getValueAt(fila, 1).toString());
        txtTelefonoProveedor.setText(tblListaProveedor.getValueAt(fila, 2).toString());
        txtDireccionProveedor.setText(tblListaProveedor.getValueAt(fila, 3).toString());
        txtRUCProveedor.setText(tblListaProveedor.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tblListaProveedorMouseClicked

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        String nombre = txtBuscarProveedor.getText();
        
        List<Proveedor> BuscarProv = provDAO.ListarBuscarProveedor(nombre);
        modelo = (DefaultTableModel) tblListaProveedor.getModel();
        Object[] ob = new Object[5];
        
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
        
        for(int i=0; i<BuscarProv.size(); i++){
            ob[0] = BuscarProv.get(i).getIdProveedor();
            ob[1] = BuscarProv.get(i).getNombre();
            ob[2] = BuscarProv.get(i).getRuc();
            ob[3] = BuscarProv.get(i).getDireccion();
            ob[4] = BuscarProv.get(i).getTelefono();
            modelo.addRow(ob);
        }
        tblListaProveedor.setModel(modelo);
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    public void LimpiarTabla(){
        //Limpiar una tabla -- IMPORTANTE APRENDER!!
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JLabel btnSiguienteDerecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaProveedor;
    private javax.swing.JTextField txtBuscarProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRUCProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
