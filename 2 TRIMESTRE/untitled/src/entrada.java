
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

    class Reserva {
        private int numeroHabitacion;
        private String nombreHuesped;
        private String telefonoHuesped;
        private String dniHuesped;
        private int numeroPersonas;

        public Reserva(int numeroHabitacion, String nombreHuesped, String telefonoHuesped, String dniHuesped, int numeroPersonas) {
            this.numeroHabitacion = numeroHabitacion;
            this.nombreHuesped = nombreHuesped;
            this.telefonoHuesped = telefonoHuesped;
            this.dniHuesped = dniHuesped;
            this.numeroPersonas = numeroPersonas;
        }

        public int getNumeroHabitacion() {
            return numeroHabitacion;
        }

        public String getDniHuesped() {
            return dniHuesped;
        }

        public String getNombreHuesped() {
            return nombreHuesped;
        }


        public String toString() {
            return "Habitación: " + numeroHabitacion + ", Nombre: " + nombreHuesped + ", Teléfono: " + telefonoHuesped +
                    ", DNI: " + dniHuesped + ", Personas: " + numeroPersonas;
        }
    }

    class Hotel {
        private ArrayList<Reserva> reservas;
        private final int NUMERO_HABITACIONES = 20;

        public Hotel() {
            this.reservas = new ArrayList<>();
        }

        public void registrarReserva(int numeroHabitacion, String nombreHuesped, String telefonoHuesped, String dniHuesped, int numeroPersonas) {
            if (numeroHabitacion < 1 || numeroHabitacion > NUMERO_HABITACIONES) {
                System.out.println("Error: El número de habitación debe estar entre 1 y " + NUMERO_HABITACIONES);
                return;
            }

            for (Reserva reserva : reservas) {
                if (reserva.getDniHuesped().equals(dniHuesped)) {
                    System.out.println("Error: El huésped con DNI " + dniHuesped + " ya tiene una reserva activa.");
                    return;
                }
            }

            reservas.add(new Reserva(numeroHabitacion, nombreHuesped, telefonoHuesped, dniHuesped, numeroPersonas));
            System.out.println("Reserva registrada exitosamente.");
        }

        public void cancelarReserva(String dniHuesped) {
            Reserva reservaEncontrada = null;

            for (Reserva reserva : reservas) {
                if (reserva.getDniHuesped().equals(dniHuesped)) {
                    reservaEncontrada = reserva;
                    break;
                }
            }

            if (reservaEncontrada != null) {
                reservas.remove(reservaEncontrada);
                System.out.println("Reserva cancelada exitosamente.");
            } else {
                System.out.println("Error: No se encontró una reserva con el DNI proporcionado.");
            }
        }

        public void mostrarReserva(String dniHuesped) {
            for (Reserva reserva : reservas) {
                if (reserva.getDniHuesped().equals(dniHuesped)) {
                    System.out.println(reserva);
                    return;
                }
            }
            System.out.println("Error: No se encontró una reserva con el DNI proporcionado.");
        }

        public void mostrarReservasOrdenadas() {
            if (reservas.isEmpty()) {
                System.out.println("No hay reservas registradas.");
                return;
            }

            reservas.stream()
                    .sorted(Comparator.comparing(Reserva::getNombreHuesped))
                    .forEach(System.out::println);
        }
    }

    class GestionReservasHotel {
        public static void main(String[] args) {
            Hotel hotel = new Hotel();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenú de Gestión de Reservas:");
                System.out.println("1. Registrar reserva");
                System.out.println("2. Cancelar reserva");
                System.out.println("3. Mostrar reserva por DNI");
                System.out.println("4. Mostrar todas las reservas ordenadas por nombre del huésped");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion;
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    scanner.nextLine(); // Consumir entrada errónea
                    continue;
                }

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número de habitación: ");
                        int numeroHabitacion = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del huésped: ");
                        String nombreHuesped = scanner.nextLine();
                        System.out.print("Ingrese el teléfono del huésped: ");
                        String telefonoHuesped = scanner.nextLine();
                        System.out.print("Ingrese el DNI del huésped: ");
                        String dniHuesped = scanner.nextLine();
                        System.out.print("Ingrese el número de personas: ");
                        int numeroPersonas = scanner.nextInt();

                        hotel.registrarReserva(numeroHabitacion, nombreHuesped, telefonoHuesped, dniHuesped, numeroPersonas);
                        break;
                    case 2:
                        System.out.print("Ingrese el DNI del huésped para cancelar la reserva: ");
                        String dniCancelar = scanner.nextLine();
                        hotel.cancelarReserva(dniCancelar);
                        break;
                    case 3:
                        System.out.print("Ingrese el DNI del huésped para mostrar la reserva: ");
                        String dniMostrar = scanner.nextLine();
                        hotel.mostrarReserva(dniMostrar);
                        break;
                    case 4:
                        System.out.println("Lista de reservas ordenadas por nombre del huésped:");
                        hotel.mostrarReservasOrdenadas();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema de gestión de reservas.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            }
        }
    }

