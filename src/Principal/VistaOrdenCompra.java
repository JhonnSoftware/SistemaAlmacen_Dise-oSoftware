
package Principal;

import Modelo.OrdenCompra;
import Modelo.OrdenCompraDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaOrdenCompra extends javax.swing.JFrame {
    
    OrdenCompra oc = new OrdenCompra();
    OrdenCompraDAO ocDAO = new OrdenCompraDAO();
    
    public VistaOrdenCompra() {
        initComponents();
        MostrarDatosOrdenCompra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarPorCodigoOC = new javax.swing.JTextField();
        btnBuscarListaOrdenCompra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaOrdenCompra = new javax.swing.JTable();
        btnSalirListaOrdenCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LISTA ORDEN DE COMPRA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("BUSCAR POR CODIGO: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtBuscarPorCodigoOC.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtBuscarPorCodigoOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 380, 30));

        btnBuscarListaOrdenCompra.setBackground(new java.awt.Color(0, 134, 190));
        btnBuscarListaOrdenCompra.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarListaOrdenCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarListaOrdenCompra.setText("BUSCAR");
        btnBuscarListaOrdenCompra.setBorder(null);
        btnBuscarListaOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarListaOrdenCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarListaOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 100, 30));

        tblListaOrdenCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo", "MetodoPago", "Empleado"
            }
        ));
        tblListaOrdenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListaOrdenCompraMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaOrdenCompra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 750, 230));

        btnSalirListaOrdenCompra.setBackground(new java.awt.Color(0, 134, 190));
        btnSalirListaOrdenCompra.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalirListaOrdenCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirListaOrdenCompra.setText("SALIR");
        btnSalirListaOrdenCompra.setBorder(null);
        btnSalirListaOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirListaOrdenCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalirListaOrdenCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarListaOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaOrdenCompraActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();

        String codigo = txtBuscarPorCodigoOC.getText();

        List<OrdenCompra> BuscarOrdenC = ocDAO.ListarBuscarOrdenCompra(codigo);
        modelo = (DefaultTableModel) tblListaOrdenCompra.getModel();
        Object[] ob = new Object[4];
        
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
        
        for(int i=0; i<BuscarOrdenC.size(); i++){
            ob[0] = BuscarOrdenC.get(i).getIdOrdenCompra();
            ob[1] = BuscarOrdenC.get(i).getCodigo();
            ob[2] = BuscarOrdenC.get(i).getDescripcionMetodo();
            ob[3] = BuscarOrdenC.get(i).getNombreEmpleado();
            modelo.addRow(ob);
        }
        tblListaOrdenCompra.setModel(modelo);
    }//GEN-LAST:event_btnBuscarListaOrdenCompraActionPerformed

    private void tblListaOrdenCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaOrdenCompraMousePressed
        if(evt.getClickCount() == 1){
            int fila = tblListaOrdenCompra.getSelectedRow();
            String id, codigo, metodoPago, empleado;

            id = tblListaOrdenCompra.getValueAt(fila, 0).toString();
            codigo = tblListaOrdenCompra.getValueAt(fila, 1).toString();
            metodoPago = tblListaOrdenCompra.getValueAt(fila, 2).toString();
            empleado = tblListaOrdenCompra.getValueAt(fila, 3).toString();
 
            Registrar_GuiaRemision.txtIdOrdenCompraGuiaR.setText(id);
            Registrar_GuiaRemision.txtNombreOrdenCompraGuiaR.setText(codigo);
            dispose();
        }
    }//GEN-LAST:event_tblListaOrdenCompraMousePressed

    private void btnSalirListaOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirListaOrdenCompraActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirListaOrdenCompraActionPerformed

    private void MostrarDatosOrdenCompra(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        List<OrdenCompra> ListaOrdenC = ocDAO.ListarOrdenCompra();
        modelo = (DefaultTableModel) tblListaOrdenCompra.getModel();
        Object[] ob = new Object[4];
        
        for(int i=0; i < ListaOrdenC.size(); i++){
            ob[0] = ListaOrdenC.get(i).getIdOrdenCompra();
            ob[1] = ListaOrdenC.get(i).getCodigo();
            ob[2] = ListaOrdenC.get(i).getDescripcionMetodo();
            ob[3] = ListaOrdenC.get(i).getNombreEmpleado();
            modelo.addRow(ob);
        }
        tblListaOrdenCompra.setModel(modelo);
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
            java.util.logging.Logger.getLogger(VistaOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOrdenCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarListaOrdenCompra;
    private javax.swing.JButton btnSalirListaOrdenCompra;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaOrdenCompra;
    private javax.swing.JTextField txtBuscarPorCodigoOC;
    // End of variables declaration//GEN-END:variables
}
