
    import java.util.*;

    class Participante {
        private String nombre;
        private String coche;
        private int puntos;
        private int victorias;

        public Participante(String nombre, String coche) {
            this.nombre = nombre;
            this.coche = coche;
            this.puntos = 0;
            this.victorias = 0;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCoche() {
            return coche;
        }

        public int getPuntos() {
            return puntos;
        }

        public int getVictorias() {
            return victorias;
        }

        public void sumarPuntos(int puntos) {
            this.puntos += puntos;
        }

        public void registrarVictoria() {
            this.victorias++;
        }
    }

    class Circuito {
        private String nombre;
        private int numeroVueltas;

        public Circuito(String nombre, int numeroVueltas) {
            this.nombre = nombre;
            this.numeroVueltas = numeroVueltas;
        }

        public String getNombre() {
            return nombre;
        }

        public int getNumeroVueltas() {
            return numeroVueltas;
        }
    }

    class Carrera {
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

    class Campeonato {
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

    public class Main {
        public static void main(String[] args) {
            Campeonato campeonato = new Campeonato();

            // Inscribir participantes
            campeonato.inscribirParticipante("Juan", "Coche1");
            campeonato.inscribirParticipante("Maria", "Coche2");
            campeonato.inscribirParticipante("Luis", "Coche3");

            // Crear circuito y agregar carreras
            Circuito circuito1 = new Circuito("Circuito A", 10);
            Circuito circuito2 = new Circuito("Circuito B", 15);

            campeonato.agregarCarrera(circuito1);
            campeonato.agregarCarrera(circuito2);

            // Simular resultados de la primera carrera
            Carrera carrera1 = campeonato.getCarreras().get(0);
            carrera1.agregarResultado(campeonato.getParticipantes().get(0), 120);
            carrera1.agregarResultado(campeonato.getParticipantes().get(1), 115);
            carrera1.agregarResultado(campeonato.getParticipantes().get(2), 118);
            carrera1.calcularGanadores();

            // Simular resultados de la segunda carrera
            Carrera carrera2 = campeonato.getCarreras().get(1);
            carrera2.agregarResultado(campeonato.getParticipantes().get(0), 110);
            carrera2.agregarResultado(campeonato.getParticipantes().get(1), 112);
            carrera2.agregarResultado(campeonato.getParticipantes().get(2), 109);
            carrera2.calcularGanadores();

            // Obtener resultados del campeonato
            System.out.println("Ganador del campeonato: " + campeonato.ganadorCampeonato().getNombre());
            System.out.println("Coche más ganador: " + campeonato.cocheMasGanador().getCoche());
        }
    }

