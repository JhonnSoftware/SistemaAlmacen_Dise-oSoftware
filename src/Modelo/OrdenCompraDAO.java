
package Modelo;

import Principal.Conexion;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class OrdenCompraDAO {
    
    int r;
    
    public List ListarOrdenCompra(){
        
        List<OrdenCompra> ListaOrdenC = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT ARV_IDOrdenCompra, ARV_Codigo, ARV_MetodoPago.ARV_IDMetodoPago, ARV_MetodoPago.ARV_Descripcion, ARV_Empleado.ARV_IDEmpleado, ARV_Empleado.ARV_Nombre FROM ARV_OrdenCompra\n" +
"INNER JOIN ARV_MetodoPago ON ARV_OrdenCompra.ARV_IDMetodoPago = ARV_MetodoPago.ARV_IDMetodoPago\n" +
"INNER JOIN ARV_Empleado ON ARV_OrdenCompra.ARV_IDEmpleado = ARV_Empleado.ARV_IDEmpleado");
            rs = ps.executeQuery();
            
            while(rs.next()){
                OrdenCompra oc = new OrdenCompra();
                oc.setIdOrdenCompra(rs.getInt("ARV_IDOrdenCompra"));
                oc.setCodigo(rs.getString("ARV_Codigo"));
                oc.setIdMetodoPago(rs.getInt("ARV_IDMetodoPago"));
                oc.setDescripcionMetodo(rs.getString("ARV_Descripcion"));
                oc.setIdEmpleado(rs.getInt("ARV_IDEmpleado"));
                oc.setNombreEmpleado(rs.getString("ARV_Nombre"));
                ListaOrdenC.add(oc);
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaOrdenC;
    }
    
    public List ListarBuscarOrdenCompra(String codigo){
        
        List<OrdenCompra> BuscarOrdenC = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT ARV_IDOrdenCompra, ARV_Codigo, ARV_MetodoPago.ARV_IDMetodoPago, ARV_MetodoPago.ARV_Descripcion, ARV_Empleado.ARV_IDEmpleado, ARV_Empleado.ARV_Nombre FROM ARV_OrdenCompra\n" +
"INNER JOIN ARV_MetodoPago ON ARV_OrdenCompra.ARV_IDMetodoPago = ARV_MetodoPago.ARV_IDMetodoPago\n" +
"INNER JOIN ARV_Empleado ON ARV_OrdenCompra.ARV_IDEmpleado = ARV_Empleado.ARV_IDEmpleado WHERE ARV_IDOrdenCompra = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                OrdenCompra oc = new OrdenCompra();
                oc.setIdOrdenCompra(rs.getInt("ARV_IDOrdenCompra"));
                oc.setCodigo(rs.getString("ARV_Codigo"));
                oc.setIdMetodoPago(rs.getInt("ARV_IDMetodoPago"));
                oc.setDescripcionMetodo(rs.getString("ARV_Descripcion"));
                oc.setIdEmpleado(rs.getInt("ARV_IDEmpleado"));
                oc.setNombreEmpleado(rs.getString("ARV_Nombre"));
                BuscarOrdenC.add(oc);
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return BuscarOrdenC;
    }
    
    public int RegistrarOrdenCompra(OrdenCompra oc){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("INSERT INTO ARV_OrdenCompra (ARV_Codigo, ARV_IDMetodoPago, ARV_IDEmpleado, ARV_USUARIO_C, ARV_FECHA_C, ARV_HORA_C, ARV_LUGAR_C, ARV_USUARIO_D, ARV_FECHA_D, ARV_HORA_D, ARV_LUGAR_D ) \n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, oc.getCodigo());
            ps.setInt(2, oc.getIdMetodoPago());
            ps.setInt(3, oc.getIdEmpleado());
            ps.setString(4, null);
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return r;
    }
    
    public int RegistrarOrdenXProducto(OrdenXProducto oxp){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("INSERT INTO ARV_OrdenXProducto (ARV_Precio, ARV_Cantidad, ARV_IDOrdenCompra, ARV_IDProducto, ARV_USUARIO_C, ARV_FECHA_C, ARV_HORA_C, ARV_LUGAR_C, ARV_USUARIO_D, ARV_FECHA_D, ARV_HORA_D, ARV_LUGAR_D)\n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setFloat(1, oxp.getPrecio());
            ps.setInt(2, oxp.getCantidad());
            ps.setInt(3, oxp.getIdOrdenC());
            ps.setInt(4, oxp.getIdProducto());
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return r;
    }
    
    public int IdOrdenCompra(){
        int id = 0;
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT MAX(ARV_IDOrdenCompra) FROM ARV_OrdenCompra");
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return id;
    }
    
    public boolean EliminarOrdenCompra(int id){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("DELETE FROM ARV_OrdenCompra WHERE ARV_IDOrdenCompra = (?)");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean ModificarCliente(OrdenCompra oc){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("UPDATE ARV_OrdenCompra SET ARV_Codigo=?, ARV_IDMetodoPago=?, ARV_IDEmpleado=?, "
                    + "ARV_USUARIO_C=?, ARV_FECHA_C=?, ARV_HORA_C=?, ARV_LUGAR_C=?, ARV_USUARIO_D=?, ARV_FECHA_D=?, ARV_HORA_D=?, ARV_LUGAR_D=? WHERE ARV_IDOrdenCompra=?");
            ps.setString(1, oc.getCodigo());
            ps.setInt(2, oc.getIdMetodoPago());
            ps.setFloat(3, oc.getIdEmpleado());
            ps.setString(4, null);
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setInt(12, oc.getIdOrdenCompra());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    
    public void cargarMetodoPago(JComboBox metodop){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_MetodoPago");
            rs = ps.executeQuery();
            
            while(rs.next()){
                metodop.addItem(rs.getString("ARV_Descripcion"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cargarIdMetodoPago(JComboBox metodopagoId, JTextField idOrdenC){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_MetodoPago WHERE ARV_Descripcion ='" + metodopagoId.getSelectedItem() + "'");
            rs = ps.executeQuery();
            rs.next();
            
            idOrdenC.setText(String.valueOf(rs.getInt("ARV_IDMetodoPago")));  
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
