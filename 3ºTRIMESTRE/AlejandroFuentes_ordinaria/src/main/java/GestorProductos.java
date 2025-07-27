import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class GestorProductos {
    private ConexionBD conexionBD;

    public GestorProductos(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    // Método para crear la tabla si no existe
    public void crearTablaSiNoExiste() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS productos (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "nombre VARCHAR(100) NOT NULL, " +
                "precio DECIMAL(10,2) NOT NULL, " +
                "cantidad INT NOT NULL)";
        conexionBD.ejecutarUpdate(sql);
    }

    // Crear un nuevo producto
    public void crearProducto(String nombre, double precio, int cantidad) throws SQLException {
        String sql = String.format("INSERT INTO productos (nombre, precio, cantidad) VALUES ('%s', %.2f, %d)",
                nombre, precio, cantidad);
        conexionBD.ejecutarUpdate(sql);
    }

    // Leer un producto por ID
    public void leerProducto(int id) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id = " + id;
        ResultSet rs = conexionBD.ejecutarQuery(sql);

        if (rs.next()) {
            System.out.println("\nInformación del Producto:");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Nombre: " + rs.getString("nombre"));
            System.out.println("Precio: " + rs.getDouble("precio"));
            System.out.println("Cantidad: " + rs.getInt("cantidad"));
        } else {
            System.out.println("No se encontró un producto con ID: " + id);
        }
    }

    // Actualizar un producto
    public void actualizarProducto(int id, String nombre, double precio, int cantidad) throws SQLException {
        String sql = String.format("UPDATE productos SET nombre = '%s', precio = %.2f, cantidad = %d WHERE id = %d",
                nombre, precio, cantidad, id);
        int filas = conexionBD.ejecutarUpdate(sql);

        if (filas > 0) {
            System.out.println("Producto actualizado correctamente.");
        } else {
            System.out.println("No se encontró un producto con ID: " + id);
        }
    }

    // Eliminar un producto
    public void eliminarProducto(int id) throws SQLException {
        String sql = "DELETE FROM productos WHERE id = " + id;
        int filas = conexionBD.ejecutarUpdate(sql);

        if (filas > 0) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontró un producto con ID: " + id);
        }
    }

    // Mostrar todos los productos
    public void mostrarTodosProductos() throws SQLException {
        String sql = "SELECT * FROM productos";
        ResultSet rs = conexionBD.ejecutarQuery(sql);

        System.out.println("\nLista de Productos:");
        System.out.println("ID\tNombre\t\tPrecio\tCantidad");
        System.out.println("----------------------------------");

        while (rs.next()) {
            System.out.printf("%d\t%s\t%.2f\t%d\n",
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getDouble("precio"),
                    rs.getInt("cantidad"));
        }
    }

    // Importar productos desde archivo
    public void importarProductosDesdeArchivo(String archivo) throws IOException, SQLException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    double precio = Double.parseDouble(partes[1].trim());
                    int cantidad = Integer.parseInt(partes[2].trim());
                    crearProducto(nombre, precio, cantidad);
                }
            }
            System.out.println("Productos importados desde el archivo correctamente.");
        }
    }
}