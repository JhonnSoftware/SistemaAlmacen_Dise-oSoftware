
package Principal;

import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaProducto extends javax.swing.JFrame {
    
    Producto prod = new Producto();
    ProductoDAO prodDAO = new ProductoDAO();
    
    public VistaProducto() {
        initComponents();
        MostrarDatosProducto();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarPorIdProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProductos = new javax.swing.JTable();
        btnBuscarListaProductos = new javax.swing.JButton();
        btnBuscarListaEmpleados1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LISTA PRODUCTOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("BUSCAR POR ID: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtBuscarPorIdProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtBuscarPorIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 380, 30));

        tblListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Stock", "Precio", "Fecha.V", "Categoria", "Almacen"
            }
        ));
        tblListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListaProductosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 740, 230));

        btnBuscarListaProductos.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarListaProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarListaProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarListaProductos.setText("BUSCAR");
        btnBuscarListaProductos.setBorder(null);
        btnBuscarListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarListaProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 100, 30));

        btnBuscarListaEmpleados1.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarListaEmpleados1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarListaEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarListaEmpleados1.setText("SALIR");
        btnBuscarListaEmpleados1.setBorder(null);
        btnBuscarListaEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarListaEmpleados1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarListaEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaProductosActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        int idProducto = Integer.parseInt(txtBuscarPorIdProducto.getText());
        
        List<Producto> BuscarProd = prodDAO.ListarBuscarProducto(idProducto);
        modelo = (DefaultTableModel) tblListaProductos.getModel();
        Object[] ob = new Object[6];
        
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
        
        for(int i=0; i<BuscarProd.size(); i++){
            ob[0] = BuscarProd.get(i).getIdProducto();
            ob[1] = BuscarProd.get(i).getDescripcion();
            ob[2] = BuscarProd.get(i).getStock();
            ob[3] = BuscarProd.get(i).getPrecio();
            ob[4] = BuscarProd.get(i).getFechaVencimiento();
            ob[5] = BuscarProd.get(i).getNombreCategoria();
            ob[6] = BuscarProd.get(i).getNombreAlmacen();
            modelo.addRow(ob);
        }
        tblListaProductos.setModel(modelo);
    }//GEN-LAST:event_btnBuscarListaProductosActionPerformed

    private void tblListaProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaProductosMousePressed
        if(evt.getClickCount() == 1){
            int fila = tblListaProductos.getSelectedRow();
            String id, descripcion, stock, precio, fechav, idCategoria, idAlmacen;
            
            id = tblListaProductos.getValueAt(fila, 0).toString();
            descripcion = tblListaProductos.getValueAt(fila, 1).toString();
            stock = tblListaProductos.getValueAt(fila, 2).toString();
            precio = tblListaProductos.getValueAt(fila, 3).toString();
            fechav = tblListaProductos.getValueAt(fila, 4).toString();
            idCategoria = tblListaProductos.getValueAt(fila, 5).toString();
            idAlmacen = tblListaProductos.getValueAt(fila, 6).toString();
            
            Registrar_OrdenDeCompra.txtNombreProductoOrdenC.setText(descripcion);
            Registrar_OrdenDeCompra.txtIdProductoOrdenC.setText(id);
            Registrar_OrdenDeCompra.txtPrecioProductoOrdenC.setText(precio);
            dispose();
        }
    }//GEN-LAST:event_tblListaProductosMousePressed

    private void btnBuscarListaEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaEmpleados1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnBuscarListaEmpleados1ActionPerformed
    
    private void MostrarDatosProducto(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        List<Producto> ListaProd = prodDAO.ListarProducto();
        modelo = (DefaultTableModel) tblListaProductos.getModel();
        Object[] ob = new Object[7];
        
        for(int i=0; i < ListaProd.size(); i++){
            ob[0] = ListaProd.get(i).getIdProducto();
            ob[1] = ListaProd.get(i).getDescripcion();
            ob[2] = ListaProd.get(i).getStock();
            ob[3] = ListaProd.get(i).getPrecio();
            ob[4] = ListaProd.get(i).getFechaVencimiento();
            ob[5] = ListaProd.get(i).getNombreCategoria();
            ob[6] = ListaProd.get(i).getNombreAlmacen();
            modelo.addRow(ob);
        }
        tblListaProductos.setModel(modelo);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarListaEmpleados1;
    private javax.swing.JButton btnBuscarListaProductos;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaProductos;
    private javax.swing.JTextField txtBuscarPorIdProducto;
    // End of variables declaration//GEN-END:variables
}
