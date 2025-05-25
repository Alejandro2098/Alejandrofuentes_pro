
    public class Casa {
        private double m2;
        private boolean piscina;
        private int habitaciones;

        // Constructor de Casa
        public Casa(double m2, int habitaciones) {
            this.m2 = m2;
            this.habitaciones = habitaciones;
            this.piscina = false;
        }

        // Metodo para construir una habitación
        public void construirHabitacion(double metros) {
            if (metros > this.m2) {
                throw new IllegalArgumentException("No hay suficientes metros cuadrados para construir la habitación.");
            }
            this.m2 -= metros;
            this.habitaciones++;
        }

        // Metodo para construir una piscina
        public void construirPiscina() {
            if (this.piscina) {
                throw new IllegalStateException("Ya hay una piscina construida.");
            }
            this.piscina = true;
        }

        // Metodo para construir un anexo
        public void construirAnexo(double metros, Terreno terreno) {
            if (metros > terreno.getM2()) {
                throw new IllegalArgumentException("No hay suficientes metros cuadrados en el terreno para construir el anexo.");
            }
            terreno.setM2(terreno.getM2() - metros);
        }

        // Getters y Setters
        public double getM2() {
            return m2;
        }

        public boolean tienePiscina() {
            return piscina;
        }

        public int getHabitaciones() {
            return habitaciones;
        }
    }

