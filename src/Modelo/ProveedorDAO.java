
package Modelo;
import java.util.List;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProveedorDAO {
    
    public void RegistrarProveedor(Proveedor prov){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("INSERT INTO ARV_Proveedor (ARV_Nombre, ARV_Telefono, ARV_Direccion, ARV_RUC, ARV_USUARIO_C, ARV_FECHA_C, ARV_HORA_C, ARV_LUGAR_C, ARV_USUARIO_D, ARV_FECHA_D, ARV_HORA_D, ARV_LUGAR_D) \n" +
"VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, prov.getNombre());
            ps.setString(2, prov.getTelefono());
            ps.setString(3, prov.getDireccion());
            ps.setString(4, prov.getRuc());
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.executeUpdate();
            //return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            //return false;
        }
    }
    
    public boolean EliminarProveedor(int id){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("DELETE FROM ARV_Proveedor WHERE ARV_IDProveedor = (?)");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean EditarProveedor(Proveedor prov){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("UPDATE ARV_Proveedor SET ARV_Nombre=?, ARV_Telefono=?, ARV_Direccion=?, ARV_RUC=?, ARV_USUARIO_C=?, ARV_FECHA_C=?,"
                    + " ARV_HORA_C=?, ARV_LUGAR_C=?, ARV_USUARIO_D=?, ARV_FECHA_D=?, ARV_HORA_D=?, ARV_LUGAR_D=? WHERE ARV_IDProveedor=?");
            ps.setString(1, prov.getNombre());
            ps.setString(2, prov.getTelefono());
            ps.setString(3, prov.getDireccion());
            ps.setString(4, prov.getRuc());
            ps.setString(5, null);
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.setInt(13, prov.getIdProveedor());
            
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListarProveedor(){
        
        List<Proveedor> ListaProv = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Proveedor");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("ARV_IDProveedor"));
                prov.setNombre(rs.getString("ARV_Nombre"));
                prov.setTelefono(rs.getString("ARV_Telefono"));
                prov.setDireccion(rs.getString("ARV_Direccion"));
                prov.setRuc(rs.getString("ARV_RUC"));
                ListaProv.add(prov);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaProv;
    }
    
    public List ListarBuscarProveedor(String nombre){
        
        List<Proveedor> ListaBuscarProv = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Proveedor WHERE ARV_Nombre = ?");
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt("ARV_IDProveedor"));
                prov.setNombre(rs.getString("ARV_Nombre"));
                prov.setTelefono(rs.getString("ARV_Telefono"));
                prov.setDireccion(rs.getString("ARV_Direccion"));
                prov.setRuc(rs.getString("ARV_RUC"));
                ListaBuscarProv.add(prov);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaBuscarProv;
    }
    
}
