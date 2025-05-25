package Model;

public class Paciente {
    private String nombre;
    private String apellido;
    private String nss;
    private String dolencia;

    public Paciente(String nombre, String apellido, String nss, String dolencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        this.dolencia = dolencia;
    }

    public String getNss() {
        return nss;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (NSS: " + nss + ") - Dolencia: " + dolencia;
    }

    public String getNombre() {
        return null;
    }

    public String getApellido() {
        return apellido;
    }
}

