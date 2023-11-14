
package Principal;
import static Principal.TresPasos_RegistrarPedido.Content_Pasos;
import java.awt.BorderLayout;

public class Registrar_GuiaRemision extends javax.swing.JPanel {

    public Registrar_GuiaRemision() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtIdOrdenCompraGuiaR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFechaEmosionGuiaR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNumeroDocumentoGuiaR = new javax.swing.JTextField();
        btnFinalizarGuiaR = new javax.swing.JButton();
        txtNombreOrdenCompraGuiaR = new javax.swing.JTextField();
        btnGenerarGuiaR = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFechaTransporteGuiaR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel10.setText("N° Ord Compra");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        txtIdOrdenCompraGuiaR.setBackground(new java.awt.Color(204, 204, 204));
        txtIdOrdenCompraGuiaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdOrdenCompraGuiaRActionPerformed(evt);
            }
        });
        add(txtIdOrdenCompraGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 36, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel13.setText("Fecha Emision:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        txtFechaEmosionGuiaR.setBackground(new java.awt.Color(204, 204, 204));
        add(txtFechaEmosionGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 194, 30));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel16.setText("Fecha Transporte:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        txtNumeroDocumentoGuiaR.setBackground(new java.awt.Color(204, 204, 204));
        add(txtNumeroDocumentoGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 194, 30));

        btnFinalizarGuiaR.setBackground(new java.awt.Color(0, 134, 190));
        btnFinalizarGuiaR.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFinalizarGuiaR.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarGuiaR.setText("FINALIZAR");
        btnFinalizarGuiaR.setBorder(null);
        btnFinalizarGuiaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarGuiaRActionPerformed(evt);
            }
        });
        add(btnFinalizarGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 120, 40));

        txtNombreOrdenCompraGuiaR.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreOrdenCompraGuiaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreOrdenCompraGuiaRActionPerformed(evt);
            }
        });
        add(txtNombreOrdenCompraGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 148, 30));

        btnGenerarGuiaR.setBackground(new java.awt.Color(0, 134, 190));
        btnGenerarGuiaR.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGenerarGuiaR.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarGuiaR.setText("GENERAR ");
        btnGenerarGuiaR.setBorder(null);
        btnGenerarGuiaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarGuiaRActionPerformed(evt);
            }
        });
        add(btnGenerarGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 120, 40));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel17.setText("Numero Documento ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        txtFechaTransporteGuiaR.setBackground(new java.awt.Color(204, 204, 204));
        add(txtFechaTransporteGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 194, 30));

        jButton1.setText("......");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 37, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/circuloIzquierda.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarGuiaRActionPerformed
 
    }//GEN-LAST:event_btnFinalizarGuiaRActionPerformed

    private void txtIdOrdenCompraGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOrdenCompraGuiaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOrdenCompraGuiaRActionPerformed

    private void txtNombreOrdenCompraGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOrdenCompraGuiaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreOrdenCompraGuiaRActionPerformed

    private void btnGenerarGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarGuiaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarGuiaRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaOrdenCompra vistaOC = new VistaOrdenCompra();
        vistaOC.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Registrar_OrdenDeCompra regisOrdenCompra = new Registrar_OrdenDeCompra();
        regisOrdenCompra.setSize(1140, 590);
        
        Content_Pasos.removeAll();
        Content_Pasos.add(regisOrdenCompra, BorderLayout.CENTER);
        Content_Pasos.revalidate();
        Content_Pasos.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarGuiaR;
    private javax.swing.JButton btnGenerarGuiaR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFechaEmosionGuiaR;
    private javax.swing.JTextField txtFechaTransporteGuiaR;
    public static javax.swing.JTextField txtIdOrdenCompraGuiaR;
    public static javax.swing.JTextField txtNombreOrdenCompraGuiaR;
    private javax.swing.JTextField txtNumeroDocumentoGuiaR;
    // End of variables declaration//GEN-END:variables
}
