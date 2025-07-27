import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD();
        GestorProductos gestor = new GestorProductos(conexionBD);

        try {
            // 1. Establecer conexión
            conexionBD.abrirConexion();

            // 2. Crear tabla si no existe
            gestor.crearTablaSiNoExiste();

            // 3. Importar productos desde archivo
            gestor.importarProductosDesdeArchivo("productos.txt");

            // 4. Crear algunos productos adicionales
            gestor.crearProducto("Zapatillas", 59.99, 20);
            gestor.crearProducto("Pantalón", 29.50, 15);

            // 5. Mostrar todos los productos
            gestor.mostrarTodosProductos();

            // 6. Leer un producto específico
            System.out.println("\nLeyendo producto con ID 1:");
            gestor.leerProducto(1);

            // 7. Actualizar un producto
            System.out.println("\nActualizando producto con ID 2:");
            gestor.actualizarProducto(2, "Camiseta Premium", 15.99, 8);
            gestor.leerProducto(2);

            // 8. Eliminar un producto
            System.out.println("\nEliminando producto con ID 3:");
            gestor.eliminarProducto(3);

            // 9. Mostrar todos los productos después de los cambios
            gestor.mostrarTodosProductos();

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar conexión
            conexionBD.cerrarConexion();
        }
    }
}