
package Principal;

import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import java.awt.BorderLayout;

public class VentanaPrincipal extends javax.swing.JFrame {

    JpanelLoader jpload = new JpanelLoader();
    
    Proveedor prov = new Proveedor();
    ProveedorDAO provDAO = new ProveedorDAO();
    
    public VentanaPrincipal() {
        initComponents();
        this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        InitContent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnEmpleado = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarPedido = new javax.swing.JButton();
        btnEmpleado1 = new javax.swing.JButton();
        ContentPrincipal = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setPreferredSize(new java.awt.Dimension(270, 640));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpleado.setBackground(new java.awt.Color(21, 101, 192));
        btnEmpleado.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado.png"))); // NOI18N
        btnEmpleado.setText("Salir");
        btnEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEmpleado.setBorderPainted(false);
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.setIconTextGap(10);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        Menu.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 270, 47));

        btnPrincipal.setBackground(new java.awt.Color(21, 101, 192));
        btnPrincipal.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuario.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.setIconTextGap(10);
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        Menu.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 47));

        btnProductos.setBackground(new java.awt.Color(21, 101, 192));
        btnProductos.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/productos.png"))); // NOI18N
        btnProductos.setText("Reportes");
        btnProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnProductos.setBorderPainted(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.setIconTextGap(10);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        Menu.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 270, 47));

        btnProveedores.setBackground(new java.awt.Color(21, 101, 192));
        btnProveedores.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/proveedor.png"))); // NOI18N
        btnProveedores.setText("Inventario");
        btnProveedores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnProveedores.setBorderPainted(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.setIconTextGap(10);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        Menu.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 47));

        btnCategoria.setBackground(new java.awt.Color(21, 101, 192));
        btnCategoria.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/categoria.png"))); // NOI18N
        btnCategoria.setText("Pagos");
        btnCategoria.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCategoria.setBorderPainted(false);
        btnCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCategoria.setIconTextGap(10);
        Menu.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 47));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 250, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogoFarmacia2.png"))); // NOI18N
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 65, -1, 75));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTIFARMA");
        Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 87, -1, -1));

        btnRegistrarPedido.setBackground(new java.awt.Color(21, 101, 192));
        btnRegistrarPedido.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnRegistrarPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/usuario.png"))); // NOI18N
        btnRegistrarPedido.setText("Registrar Pedido");
        btnRegistrarPedido.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegistrarPedido.setBorderPainted(false);
        btnRegistrarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarPedido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrarPedido.setIconTextGap(10);
        btnRegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedidoActionPerformed(evt);
            }
        });
        Menu.add(btnRegistrarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 47));

        btnEmpleado1.setBackground(new java.awt.Color(21, 101, 192));
        btnEmpleado1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEmpleado1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/empleado.png"))); // NOI18N
        btnEmpleado1.setText("Dashboard");
        btnEmpleado1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEmpleado1.setBorderPainted(false);
        btnEmpleado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado1.setIconTextGap(10);
        Menu.add(btnEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 270, 47));

        background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

        ContentPrincipal.setBackground(new java.awt.Color(204, 255, 255));
        ContentPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(25, 118, 210));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        ContentPrincipal.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        ContentPrincipal.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        getContentPane().add(ContentPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        
        
        Principal principal = new Principal();
        principal.setSize(1140, 590);
        
        Content.removeAll();
        Content.add(principal, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
        
        /*Registrar_Proveedor regProveedor = new Registrar_Proveedor();
          jpload.jPanelLoader(Content, regProveedor);
        
        TresPasos_RegistrarPedido pasos = new TresPasos_RegistrarPedido();
         jpload.jPanelLoader(Header, pasos);*/
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed

    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed

    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnRegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedidoActionPerformed
       TresPasos_RegistrarPedido pasoHeader = new TresPasos_RegistrarPedido();
        pasoHeader.Header_Pasos.setSize(1140, 150);
        
        Header.removeAll();
        Header.add(pasoHeader.Header_Pasos, BorderLayout.CENTER);
        Header.revalidate();
        Header.repaint(); 
        
        
        TresPasos_RegistrarPedido pasosContent = new TresPasos_RegistrarPedido();
        pasosContent.Content_Pasos.setSize(1140, 590);
        
        Content.removeAll();
        Content.add(pasosContent.Content_Pasos, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();   
    }//GEN-LAST:event_btnRegistrarPedidoActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEmpleadoActionPerformed
    
    private void InitContent(){
        Principal principal = new Principal();
        principal.setSize(1140, 590);
        
        Content.removeAll();
        Content.add(principal, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JPanel ContentPrincipal;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnEmpleado1;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRegistrarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
