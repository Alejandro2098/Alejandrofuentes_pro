package model;

public class Jefe {
    // Clase Jefe
    class Jefe extends Trabajador {
        private int acciones;
        private double beneficio;

        public Jefe(String nombre, String apellido, String dni, int acciones, double beneficio) {
            super(nombre, apellido, dni);
            this.acciones = acciones;
            this.beneficio = beneficio;
        }

        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " DNI: " + dni +
                    " Acciones: " + acciones + " Beneficio: " + beneficio);
        }
    }

}
