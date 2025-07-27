
package model;

public abstract class Profesor {
    protected String nombre;
    protected String dni;
    protected double salarioBase;

    public Profesor(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioTotal();

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract String getTipo();
}
