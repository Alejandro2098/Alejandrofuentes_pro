import java.sql.*;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private Connection conexion;

    // Método para abrir la conexión
    public void abrirConexion() throws SQLException {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // Método para ejecutar consultas de actualización (INSERT, UPDATE, DELETE)
    public int ejecutarUpdate(String sql) throws SQLException {
        try (Statement stmt = conexion.createStatement()) {
            return stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error al ejecutar consulta: " + e.getMessage());
            throw e;
        }
    }

    // Método para ejecutar consultas de selección (SELECT)
    public ResultSet ejecutarQuery(String sql) throws SQLException {
        try {
            Statement stmt = conexion.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Error al ejecutar consulta: " + e.getMessage());
            throw e;
        }
    }

    public Connection getConexion() {
        return conexion;
    }
}