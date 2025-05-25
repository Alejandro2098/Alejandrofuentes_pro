package Model;

public class Digestivo extends Doctor {
    private int añosExperiencia;

    public Digestivo(String nombre, String apellido, String numeroColegiado, int añosExperiencia) {
        super(nombre, apellido, numeroColegiado);
        this.añosExperiencia = añosExperiencia;
    }

    public void realizarIntervencion() {
        System.out.println("El doctor " + getNombre() + " " + getApellido() + " está realizando una intervención digestiva.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Especialidad: Digestivo - Años de experiencia: " + añosExperiencia;
    }
}