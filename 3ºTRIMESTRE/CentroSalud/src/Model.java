
    package centrosalud.model;

import java.util.*;

    public class CentroSalud {
        List<Paciente> pacientes = new ArrayList<>();
        List<Doctor> doctores = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();

        public void admitirPaciente(Paciente paciente) {
            pacientes.add(paciente);
            System.out.println("Paciente admitido: " + paciente);
        }

        public void contratarDoctor(Doctor doctor) {
            doctores.add(doctor);
            System.out.println("Doctor contratado: " + doctor);
        }

        public void verDoctores() {
            doctores.forEach(System.out::println);
        }

        public void verPacientes() {
            pacientes.forEach(System.out::println);
        }

        public void verCitas() {
            citas.forEach(System.out::println);
        }

        public void pedirCita(String nss, String especialidad, String fecha) {
            Optional<Paciente> paciente = pacientes.stream().filter(p -> p.nss.equals(nss)).findFirst();
            Optional<Doctor> doctor = doctores.stream().filter(d -> d.getEspecialidad().contains(especialidad)).findFirst();

            if (paciente.isPresent() && doctor.isPresent()) {
                Cita cita = new Cita(fecha, especialidad, doctor.get(), paciente.get());
                citas.add(cita);
                System.out.println("Cita asignada: " + cita);
            } else {
                System.out.println("No se pudo asignar la cita. Verifique el NSS y la especialidad.");
            }
        }
    }



