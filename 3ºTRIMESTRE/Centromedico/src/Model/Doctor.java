package Model;


public class Doctor {
    private String nombre;
    private String apellido;
    private String numeroColegiado;

    public Doctor(String nombre, String apellido, String numeroColegiado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroColegiado = numeroColegiado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (Colegiado: " + numeroColegiado + ")";
    }
}
