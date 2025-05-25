// Archivo: Circuito.java
public class Circuito {
    private String nombre;
    private int numeroVueltas;

    public Circuito(String nombre, int numeroVueltas) {
        this.nombre = nombre;
        this.numeroVueltas = numeroVueltas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }
}
