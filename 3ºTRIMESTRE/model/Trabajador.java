import java.util.*;

// Clase base Trabajador
abstract class Trabajador {
    private String nombre;
    private String apellido;
    private String dni;

    // Constructor con validaciones
    public Trabajador(String nombre, String apellido, String dni) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni vacío.");
        }
        if (apellido == null || apellido.isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede ser nulo ni vacío.");
        }
        if (dni == null || dni.isEmpty()) {
            throw new IllegalArgumentException("El DNI no puede ser nulo ni vacío.");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    // Método abstracto
    public abstract void mostrarInformacion();

    // Método opcional para mostrar información básica (puede ser sobreescrito)
    public void mostrarDatosBasicos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
    }
}