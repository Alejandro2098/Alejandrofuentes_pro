package model;

public class ProfesorExterno extends Profesor {
    private int horas;
    private double precioHora;

    public ProfesorExterno(String nombre, String dni, double salarioBase, int horas, double precioHora) {
        super(nombre, dni, salarioBase);
        this.horas = horas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + (horas * precioHora);
    }

    @Override
    public String getTipo() {
        return "Externo";
    }

    public int getHoras() {
        return horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }
}
