// Archivo: Carrera.java
import java.util.*;

public class Carrera {
    private Circuito circuito;
    private List<Map.Entry<Participante, Integer>> resultados;

    public Carrera(Circuito circuito) {
        this.circuito = circuito;
        this.resultados = new ArrayList<>();
    }

    public void agregarResultado(Participante participante, int tiempo) {
        resultados.add(new AbstractMap.SimpleEntry<>(participante, tiempo));
    }

    public void calcularGanadores() {
        resultados.sort(Comparator.comparingInt(Map.Entry::getValue));
        int[] puntos = {10, 7, 6};

        for (int i = 0; i < Math.min(3, resultados.size()); i++) {
            Participante participante = resultados.get(i).getKey();
            participante.sumarPuntos(puntos[i]);
            if (i == 0) {
                participante.registrarVictoria();
            }
        }
    }

    public Participante ganadorCarrera() {
        return resultados.isEmpty() ? null : resultados.get(0).getKey();
    }
}

