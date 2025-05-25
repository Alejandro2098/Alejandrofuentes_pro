import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Archivo: Campeonato.java
import java.util.*;

public class Campeonato {
    private List<Participante> participantes;
    private List<Carrera> carreras;

    public Campeonato() {
        this.participantes = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    public void inscribirParticipante(String nombre, String coche) {
        if (participantes.size() < 10) {
            participantes.add(new Participante(nombre, coche));
        } else {
            throw new IllegalStateException("El campeonato ya tiene 10 participantes.");
        }
    }

    public void agregarCarrera(Circuito circuito) {
        if (carreras.size() < 8) {
            carreras.add(new Carrera(circuito));
        } else {
            throw new IllegalStateException("El campeonato ya tiene 8 carreras.");
        }
    }

    public Participante ganadorCampeonato() {
        return participantes.stream()
                .max(Comparator.comparingInt(Participante::getPuntos))
                .orElse(null);
    }

    public Participante cocheMasGanador() {
        return participantes.stream()
                .max(Comparator.comparingInt(Participante::getVictorias))
                .orElse(null);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }
}
