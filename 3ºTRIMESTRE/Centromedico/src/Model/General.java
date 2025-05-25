package Model;

public class General extends Doctor {
    private String tipo; // "familiar" o "infantil"

    public General(String nombre, String apellido, String numeroColegiado, String tipo) {
        super(nombre, apellido, numeroColegiado);
        this.tipo = tipo;
    }

    public void recetarPastillas() {
        System.out.println("El doctor " + getNombre() + " " + getApellido() + " está recetando pastillas.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Especialidad: General - Tipo: " + tipo;
    }
}