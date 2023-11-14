
package Principal;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registrar_Producto extends javax.swing.JFrame {
    
    Producto prod = new Producto();
    ProductoDAO prodDAO = new ProductoDAO();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Registrar_Producto() {
        initComponents();
        this.setLocationRelativeTo(null);
        prodDAO.cargarCategoria(cbCategoriaProducto);
        prodDAO.cargarAlmacen(cbAlmacenProducto);
        ListarProducto();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdAlmacen = new javax.swing.JTextField();
        txtFechaVProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaProducto = new javax.swing.JTable();
        btnEditarProducto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtStockProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbAlmacenProducto = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbCategoriaProducto = new javax.swing.JComboBox<>();
        txtIdProducto = new javax.swing.JTextField();
        txtIdCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescripcionProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setText("Descripcion:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("FechaVencimiento:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        btnRegistrarProducto.setBackground(new java.awt.Color(0, 134, 190));
        btnRegistrarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProducto.setText("REGISTRAR");
        btnRegistrarProducto.setBorder(null);
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 120, 40));

        btnEliminarProducto.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.setBorder(null);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 40));

        btnNuevoProducto.setBackground(new java.awt.Color(0, 134, 190));
        btnNuevoProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setText("NUEVO");
        btnNuevoProducto.setBorder(null);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 120, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("Almacen:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        txtPrecioProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 180, 30));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel11.setText("Precio:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        txtIdAlmacen.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtIdAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 30, 30));

        txtFechaVProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtFechaVProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel12.setText("BUSCAR:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        txtBuscarProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 427, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setText("BUSCAR");
        btnBuscarProducto.setBorder(null);
        jPanel3.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 90, 30));

        tblListaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Stock", "Precio", "FechaVenci", "Categoria", "Almacen"
            }
        ));
        jScrollPane1.setViewportView(tblListaProducto);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 700, 151));

        btnEditarProducto.setBackground(new java.awt.Color(0, 134, 190));
        btnEditarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProducto.setText("EDITAR");
        btnEditarProducto.setBorder(null);
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 120, 40));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setText("Stock:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        txtStockProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtStockProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 180, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCTO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        cbAlmacenProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlmacenProductoActionPerformed(evt);
            }
        });
        jPanel3.add(cbAlmacenProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 160, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel14.setText("Categoria:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        cbCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaProductoActionPerformed(evt);
            }
        });
        jPanel3.add(cbCategoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 170, 30));

        txtIdProducto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, 30));

        txtIdCategoria.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 30, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void ListarProducto(){
        List<Producto> ListaPro = prodDAO.ListarProducto();
        modelo = (DefaultTableModel) tblListaProducto.getModel();
        Object[] ob = new Object[7];
        
        for(int i=0; i < ListaPro.size(); i++){
            ob[0] = ListaPro.get(i).getIdProducto();
            ob[1] = ListaPro.get(i).getDescripcion();
            ob[2] = ListaPro.get(i).getStock();
            ob[3] = ListaPro.get(i).getPrecio();
            ob[4] = ListaPro.get(i).getFechaVencimiento();
            ob[5] = ListaPro.get(i).getNombreCategoria();
            ob[6] = ListaPro.get(i).getNombreAlmacen();
            modelo.addRow(ob);
        }
        tblListaProducto.setModel(modelo);
    }
    
    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        if(!"".equals(txtDescripcionProducto.getText()) || !"".equals(txtStockProducto.getText()) || !"".equals(txtPrecioProducto.getText()) || !"".equals(txtFechaVProducto.getText()) || !"".equals(cbCategoriaProducto.getSelectedIndex()) || !"".equals(cbAlmacenProducto.getSelectedIndex())){
            prod.setDescripcion(txtDescripcionProducto.getText());
            prod.setStock(Integer.parseInt(txtStockProducto.getText()));
            prod.setPrecio(Float.parseFloat(txtPrecioProducto.getText()));
            prod.setFechaVencimiento(txtFechaVProducto.getText());
            prod.setIdCategoria(Integer.parseInt(txtIdCategoria.getText()));
            prod.setIdAlmacen(Integer.parseInt(txtIdAlmacen.getText()));
            prodDAO.RegistrarProducto(prod);
            JOptionPane.showMessageDialog(null, "Producto Registrado");
            ListarProducto();
        }else{
            JOptionPane.showMessageDialog(null, "Los campos estan vacios");
        }
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if(!"".equals(txtIdProducto.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que quiere eliminar?");
            if(pregunta == 0){
                int id = Integer.parseInt(txtIdProducto.getText());
                prodDAO.EliminarProducto(id);
            }
        }
        ListarProducto();
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        txtDescripcionProducto.setText("");
        txtStockProducto.setText("");
        txtFechaVProducto.setText("");
        txtPrecioProducto.setText("");
        cbAlmacenProducto.setSelectedIndex(0);
        cbCategoriaProducto.setSelectedIndex(0);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed

    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void cbCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaProductoActionPerformed
        prodDAO.cargarIdCategoria(cbCategoriaProducto, txtIdCategoria);
    }//GEN-LAST:event_cbCategoriaProductoActionPerformed

    private void cbAlmacenProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlmacenProductoActionPerformed
        prodDAO.cargarIdAlmacen(cbAlmacenProducto, txtIdAlmacen);
    }//GEN-LAST:event_cbAlmacenProductoActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JComboBox<String> cbAlmacenProducto;
    private javax.swing.JComboBox<String> cbCategoriaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaProducto;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtFechaVProducto;
    private javax.swing.JTextField txtIdAlmacen;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}
