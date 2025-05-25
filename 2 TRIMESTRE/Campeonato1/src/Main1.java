


// Archivo: Participante.java
public class Main1 {
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
