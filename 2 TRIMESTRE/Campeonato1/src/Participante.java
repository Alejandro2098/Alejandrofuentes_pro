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




