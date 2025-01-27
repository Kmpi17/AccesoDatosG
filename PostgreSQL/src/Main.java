import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
    String url="jdbc:postgresql://localhost:5432/postgres";
    String username="postgres";
    String password="postgres";
    try(Connection con = DriverManager.getConnection(url,username,password)){
        System.out.println("Conexion correcta");
    }catch (SQLException e){
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    }
}