
package Principal;
import static Principal.TresPasos_RegistrarPedido.Content_Pasos;
import java.awt.BorderLayout;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
        jLabel16 = new javax.swing.JLabel();
        txtNumeroDocumentoGuiaR = new javax.swing.JTextField();
        btnFinalizarGuiaR = new javax.swing.JButton();
        txtNombreOrdenCompraGuiaR = new javax.swing.JTextField();
        btnGenerarGuiaR = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFechaEmosionGuiaR = new com.toedter.calendar.JDateChooser();
        txtFechaTransporteGuiaR = new com.toedter.calendar.JDateChooser();

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
        add(btnFinalizarGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 120, 40));

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
        add(txtFechaEmosionGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 220, 30));
        add(txtFechaTransporteGuiaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarGuiaRActionPerformed
        JOptionPane.showMessageDialog(null, "SE HA REGISTRADO UN PEDIDO");
    }//GEN-LAST:event_btnFinalizarGuiaRActionPerformed

    private void txtIdOrdenCompraGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOrdenCompraGuiaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOrdenCompraGuiaRActionPerformed

    private void txtNombreOrdenCompraGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOrdenCompraGuiaRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreOrdenCompraGuiaRActionPerformed

    private void btnGenerarGuiaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarGuiaRActionPerformed
        pdf();
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
    
    private void pdf(){
        try{
            FileOutputStream archivo;
            //Esta clase se utiliza para escribir bytes en un archivo. Estás configurando el archivo donde se guardará el PDF.
            File file = new File("src/PDF/GuiaRemision.pdf");
            // Aquí se crea un objeto File que representa el archivo de destino del PDF. En este caso, se creará un archivo llamado "venta2.pdf" en el directorio "src/pdf" de tu proyecto.
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            //Se crea un objeto Document. El Document es el contenedor principal donde se agregará todo el contenido del PDF.
            PdfWriter.getInstance(doc, archivo);
            //Esto configura el escritor del PDF. Le dice a iText que debe escribir en el documento doc y guardar el resultado en el archivo archivo.
            doc.open();
            //Abre el documento para que puedas comenzar a agregar contenido.
            
            Paragraph fecha = new Paragraph();
            //Se crea un párrafo llamado "fecha" que contendrá el texto del encabezado.
            Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12,Font.BOLD, BaseColor.BLUE);
            //Se define una fuente para el texto. En este caso, es Times Roman, tamaño 12, en negrita y color azul.
            fecha.add(Chunk.NEWLINE);
            // Agrega un espacio en blanco en el párrafo para separar el contenido.
            Date date = new Date();
            //Se crea una instancia de Date para obtener la fecha actual.
            fecha.add("Factura 1\n" + "Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date)+"\n\n");
            //Aquí se agrega el contenido real al párrafo "fecha". Este contenido incluye "Factura 1" y la fecha actual formateada como "dd-MM-yyyy".
            PdfPTable Encabezado = new PdfPTable(3);
            //Aquí se crea una tabla con 3 columnas para el encabezado.
            Encabezado.setWidthPercentage(100);
            //Establece que la tabla debe ocupar el 100% del ancho disponible en el documento.
            Encabezado.getDefaultCell().setBorder(0);
            //Configura las celdas de la tabla para que no tengan bordes.
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f};
            //Define el ancho relativo de las tres columnas de la tabla.
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            //Alinea la tabla a la izquierda en el documento.
            String ruc = "2122132323232";
            String nom = "DISEÑO DE SOFTWARE";
            String tel = "947423534";
            String dir = "HUANCAYO";
            String ra = "Jhonn Arturo";
                    
            Encabezado.addCell("");
            Encabezado.addCell("Ruc: "+ruc+"\nNombre: "+nom+"\nTelefono: "+tel+"\nDireccion: "+dir+"\nRazon"+ra);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos de los clientes"+"\n\n");
            doc.add(cli);
            
            PdfPTable tablacli = new PdfPTable(4);
            tablacli.setWidthPercentage(100);
            tablacli.getDefaultCell().setBorder(0);
            float[] Columnacli = new float[]{20f, 50f, 30f, 40f};
            tablacli.setWidths(Columnacli);
            tablacli.setHorizontalAlignment(Element.ALIGN_LEFT);
            /*En esta sección, se crea una tabla llamada "tablacli" con 4 columnas para mostrar información del cliente. 
              La tabla se configura de manera similar a la tabla del encabezado, con ancho completo, celdas sin bordes, 
              anchos relativos de columna y alineación a la izquierda. */
            PdfPCell c1 = new PdfPCell(new Phrase("N° ORDEN DE COMPRA"));       
            PdfPCell c2 = new PdfPCell(new Phrase("FECHA EMISION")); 
            PdfPCell c3 = new PdfPCell(new Phrase("FECHA TRANSPORTE")); 
            PdfPCell c4 = new PdfPCell(new Phrase("NUMERO DOCUMENTO")); 
            c1.setBorder(0);
            c2.setBorder(0);
            c3.setBorder(0);
            c4.setBorder(0);
            tablacli.addCell(c1);
            tablacli.addCell(c2);
            tablacli.addCell(c3);
            tablacli.addCell(c4);
            /*En esta parte, se crean celdas para las cabeceras de las columnas de la tabla "tablacli", 
              que son "Dni/Ruc", "Nombre", "Telefono" y "Direccion". Se configuran estas celdas para que no tengan bordes. 
              Luego, las celdas se agregan a la tabla. */
            String fechaTransporte =  ((JTextField)txtFechaTransporteGuiaR.getDateEditor().getUiComponent()).getText();
            String fechaEmision = ((JTextField)txtFechaEmosionGuiaR.getDateEditor().getUiComponent()).getText();
                    
            tablacli.addCell(txtNombreOrdenCompraGuiaR.getText());
            tablacli.addCell(fechaTransporte);
            tablacli.addCell(fechaEmision);
            tablacli.addCell(txtNumeroDocumentoGuiaR.getText());
            
            doc.add(tablacli);
            //Finalmente, los datos reales del cliente (obtenidos de campos de texto) se agregan a la tabla.
            
            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por su compra");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);
            
            doc.close();
            archivo.close();
            Desktop.getDesktop().open(file);
        }catch(DocumentException | IOException e){
            System.out.println(e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarGuiaR;
    private javax.swing.JButton btnGenerarGuiaR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser txtFechaEmosionGuiaR;
    private com.toedter.calendar.JDateChooser txtFechaTransporteGuiaR;
    public static javax.swing.JTextField txtIdOrdenCompraGuiaR;
    public static javax.swing.JTextField txtNombreOrdenCompraGuiaR;
    private javax.swing.JTextField txtNumeroDocumentoGuiaR;
    // End of variables declaration//GEN-END:variables
}
