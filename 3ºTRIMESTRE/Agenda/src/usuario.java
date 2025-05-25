
    import java.io.Serializable;

    class Usuario implements Serializable {
        private String nombre;
        private String apellido;
        private String correo;
        private String telefono;

        public Usuario(String nombre, String apellido, String correo, String telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return nombre + "," + apellido + "," + correo + "," + telefono;
        }

        public String mostrarDatos() {
            return "Nombre: " + nombre + ", Apellido: " + apellido + ", Correo: " + correo + ", Teléfono: " + telefono;
        }
    }


