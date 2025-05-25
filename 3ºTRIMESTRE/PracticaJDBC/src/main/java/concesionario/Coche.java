package concesionario;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Coche implements Serializable {
    private int id;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private List<Pasajero> pasajeros;

    public Coche(int id, String matricula, String marca, String modelo, String color) {
        this.id = id;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pasajeros = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public List<Pasajero> getPasajeros() { return pasajeros; }

    public void añadirPasajero(Pasajero p) { pasajeros.add(p); }
    public void eliminarPasajeroPorId(int id) {
        pasajeros.removeIf(p -> p.getId() == id);
    }

    public Pasajero buscarPasajero(int id) {
        return pasajeros.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Matricula: " + matricula + ", Marca: " + marca +
                ", Modelo: " + modelo + ", Color: " + color;
    }
}