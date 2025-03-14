import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Terreno terreno = null;

        while (true) {
            System.out.println("1. Crear terreno");
            System.out.println("2. Crear casa");
            System.out.println("3. Mostrar datos de la casa");
            System.out.println("4. Construir habitación");
            System.out.println("5. Construir piscina");
            System.out.println("6. Construir anexo");
            System.out.println("7. Revalorizar casa");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese los m2 del terreno: ");
                        double m2Terreno = scanner.nextDouble();
                        System.out.print("Ingrese la orientación (NORTE, SUR, ESTE, OESTE): ");
                        String orientacionStr = scanner.next();
                        Terreno.Orientacion orientacion = Terreno.Orientacion.valueOf(orientacionStr.toUpperCase());
                        System.out.print("Ingrese la valoración del terreno: ");
                        double valoracion = scanner.nextDouble();
                        terreno = new Terreno(m2Terreno, orientacion, valoracion);
                        System.out.println("Terreno creado con éxito.");
                        break;
                    case 2:
                        if (terreno == null) {
                            System.out.println("Primero debe crear un terreno.");
                            break;
                        }
                        System.out.print("Ingrese los m2 de la casa: ");
                        double m2Casa = scanner.nextDouble();
                        System.out.print("Ingrese el número de habitaciones: ");
                        int habitaciones = scanner.nextInt();
                        terreno.construirCasa(m2Casa, habitaciones);
                        System.out.println("Casa construida con éxito.");
                        break;
                    case 3:
                        if (terreno == null || terreno.getCasa() == null) {
                            System.out.println("No hay casa construida.");
                            break;
                        }
                        Casa casa = terreno.getCasa();
                        System.out.println("Datos de la casa:");
                        System.out.println("m2: " + casa.getM2());
                        System.out.println("Habitaciones: " + casa.getHabitaciones());
                        System.out.println("Piscina: " + (casa.tienePiscina() ? "Sí" : "No"));
                        break;
                    case 4:
                        if (terreno == null || terreno.getCasa() == null) {
                            System.out.println("No hay casa construida.");
                            break;
                        }
                        System.out.print("Ingrese los m2 de la habitación: ");
                        double m2Habitacion = scanner.nextDouble();
                        terreno.getCasa().construirHabitacion(m2Habitacion);
                        System.out.println("Habitación construida con éxito.");
                        break;
                    case 5:
                        if (terreno == null || terreno.getCasa() == null) {
                            System.out.println("No hay casa construida.");
                            break;
                        }
                        terreno.getCasa().construirPiscina();
                        System.out.println("Piscina construida con éxito.");
                        break;
                    case 6:
                        if (terreno == null || terreno.getCasa() == null) {
                            System.out.println("No hay casa construida.");
                            break;
                        }
                        System.out.print("Ingrese los m2 del anexo: ");
                        double m2Anexo = scanner.nextDouble();
                        terreno.getCasa().construirAnexo(m2Anexo, terreno);
                        System.out.println("Anexo construido con éxito.");
                        break;
                    case 7:
                        if (terreno == null || terreno.getCasa() == null) {
                            System.out.println("No hay casa construida.");
                            break;
                        }
                        terreno.revalorizarCasa();
                        System.out.println("Casa revalorizada. Nueva valoración: " + terreno.getValor);
                }
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


