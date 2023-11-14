
package Principal;
import java.awt.BorderLayout;

public class TresPasos_RegistrarPedido extends javax.swing.JPanel {
    
    JpanelLoader jpload = new JpanelLoader();
    
    public TresPasos_RegistrarPedido() {
        initComponents();
        InitComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Header_Pasos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Content_Pasos = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header_Pasos.setBackground(new java.awt.Color(25, 118, 210));
        Header_Pasos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/2.png"))); // NOI18N
        Header_Pasos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/3.png"))); // NOI18N
        Header_Pasos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/1.png"))); // NOI18N
        Header_Pasos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 80, 70));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registrar");
        Header_Pasos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, 20));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Proveedor");
        Header_Pasos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 120, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar");
        Header_Pasos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 100, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Orden de Compra");
        Header_Pasos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar");
        Header_Pasos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 100, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Guia de Remision");
        Header_Pasos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));
        Header_Pasos.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 80, 10));
        Header_Pasos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 110, 10));

        add(Header_Pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 150));

        Content_Pasos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Content_PasosLayout = new javax.swing.GroupLayout(Content_Pasos);
        Content_Pasos.setLayout(Content_PasosLayout);
        Content_PasosLayout.setHorizontalGroup(
            Content_PasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Content_PasosLayout.setVerticalGroup(
            Content_PasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        add(Content_Pasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void InitComponent(){
        Registrar_Proveedor regisProv = new Registrar_Proveedor();
        regisProv.setSize(1140, 590);
        
        Content_Pasos.removeAll();
        Content_Pasos.add(regisProv, BorderLayout.CENTER);
        Content_Pasos.revalidate();
        Content_Pasos.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Content_Pasos;
    public javax.swing.JPanel Header_Pasos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
