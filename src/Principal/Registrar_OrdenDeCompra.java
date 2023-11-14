
package Principal;

import Modelo.OrdenCompra;
import Modelo.OrdenCompraDAO;
import Modelo.OrdenXProducto;
import static Principal.TresPasos_RegistrarPedido.Content_Pasos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class Registrar_OrdenDeCompra extends javax.swing.JPanel {
    
    OrdenCompra oc = new OrdenCompra();
    OrdenCompraDAO ocDAO = new OrdenCompraDAO();
    
    OrdenXProducto oxp = new OrdenXProducto();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Registrar_OrdenDeCompra() {
        initComponents();
        ListarOrdenCompra();
        ocDAO.cargarMetodoPago(cbMetodoPago);
        this.txtIdMetodoPago.setVisible(false);
        this.txtIdEmpleadoOrdenC.setVisible(false);
        this.txtIdProductoOrdenC.setVisible(false);
        this.txtPrecioProductoOrdenC.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtIdOrdenCompra = new javax.swing.JTextField();
        cbMetodoPago = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCantidadOrdenC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombreEmpleadoOrdenC = new javax.swing.JTextField();
        txtIdEmpleadoOrdenC = new javax.swing.JTextField();
        txtIdProductoOrdenC = new javax.swing.JTextField();
        btnBuscarProductoOrdenC = new javax.swing.JButton();
        btnBuscarEmpleadoOrdenC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaOrdenCompra = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        txtNombreProductoOrdenC = new javax.swing.JTextField();
        btnRegistrarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoOrdenC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIdMetodoPago = new javax.swing.JTextField();
        btnEditarProveedor1 = new javax.swing.JButton();
        txtPrecioProductoOrdenC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCodigoOrdenCompra = new javax.swing.JTextField();
        btnSiguienteIzquierda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("N° Orden ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        txtIdOrdenCompra.setEditable(false);
        txtIdOrdenCompra.setBackground(new java.awt.Color(204, 204, 204));
        add(txtIdOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 40, 30));

        cbMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMetodoPagoActionPerformed(evt);
            }
        });
        add(cbMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 120, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("Metodo de Pago:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setText("Cantidad:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        txtCantidadOrdenC.setBackground(new java.awt.Color(204, 204, 204));
        add(txtCantidadOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setText("Empleado:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, -1));

        txtNombreEmpleadoOrdenC.setBackground(new java.awt.Color(204, 204, 204));
        add(txtNombreEmpleadoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 210, 30));

        txtIdEmpleadoOrdenC.setBackground(new java.awt.Color(204, 204, 204));
        txtIdEmpleadoOrdenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEmpleadoOrdenCActionPerformed(evt);
            }
        });
        add(txtIdEmpleadoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 20, 30));

        txtIdProductoOrdenC.setBackground(new java.awt.Color(204, 204, 204));
        add(txtIdProductoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 20, 30));

        btnBuscarProductoOrdenC.setText("jButton1");
        btnBuscarProductoOrdenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoOrdenCActionPerformed(evt);
            }
        });
        add(btnBuscarProductoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 40, 30));

        btnBuscarEmpleadoOrdenC.setText("jButton1");
        btnBuscarEmpleadoOrdenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoOrdenCActionPerformed(evt);
            }
        });
        add(btnBuscarEmpleadoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 40, 30));

        tblListaOrdenCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "METODO PAGO", "EMPLEADO"
            }
        ));
        tblListaOrdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaOrdenCompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaOrdenCompra);
        if (tblListaOrdenCompra.getColumnModel().getColumnCount() > 0) {
            tblListaOrdenCompra.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 770, 130));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel15.setText("Producto:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        txtNombreProductoOrdenC.setBackground(new java.awt.Color(204, 204, 204));
        add(txtNombreProductoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 210, 30));

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
        add(btnRegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 120, 40));

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
        add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 120, 40));

        btnNuevoOrdenC.setBackground(new java.awt.Color(0, 134, 190));
        btnNuevoOrdenC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoOrdenC.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoOrdenC.setText("NUEVO");
        btnNuevoOrdenC.setBorder(null);
        add(btnNuevoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 120, 40));

        jLabel1.setText("+ Agregar Empleado");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        txtIdMetodoPago.setEditable(false);
        add(txtIdMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 20, 30));

        btnEditarProveedor1.setBackground(new java.awt.Color(0, 134, 190));
        btnEditarProveedor1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditarProveedor1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProveedor1.setText("EDITAR");
        btnEditarProveedor1.setBorder(null);
        add(btnEditarProveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 120, 40));

        txtPrecioProductoOrdenC.setEditable(false);
        add(txtPrecioProductoOrdenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 10, 30));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("Codigo:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        txtCodigoOrdenCompra.setBackground(new java.awt.Color(204, 204, 204));
        add(txtCodigoOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 210, 30));

        btnSiguienteIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloIzquierda.png"))); // NOI18N
        btnSiguienteIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteIzquierdaMouseClicked(evt);
            }
        });
        add(btnSiguienteIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloDerecha_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 70, 70));

        jLabel2.setText("+ Agregar Producto");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
   public void ListarOrdenCompra(){
        List<OrdenCompra> ListaOC = ocDAO.ListarOrdenCompra();
        modelo = (DefaultTableModel) tblListaOrdenCompra.getModel();
        Object[] ob = new Object[4];
        
        for(int i=0; i < ListaOC.size(); i++){
            ob[0] = ListaOC.get(i).getIdOrdenCompra();
            ob[1] = ListaOC.get(i).getCodigo();
            ob[2] = ListaOC.get(i).getDescripcionMetodo();
            ob[3] = ListaOC.get(i).getNombreEmpleado();
            modelo.addRow(ob);
        }
        tblListaOrdenCompra.setModel(modelo);
    }
    
    private void btnBuscarProductoOrdenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoOrdenCActionPerformed
        VistaProducto vistaProd = new VistaProducto();
        vistaProd.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoOrdenCActionPerformed

    private void cbMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMetodoPagoActionPerformed
        ocDAO.cargarIdMetodoPago(cbMetodoPago, txtIdMetodoPago);
    }//GEN-LAST:event_cbMetodoPagoActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        RegistrarOrdenCompra();
        RegistrarOrdenXProducto();
        JOptionPane.showMessageDialog(null, "SE HA REGISTRADO CORRECTAMENTE UNA ORDEN DE COMPRA");
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnBuscarEmpleadoOrdenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoOrdenCActionPerformed
        VistaEmpleado vistaEmp = new VistaEmpleado();
        vistaEmp.setVisible(true);
    }//GEN-LAST:event_btnBuscarEmpleadoOrdenCActionPerformed

    private void btnSiguienteIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteIzquierdaMouseClicked
        Registrar_Proveedor regisProv = new Registrar_Proveedor();
        regisProv.setSize(1140, 590);
        
        Content_Pasos.removeAll();
        Content_Pasos.add(regisProv, BorderLayout.CENTER);
        Content_Pasos.revalidate();
        Content_Pasos.repaint();
    }//GEN-LAST:event_btnSiguienteIzquierdaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Registrar_GuiaRemision regisGuia = new Registrar_GuiaRemision();
        regisGuia.setSize(1140, 590);
        
        Content_Pasos.removeAll();
        Content_Pasos.add(regisGuia, BorderLayout.CENTER);
        Content_Pasos.revalidate();
        Content_Pasos.repaint();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tblListaOrdenCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaOrdenCompraMouseClicked
        int fila = tblListaOrdenCompra.rowAtPoint(evt.getPoint());
        txtIdOrdenCompra.setText(tblListaOrdenCompra.getValueAt(fila, 0).toString());
        txtCodigoOrdenCompra.setText(tblListaOrdenCompra.getValueAt(fila, 1).toString());
        cbMetodoPago.setSelectedItem(tblListaOrdenCompra.getValueAt(fila, 2).toString());
        txtNombreEmpleadoOrdenC.setText(tblListaOrdenCompra.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tblListaOrdenCompraMouseClicked

    private void txtIdEmpleadoOrdenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEmpleadoOrdenCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEmpleadoOrdenCActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Registrar_Empleado regisEmp = new Registrar_Empleado();
        regisEmp.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Registrar_Producto regisProd = new Registrar_Producto();
        regisProd.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void RegistrarOrdenCompra(){
        String codigo = txtCodigoOrdenCompra.getText();
        int idMetodoPago = Integer.parseInt(txtIdMetodoPago.getText());
        int idEmpleado = Integer.parseInt(txtIdEmpleadoOrdenC.getText());
        oc.setCodigo(codigo);
        oc.setIdMetodoPago(idMetodoPago);
        oc.setIdEmpleado(idEmpleado);
        ocDAO.RegistrarOrdenCompra(oc);
    }
    
    private void RegistrarOrdenXProducto(){
        float precio = Float.parseFloat(txtPrecioProductoOrdenC.getText());
        int cantidad = Integer.parseInt(txtCantidadOrdenC.getText());
        int idProducto = Integer.parseInt(txtIdProductoOrdenC.getText());
        oxp.setPrecio(precio);
        oxp.setCantidad(cantidad);
        oxp.setIdOrdenC(ocDAO.IdOrdenCompra());
        oxp.setIdProducto(idProducto);
        ocDAO.RegistrarOrdenXProducto(oxp);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleadoOrdenC;
    private javax.swing.JButton btnBuscarProductoOrdenC;
    private javax.swing.JButton btnEditarProveedor1;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnNuevoOrdenC;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JLabel btnSiguienteIzquierda;
    private javax.swing.JComboBox<String> cbMetodoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaOrdenCompra;
    private javax.swing.JTextField txtCantidadOrdenC;
    private javax.swing.JTextField txtCodigoOrdenCompra;
    public static javax.swing.JTextField txtIdEmpleadoOrdenC;
    private javax.swing.JTextField txtIdMetodoPago;
    private javax.swing.JTextField txtIdOrdenCompra;
    public static javax.swing.JTextField txtIdProductoOrdenC;
    public static javax.swing.JTextField txtNombreEmpleadoOrdenC;
    public static javax.swing.JTextField txtNombreProductoOrdenC;
    public static javax.swing.JTextField txtPrecioProductoOrdenC;
    // End of variables declaration//GEN-END:variables
}
