package concesionario;


import java.io.Serializable;

public class Pasajero implements Serializable {
    private int id;
    private String nombre;
    private int edad;
    private double peso;

    public Pasajero(int id, String nombre, int edad, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso;
    }
}