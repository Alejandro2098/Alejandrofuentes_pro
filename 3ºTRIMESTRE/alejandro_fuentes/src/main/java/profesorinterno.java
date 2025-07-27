package model;

public class ProfesorInterno extends Profesor {
    private double complementoMensual;

    public ProfesorInterno(String nombre, String dni, double salarioBase, double complementoMensual) {
        super(nombre, dni, salarioBase);
        this.complementoMensual = complementoMensual;
    }

    @Override
    public double calcularSalarioTotal() {
        return salarioBase + (complementoMensual * 12);
    }

    @Override
    public String getTipo() {
        return "Interno";
    }

    public double getComplementoMensual() {
        return complementoMensual;
    }
}
