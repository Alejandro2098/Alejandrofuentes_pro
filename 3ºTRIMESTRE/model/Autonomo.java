package model;

public class Autonomo {
    // Clase Autónomo
    class Autonomo extends Trabajador {
        private double sueldo;
        private boolean contratado;

        public Autonomo(String nombre, String apellido, String dni, double sueldo, boolean contratado) {
            super(nombre, apellido, dni);
            this.sueldo = sueldo;
            this.contratado = contratado;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + dni +
                    " Salario Anual: " + sueldo);
        }
    }


}
