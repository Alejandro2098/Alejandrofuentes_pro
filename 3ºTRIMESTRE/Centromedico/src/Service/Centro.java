package Service;

import Model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Centro {
    private List<Paciente> pacientes;
    private List<Doctor> doctores;
    private List<Cita> citas;
    private String tipoDoctores; // null para cualquier tipo, o "General", "Digestivo", "Traumatologia"

    public Centro(String tipoDoctores) {
        this.pacientes = new ArrayList<>();
        this.doctores = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.tipoDoctores = tipoDoctores;
    }

    public void admitirPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente " + paciente.getNombre() + " " + paciente.getApellido() + " admitido.");
    }

    public void contratarDoctor(Doctor doctor) {
        if (tipoDoctores == null || doctor.getClass().getSimpleName().equals(tipoDoctores)) {
            doctores.add(doctor);
            System.out.println("Doctor " + doctor.getNombre() + " " + doctor.getApellido() + " contratado.");
        } else {
            System.out.println("Error: Este centro solo admite doctores de tipo " + tipoDoctores + ".");
        }
    }

    public void verDoctores() {
        for (Doctor doctor : doctores) {
            System.out.println(doctor);
        }
    }

    public void verPacientes() {
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    public void verCitasPacientes() {
        for (Cita cita : citas) {
            System.out.println(cita);
        }
    }

    public void pedirCita(String nss, String especialidad, LocalDate fecha) {
        Paciente paciente = pacientes.stream()
                .filter(p -> p.getNss().equals(nss))
                .findFirst()
                .orElse(null);

        if (paciente == null) {
            System.out.println("Error: Paciente no encontrado.");
            return;
        }

        Doctor doctor = doctores.stream()
                .filter(d -> d.getClass().getSimpleName().equals(especialidad))
                .findFirst()
                .orElse(null);

        if (doctor == null) {
            System.out.println("Error: No hay doctores disponibles para esa especialidad.");
            return;
        }

        Cita cita = new Cita(fecha, especialidad, doctor, paciente);
        citas.add(cita);
        System.out.println("Cita asignada para " + paciente.getNombre() + " " + paciente.getApellido() + " con " + doctor.getNombre() + " " + doctor.getApellido() + " el " + fecha + ".");
    }
}