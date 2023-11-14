
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

public class ProductoDAO {
    public boolean RegistrarProducto(Producto pro){
       try{
           Connection con = Conexion.getConnection();
           PreparedStatement ps;
           ResultSet rs;
           
           ps = con.prepareStatement("INSERT INTO ARV_Productos (ARV_Descripcion, ARV_Stock, ARV_Precio, ARV_FechaVencimiento, ARV_IDCategoria, ARV_IDAlmacen, ARV_USUARIO_C, ARV_FECHA_C, ARV_HORA_C, ARV_LUGAR_C, ARV_USUARIO_D, ARV_FECHA_D, ARV_HORA_D, ARV_LUGAR_D)\n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
           ps.setString(1, pro.getDescripcion());
           ps.setInt(2, pro.getStock());
           ps.setDouble(3, pro.getPrecio());
           ps.setString(4, pro.getFechaVencimiento());
           ps.setInt(5, pro.getIdCategoria());
           ps.setInt(6, pro.getIdAlmacen());
           ps.setString(7, null);
           ps.setString(8, null);
           ps.setString(9, null);
           ps.setString(10, null);
           ps.setString(11, null);
           ps.setString(12, null);
           ps.setString(13, null);
           ps.setString(14, null);
           ps.executeUpdate();
           return true;
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.toString());
           return false;
       }
    }
    public boolean EliminarProducto(int id){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("DELETE FROM ARV_Productos WHERE ARV_IDProducto = (?)");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean ModificarCliente(Producto pro){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("UPDATE ARV_Productos SET ARV_Descripcion=?, ARV_Stock=?, ARV_Precio=?, ARV_FechaVencimiento=?, ARV_IDCategoria=?, ARV_IDAlmacen=?, ARV_USUARIO_C=?, ARV_FECHA_C=?, ARV_HORA_C=?, ARV_LUGAR_C=?,"
                    + " ARV_USUARIO_D=?, ARV_FECHA_D=?, ARV_HORA_D=?, ARV_LUGAR_D=? WHERE ARV_IDProducto = ?");
            ps.setString(1, pro.getDescripcion());
            ps.setInt(2, pro.getStock());
            ps.setFloat(3, pro.getPrecio());
            ps.setString(4, null);
            ps.setInt(5, pro.getIdCategoria());
            ps.setInt(6, pro.getIdAlmacen());
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.setString(13, null);
            ps.setString(14, null);
            ps.setInt(15, pro.getIdProducto());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    public List ListarProducto(){
        
        List<Producto> ListaProd = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT ARV_IDProducto, ARV_Descripcion, ARV_Stock, ARV_Precio, ARV_FechaVencimiento, ARV_Categoria.ARV_IDCategoria, ARV_Categoria.ARV_Nombre, ARV_Almacen.ARV_IDAlmacen, ARV_Almacen.ARV_NombreAlmacen FROM ARV_Productos\n" +
"INNER JOIN ARV_Categoria ON ARV_Productos.ARV_IDCategoria = ARV_Categoria.ARV_IDCategoria\n" +
"INNER JOIN ARV_Almacen ON ARV_Productos.ARV_IDAlmacen = ARV_Almacen.ARV_IDAlmacen");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Producto pro = new Producto();
                pro.setIdProducto(rs.getInt("ARV_IDProducto"));
                pro.setDescripcion(rs.getString("ARV_Descripcion"));
                pro.setStock(rs.getInt("ARV_Stock"));
                pro.setPrecio(rs.getFloat("ARV_Precio"));
                pro.setFechaVencimiento(rs.getString("ARV_FechaVencimiento"));
                pro.setIdCategoria(rs.getInt("ARV_IDCategoria"));
                pro.setNombreCategoria(rs.getString("ARV_Nombre"));
                pro.setIdAlmacen(rs.getInt("ARV_IDAlmacen"));
                pro.setNombreAlmacen(rs.getString("ARV_NombreAlmacen"));              
                ListaProd.add(pro); 
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaProd;
    }
    
    public List ListarBuscarProducto(int idProducto){
        List<Producto> BuscarProd = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT ARV_IDProducto, ARV_Descripcion, ARV_Stock, ARV_Precio, ARV_FechaVencimiento, ARV_Categoria.ARV_IDCategoria, ARV_Categoria.ARV_Nombre, ARV_Almacen.ARV_IDAlmacen, ARV_Almacen.ARV_NombreAlmacen FROM ARV_Productos\n" +
"INNER JOIN ARV_Categoria ON ARV_Productos.ARV_IDCategoria = ARV_Categoria.ARV_IDCategoria\n" +
"INNER JOIN ARV_Almacen ON ARV_Productos.ARV_IDAlmacen = ARV_Almacen.ARV_IDAlmacen WHERE ARV_IDProducto = ?");
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("ARV_IDProducto"));
                prod.setDescripcion(rs.getString("ARV_Descripcion"));
                prod.setStock(rs.getInt("ARV_Stock"));
                prod.setPrecio(rs.getFloat("ARV_Precio"));
                prod.setFechaVencimiento(rs.getString("ARV_FechaVencimiento"));
                prod.setIdCategoria(rs.getInt("ARV_IDCategoria"));
                prod.setIdAlmacen(rs.getInt("ARV_IDAlmacen"));
                BuscarProd.add(prod);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return BuscarProd;
    }
    
    public void cargarCategoria(JComboBox categoria){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Categoria");
            rs = ps.executeQuery();
            
            while(rs.next()){
                categoria.addItem(rs.getString("ARV_Nombre"));
                
            }
    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cargarIdCategoria(JComboBox categoriaId, JTextField idProd){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Categoria WHERE ARV_Nombre ='" + categoriaId.getSelectedItem() + "'");
            rs = ps.executeQuery();
            rs.next();
            
            idProd.setText(String.valueOf(rs.getInt("ARV_IDCategoria")));  
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cargarAlmacen(JComboBox almacen){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Almacen");
            rs = ps.executeQuery();
            
            while(rs.next()){
                almacen.addItem(rs.getString("ARV_NombreAlmacen"));
                
            }
    
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public void cargarIdAlmacen(JComboBox almacenId, JTextField idProd){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Almacen WHERE ARV_NombreAlmacen ='" + almacenId.getSelectedItem() + "'");
            rs = ps.executeQuery();
            rs.next();
            
            idProd.setText(String.valueOf(rs.getInt("ARV_IDAlmacen")));  
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
