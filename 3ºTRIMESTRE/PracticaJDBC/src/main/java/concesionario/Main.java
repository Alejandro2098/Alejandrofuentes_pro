package concesionario;


import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Coche> coches = new ArrayList<>();
    static final String FICHERO_DAT = "coches.dat";

    public static void main(String[] args) {
        cargarCoches();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                1. Añadir nuevo coche
                2. Borrar coche por id
                3. Consulta coche por id
                4. Listado de coches
                5. Exportar coches a CSV
                6. Gestión de pasajeros
                7. Terminar programa
            """);

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> añadirCoche(sc);
                case 2 -> borrarCoche(sc);
                case 3 -> consultarCoche(sc);
                case 4 -> listarCoches();
                case 5 -> exportarCSV();
                case 6 -> gestionarPasajeros(sc);
                case 7 -> guardarCoches();
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    static void cargarCoches() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO_DAT))) {
            coches = (ArrayList<Coche>) ois.readObject();
            System.out.println("Coches cargados correctamente.");
        } catch (Exception e) {
            coches = new ArrayList<>();
            System.out.println("No se ha encontrado el archivo, colección vacía inicializada.");
        }
    }

    static void guardarCoches() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO_DAT))) {
            oos.writeObject(coches);
            System.out.println("Coches guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }

    static void añadirCoche(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Matricula: ");
        String matricula = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();

        coches.add(new Coche(id, matricula, marca, modelo, color));
    }

    static void borrarCoche(Scanner sc) {
        System.out.print("ID a borrar: ");
        int id = sc.nextInt();
        coches.removeIf(c -> c.getId() == id);
    }

    static void consultarCoche(Scanner sc) {
        System.out.print("ID a consultar: ");
        int id = sc.nextInt();
        coches.stream().filter(c -> c.getId() == id).findFirst().ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Coche no encontrado.")
        );
    }

    static void listarCoches() {
        coches.forEach(System.out::println);
    }

    static void exportarCSV() {
        try (PrintWriter pw = new PrintWriter("coches.csv")) {
            pw.println("id;matricula;marca;modelo;color");
            for (Coche c : coches) {
                pw.printf("%d;%s;%s;%s;%s\n", c.getId(), c.getMatricula(), c.getMarca(), c.getModelo(), c.getColor());
            }
            System.out.println("Exportación a CSV completada.");
        } catch (IOException e) {
            System.out.println("Error al exportar CSV.");
        }
    }

    static void gestionarPasajeros(Scanner sc) {
        int opcion;
        do {
            System.out.println("""
                GESTIÓN DE PASAJEROS
                1. Añadir nuevo pasajero
                2. Borrar pasajero por id
                3. Consulta pasajero por id
                4. Listar todos los pasajeros
                5. Añadir pasajero a coche
                6. Eliminar pasajero de coche
                7. Listar pasajeros de coche
                8. Volver al menú principal
            """);

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> añadirPasajero(sc);
                case 2 -> borrarPasajero(sc);
                case 3 -> consultarPasajero(sc);
                case 4 -> listarTodosPasajeros();
                case 5 -> añadirPasajeroACoche(sc);
                case 6 -> eliminarPasajeroDeCoche(sc);
                case 7 -> listarPasajerosDeCoche(sc);
            }
        } while (opcion != 8);
    }

    static List<Pasajero> listaGlobalPasajeros = new ArrayList<>();

    static void añadirPasajero(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        listaGlobalPasajeros.add(new Pasajero(id, nombre, edad, peso));
    }

    static void borrarPasajero(Scanner sc) {
        System.out.print("ID del pasajero: ");
        int id = sc.nextInt();
        listaGlobalPasajeros.removeIf(p -> p.getId() == id);
        for (Coche coche : coches) coche.eliminarPasajeroPorId(id);
    }

    static void consultarPasajero(Scanner sc) {
        System.out.print("ID del pasajero: ");
        int id = sc.nextInt();
        listaGlobalPasajeros.stream().filter(p -> p.getId() == id).findFirst().ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Pasajero no encontrado.")
        );
    }

    static void listarTodosPasajeros() {
        listaGlobalPasajeros.forEach(System.out::println);
    }

    static void añadirPasajeroACoche(Scanner sc) {
        listarCoches();
        System.out.print("ID del coche: ");
        int idCoche = sc.nextInt();
        Coche coche = coches.stream().filter(c -> c.getId() == idCoche).findFirst().orElse(null);
        if (coche == null) return;

        System.out.print("ID del pasajero: ");
        int idPas = sc.nextInt();
        Pasajero p = listaGlobalPasajeros.stream().filter(pa -> pa.getId() == idPas).findFirst().orElse(null);
        if (p == null) return;

        coche.añadirPasajero(p);
    }

    static void eliminarPasajeroDeCoche(Scanner sc) {
        listarCoches();
        System.out.print("ID del coche: ");
        int idCoche = sc.nextInt();
        Coche coche = coches.stream().filter(c -> c.getId() == idCoche).findFirst().orElse(null);
        if (coche == null) return;

        System.out.print("ID del pasajero a eliminar: ");
        int idPas = sc.nextInt();
        coche.eliminarPasajeroPorId(idPas);
    }

    static void listarPasajerosDeCoche(Scanner sc) {
        System.out.print("ID del coche: ");
        int idCoche = sc.nextInt();
        Coche coche = coches.stream().filter(c -> c.getId() == idCoche).findFirst().orElse(null);
        if (coche != null) coche.getPasajeros().forEach(System.out::println);
        else System.out.println("Coche no encontrado.");
    }
}
