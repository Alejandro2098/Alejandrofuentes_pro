package Model;

import java.time.LocalDate;

public class Cita {
    private LocalDate fecha;
    private String especialidad;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(LocalDate fecha, String especialidad, Doctor doctor, Paciente paciente) {
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita: " + fecha + " - Especialidad: " + especialidad + " - Doctor: " + doctor.getNombre() + " " + doctor.getApellido() + " - Paciente: " + paciente.getNombre() + " " + paciente.getApellido();
    }
}