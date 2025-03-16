
package Model;

import Service.Centro;
import java.time.LocalDate;

    public class Main {
        public static void main(String[] args) {
            // Crear un centro de salud con cualquier tipo de médico
            Centro centro = new Centro(null);

            // Admitir pacientes
            Paciente paciente1 = new Paciente("Juan", "Pérez", "123456", "Dolor de estómago");
            centro.admitirPaciente(paciente1);

            // Contratar doctores
            Doctor doctor1 = new Digestivo("Carlos", "Gómez", "654321", 10);
            centro.contratarDoctor(doctor1);

            // Pedir cita
            centro.pedirCita("123456", "Digestivo", LocalDate.of(2023, 10, 15));

            // Ver citas
            centro.verCitasPacientes();
        }
    }

