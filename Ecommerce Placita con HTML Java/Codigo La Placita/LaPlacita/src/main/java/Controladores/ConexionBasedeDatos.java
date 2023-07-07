package Controladores;
import java.sql.*;
public class ConexionBasedeDatos {
    public static ConexionBasedeDatos instance; // singleton
    public static ConexionBasedeDatos getInstance() {
        if (instance == null) {
            instance = new ConexionBasedeDatos();
        }
        return instance;
    }

    public static Connection obtenerconexion(){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String usuario = "root";
        String password = "";
        Connection connection;
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
                connection = DriverManager.getConnection(url,usuario,password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return connection;
    }
}
