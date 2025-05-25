package model;

public class Asalariado {
    // Clase Asalariado
    class Asalariado extends Trabajador {
        private double sueldo;
        private int numPagas;
        private boolean contratado;

        public Asalariado(String nombre, String apellido, String dni, double sueldo, int numPagas, boolean contratado) {
            super(nombre, apellido, dni);
            this.sueldo = sueldo;
            this.numPagas = numPagas;
            this.contratado = contratado;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + dni +
                    " Salario Anual: " + (sueldo * numPagas) + " Salario Mensual: " + sueldo +
                    " Número de Pagas: " + numPagas);
        }
    }

}
