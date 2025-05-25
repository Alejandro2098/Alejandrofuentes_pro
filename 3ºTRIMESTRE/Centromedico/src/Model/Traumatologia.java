package Model;

public class Traumatologia extends Doctor {
    public Traumatologia(String nombre, String apellido, String numeroColegiado) {
        super(nombre, apellido, numeroColegiado);
    }

    public void realizarVenda() {
        System.out.println("El doctor " + getNombre() + " " + getApellido() + " está realizando una venda.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Especialidad: Traumatología";
    }
}