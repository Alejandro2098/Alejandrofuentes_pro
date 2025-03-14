
    public class Terreno {
        public String getValor;
        private Casa casa;
        private double m2;
        private Orientacion orientacion;
        private double valoracion;

        // Enum para la orientación
        public enum Orientacion {
            NORTE, SUR, ESTE, OESTE
        }

        // Constructor de Terreno
        public Terreno(double m2, Orientacion orientacion, double valoracion) {
            this.m2 = m2;
            this.orientacion = orientacion;
            this.valoracion = valoracion;
        }

        // Metodo para revalorizar la casa
        public void revalorizarCasa() {
            if (casa != null) {
                if (casa.getM2() > 100 && casa.tienePiscina()) {
                    valoracion *= 1.50;
                } else if (casa.getM2() > 100) {
                    valoracion *= 1.30;
                } else {
                    valoracion *= 1.25;
                }
            }
        }

        // Metodo para construir una casa en el terreno
        public void construirCasa(double m2, int habitaciones) {
            if (this.casa == null) {
                this.casa = new Casa(m2, habitaciones);
            } else {
                throw new IllegalStateException("Ya hay una casa construida en este terreno.");
            }
        }

        // Getters y Setters
        public Casa getCasa() {
            return casa;
        }

        public double getM2() {
            return m2;
        }

        public Orientacion getOrientacion() {
            return orientacion;
        }

        public double getValoracion() {
            return valoracion;
        }

        public void setValoracion(double valoracion) {
            this.valoracion = valoracion;
        }
    }

