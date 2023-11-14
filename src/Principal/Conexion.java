
package Principal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConnection(){
        try{
            String url = "jdbc:sqlserver://DESKTOP-S30TEDJ;databaseName=dbGRUPAL_Almacen2;integratedSecurity=true;encrypt=false";
            Connection con = DriverManager.getConnection(url);
            System.out.println("Conexion Exitosa");
            return con;
        }catch(SQLException e){
            System.out.println("Conexion Fallida");
            e.printStackTrace();
            return null;
        }
    }
}
