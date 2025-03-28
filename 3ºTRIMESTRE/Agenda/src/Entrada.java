import java.io.*;
import java.util.*;

public class Entrada {
    private static final String FICHERO = "agenda.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();

        System.out.println("Introduce los datos de 4 usuarios:");

        for (int i = 0; i < 4; i++) {
            System.out.println("\nUsuario " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellido: ");
            String apellido = sc.nextLine();
            System.out.print("Correo: ");
            String correo = sc.nextLine();
            System.out.print("Teléfono: ");
            String telefono = sc.nextLine();

            usuarios.add(new Usuario(nombre, apellido, correo, telefono));
        }

        // Confirmación
        System.out.println("\nDatos introducidos:");
        for (Usuario u : usuarios) {
            System.out.println(u.mostrarDatos());
        }

        System.out.print("\n¿Deseas guardar los datos? (S/N): ");
        String confirmacion = sc.nextLine();

        if (confirmacion.equalsIgnoreCase("S")) {
            guardarAgenda(usuarios);
            System.out.println("Datos guardados correctamente en " + FICHERO);
        } else {
            System.out.println("No se han guardado los datos.");
        }

        // Lectura del fichero
        System.out.println("\nLectura de la agenda:");
        lecturaAgenda();
    }

    public static void guardarAgenda(List<Usuario> usuarios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {
            for (Usuario u : usuarios) {
                bw.write(u.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar la agenda: " + e.getMessage());
        }
    }

    public static void lecturaAgenda() {
        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Usuario usuario = new Usuario(datos[0], datos[1], datos[2], datos[3]);
                System.out.println(usuario.mostrarDatos());
            }
        } catch (IOException e) {
            System.out.println("Error al leer la agenda: " + e.getMessage());
        }
    }
}
