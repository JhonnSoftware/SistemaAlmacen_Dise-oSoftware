
package Modelo;
import java.util.List;
import Principal.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmpleadoDAO {
     public void RegistrarEmpleado(Empleado emp){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("INSERT INTO ARV_Empleado (ARV_Nombre, ARV_ApellidoPaterno, ARV_ApellidoMaterno, ARV_DNI, ARV_Rol, "
                    + "ARV_USUARIO_C, ARV_FECHA_C, ARV_HORA_C, ARV_LUGAR_C, ARV_USUARIO_D, ARV_FECHA_D, ARV_HORA_D, ARV_LUGAR_D) ");
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellidoPaterno());
            ps.setString(3, emp.getApellidoMaterno());
            ps.setString(4, emp.getDNI());
            ps.setString(5, emp.getRol());
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.setString(13, null);
            ps.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
     
    public boolean EliminarEmpleado(int id){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("DELETE FROM ARV_Empleado WHERE ARV_IDEmpleado = (?)");
            ps.setInt(1, id);
            ps.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public boolean EditarProveedor(Empleado emp){
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("UPDATE ARV_Empleado SET ARV_Nombre=?, ARV_ApellidoPaterno=?, ARV_ApellidoMaterno=?, ARV_DNI=?, "
                    + "ARV_Rol=?, ARV_USUARIO_C=?, ARV_FECHA_C=?, ARV_HORA_C=?, ARV_LUGAR_C=?, ARV_USUARIO_D=?, ARV_FECHA_D=?, ARV_HORA_D=?, ARV_LUGAR_D=? WHERE ARV_IDEmpleado=?");
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getApellidoPaterno());
            ps.setString(3, emp.getApellidoMaterno());
            ps.setString(4, emp.getDNI());
            ps.setString(5, emp.getRol());
            ps.setString(6, null);
            ps.setString(7, null);
            ps.setString(8, null);
            ps.setString(9, null);
            ps.setString(10, null);
            ps.setString(11, null);
            ps.setString(12, null);
            ps.setString(13, null);
            ps.setInt(14, emp.getIdEmpleado());
            
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListarEmpleado(){
        
        List<Empleado> ListaEmp = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Empleado");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setIdEmpleado(rs.getInt("ARV_IDEmpleado"));
                emp.setNombre(rs.getString("ARV_Nombre"));
                emp.setApellidoPaterno(rs.getString("ARV_ApellidoPaterno"));
                emp.setApellidoMaterno(rs.getString("ARV_ApellidoMaterno"));
                emp.setDNI(rs.getString("ARV_DNI"));
                emp.setRol(rs.getString("ARV_Rol"));
                ListaEmp.add(emp);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return ListaEmp;
    }
    
    public List ListarBuscarEmpleado(int dni){
        
        List<Empleado> BuscarEmp = new ArrayList();
        
        try{
            Connection con = Conexion.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM ARV_Empleado WHERE ARV_IDEmpleado = ?");
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setIdEmpleado(rs.getInt("ARV_IDEmpleado"));
                emp.setNombre(rs.getString("ARV_Nombre"));
                emp.setApellidoPaterno(rs.getString("ARV_ApellidoPaterno"));
                emp.setApellidoMaterno(rs.getString("ARV_ApellidoMaterno"));
                emp.setDNI(rs.getString("ARV_DNI"));
                emp.setRol(rs.getString("ARV_Rol"));
                BuscarEmp.add(emp);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return BuscarEmp;
    }
}
