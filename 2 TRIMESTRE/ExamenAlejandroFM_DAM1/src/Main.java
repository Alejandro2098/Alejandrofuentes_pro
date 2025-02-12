
    import java.util.*;

    // Clase base Vehiculo
    public class Vehiculo {
        protected String numeroSerie, marca, modelo;
        protected estado estado;
        protected double precio;

        //coches ,motos ,patinetes ,y bicis
        // tienda online 3 fijos,nuevo,seminuevo,y usado


        public String getMarca() {
            return marca= marca ;
        }

        public double getPrecio() {
            return precio= precio;
        }

        public String getNumeroSerie() {
            return numeroSerie = numeroSerie;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public estado getEstado() {
            return estado= estado ;
        }

    }
    //vehiculos rotos incrementado su precio un 5%bicis o 10%patinetes ,coches y motos saldra un error




