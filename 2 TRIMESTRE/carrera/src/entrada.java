public class entrada {


}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Participante {
    private String nombre;
    private int puntuacion;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void sumarPuntos(int puntos) {
        this.puntuacion += puntos;
    }
}

class Carrera {
    private String nombre;
    private ArrayList<Participante> participantes;
    private boolean carreraIniciada;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.participantes = new ArrayList<>();
        this.carreraIniciada = false;
    }

    public void inscribirParticipante(String nombre) {
        if (carreraIniciada) {
            System.out.println("No se pueden inscribir participantes después de iniciar la carrera.");
            return;
        }
        participantes.add(new Participante(nombre));
        System.out.println("Participante " + nombre + " inscrito exitosamente.");
    }

    public void desinscribirParticipante(String nombre) {
        if (carreraIniciada) {
            System.out.println("No se pueden desinscribir participantes después de iniciar la carrera.");
            return;
        }
        participantes.removeIf(p -> p.getNombre().equals(nombre));
        System.out.println("Participante " + nombre + " desinscrito.");
    }

    public void mostrarParticipantes() {
        System.out.println("Participantes inscritos:");
        for (Participante p : participantes) {
            System.out.println("- " + p.getNombre());
        }
    }

    public void iniciarCarrera(int vueltas) {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes para iniciar la carrera.");
            return;
        }
        carreraIniciada = true;
        Random random = new Random();



        for (int i = 1; i <= vueltas; i++) {
            System.out.println("Vuelta " + i + ":");
            for (Participante p : participantes) {
                int puntos = random.nextInt(11); // Puntos aleatorios entre 0 y 10
                p.sumarPuntos(puntos);
                System.out.println(p.getNombre() + " suma " + puntos + " puntos. Total: " + p.getPuntuacion());
            }
            System.out.println();
        }
        mostrarGanador();
    }

    public void mostrarGanador() {
        Participante ganador = Collections.max(participantes, Comparator.comparingInt(Participante::getPuntuacion));
        System.out.println("El ganador es " + ganador.getNombre() + " con " + ganador.getPuntuacion() + " puntos.");
    }

    public void mostrarCalificacionesFinales() {
        System.out.println("Calificaciones finales:");
        participantes.sort(Comparator.comparingInt(Participante::getPuntuacion).reversed());
        for (Participante p : participantes) {
            System.out.println(p.getNombre() + ": " + p.getPuntuacion() + " puntos");
        }
    }

}

class SimulacionCarrera {
    public static void main(String[] args) {
        Carrera carrera = new Carrera("Gran Premio Java");

        carrera.inscribirParticipante("Alice");
        carrera.inscribirParticipante("Bob");
        carrera.inscribirParticipante("Charlie");

        carrera.mostrarParticipantes();

        carrera.desinscribirParticipante("Bob");

        carrera.mostrarParticipantes();

        carrera.iniciarCarrera(5);

        carrera.mostrarCalificacionesFinales();
    }
}
