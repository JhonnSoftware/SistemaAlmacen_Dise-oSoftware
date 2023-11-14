
package Principal;
import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JTextField;

public class VistaEmpleado extends javax.swing.JFrame {
    
    Empleado emp = new Empleado();
    EmpleadoDAO empDAO = new EmpleadoDAO();
    
    public VistaEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarDatosEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBuscarPorDni = new javax.swing.JTextField();
        btnSalirListaEmpleados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEmpleados = new javax.swing.JTable();
        btnBuscarListaEmpleados1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LISTA EMPLEADOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("BUSCAR POR DNI: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtBuscarPorDni.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtBuscarPorDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 390, 30));

        btnSalirListaEmpleados.setBackground(new java.awt.Color(0, 134, 190));
        btnSalirListaEmpleados.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalirListaEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirListaEmpleados.setText("BUSCAR");
        btnSalirListaEmpleados.setBorder(null);
        btnSalirListaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirListaEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirListaEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 100, 30));

        tblListaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido.P", "Apellido.M", "DNI", "Rol"
            }
        ));
        tblListaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblListaEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 730, 250));

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
        getContentPane().add(btnBuscarListaEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirListaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirListaEmpleadosActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        
        int dni = Integer.parseInt(txtBuscarPorDni.getText());
        
        List<Empleado> BuscarEmp = empDAO.ListarBuscarEmpleado(dni);
        modelo = (DefaultTableModel) tblListaEmpleados.getModel();
        Object[] ob = new Object[6];
        
        for(int i=0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i - 1;
        }
        
        for(int i=0; i<BuscarEmp.size(); i++){
            ob[0] = BuscarEmp.get(i).getIdEmpleado();
            ob[1] = BuscarEmp.get(i).getNombre();
            ob[2] = BuscarEmp.get(i).getApellidoPaterno();
            ob[3] = BuscarEmp.get(i).getApellidoMaterno();
            ob[4] = BuscarEmp.get(i).getDNI();
            ob[5] = BuscarEmp.get(i).getRol();
            modelo.addRow(ob);
        }
        tblListaEmpleados.setModel(modelo);
    }//GEN-LAST:event_btnSalirListaEmpleadosActionPerformed

    private void tblListaEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaEmpleadosMousePressed
        if(evt.getClickCount() == 1){
            int fila = tblListaEmpleados.getSelectedRow();
            String id, nombre, apellidoP, apellidoM, dni, rol;
            
            id = tblListaEmpleados.getValueAt(fila, 0).toString();
            nombre = tblListaEmpleados.getValueAt(fila, 1).toString();
            apellidoP = tblListaEmpleados.getValueAt(fila, 2).toString();
            apellidoM = tblListaEmpleados.getValueAt(fila, 3).toString();
            dni = tblListaEmpleados.getValueAt(fila, 4).toString();
            rol = tblListaEmpleados.getValueAt(fila, 5).toString();
            
            Registrar_OrdenDeCompra.txtNombreEmpleadoOrdenC.setText(nombre);
            Registrar_OrdenDeCompra.txtIdEmpleadoOrdenC.setText(id);
            dispose();
        }
    }//GEN-LAST:event_tblListaEmpleadosMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VistaEmpleado vEmp = new VistaEmpleado();
        vEmp.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarListaEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarListaEmpleados1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnBuscarListaEmpleados1ActionPerformed
    
    private void MostrarDatosEmpleado(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        List<Empleado> ListaEmp = empDAO.ListarEmpleado();
        modelo = (DefaultTableModel) tblListaEmpleados.getModel();
        Object[] ob = new Object[6];
        
        for(int i=0; i<ListaEmp.size(); i++){
            ob[0] = ListaEmp.get(i).getIdEmpleado();
            ob[1] = ListaEmp.get(i).getNombre();
            ob[2] = ListaEmp.get(i).getApellidoPaterno();
            ob[3] = ListaEmp.get(i).getApellidoMaterno();
            ob[4] = ListaEmp.get(i).getDNI();
            ob[5] = ListaEmp.get(i).getRol();
            modelo.addRow(ob);
        }
        tblListaEmpleados.setModel(modelo);
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
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarListaEmpleados1;
    private javax.swing.JButton btnSalirListaEmpleados;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaEmpleados;
    private javax.swing.JTextField txtBuscarPorDni;
    // End of variables declaration//GEN-END:variables
}
