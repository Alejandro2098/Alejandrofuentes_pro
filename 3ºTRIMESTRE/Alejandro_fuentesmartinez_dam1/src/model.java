
import java.io.*;
        import java.nio.file.*;
        import java.util.*;

public class model {
    public static void main(String[] args) {
        String archivo = "ejercicio1.txt";

        try {
            // Leer el archivo
            String contenido = Files.readString(Path.of(archivo));

            // Convertir ASCII a texto
            StringBuilder texto = new StringBuilder();
            for (String codigo : contenido.split(" ")) {
                try {
                    int ascii = Integer.parseInt(codigo);
                    texto.append((char) ascii);
                } catch (NumberFormatException e) {
                    texto.append(" ");
                }
            }

            // Mostrar el texto descifrado
            System.out.println("Texto decodificado:");
            System.out.println(texto.toString());

            // Procesar instrucciones
            procesarInstrucciones(texto.toString());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void procesarInstrucciones(String texto) {
        String[] lineas = texto.split("\\n");

        for (String linea : lineas) {
            if (linea.startsWith("1.")) {
                System.out.println("[Instrucción 1]: Publicar comentario privado en la entrada de examen.");
            } else if (linea.startsWith("2.")) {
                System.out.println("[Instrucción 2]: Utilizar esa contraseña para desbloquear el .zip llamado 'ejercicio2' y continuar con el examen.");
            }
        }
    }
}
