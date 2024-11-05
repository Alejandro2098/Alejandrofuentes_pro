

import java.util.Random;
import java.util.Scanner;

public class examen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Elige el ejercicio a ejecutar:");
            System.out.println("1. Operaciones matemáticas");
            System.out.println("2. Caja fuerte");
            System.out.println("3. Conversión de base");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio3(scanner);
                    break;
                case 3:
                    ejercicio4(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    public static void ejercicio1(Scanner scanner) {
        while (true) {
            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();

            if (numero1 < 0 || numero2 < 0) {
                System.out.println("No se pueden realizar operaciones sobre números negativos.");
                continue;
            }

            while (true) {
                System.out.println("Elige una operación:");
                System.out.println("a. Suma");
                System.out.println("b. Resta");
                System.out.println("c. Multiplicación");
                System.out.println("d. División");
                System.out.println("e. Salir");

                char opcion = scanner.next().charAt(0);

                switch (opcion) {
                    case 'a':
                        System.out.printf("Resultado de la suma: %.2f%n", numero1 + numero2);
                        break;
                    case 'b':
                        System.out.printf("Resultado de la resta: %.2f%n", numero1 - numero2);
                        break;
                    case 'c':
                        System.out.printf("Resultado de la multiplicación: %.2f%n", numero1 * numero2);
                        break;
                    case 'd':
                        if (numero2 != 0) {
                            System.out.printf("Resultado de la división: %.2f%n", numero1 / numero2);
                        } else {
                            System.out.println("No se puede dividir entre cero.");
                        }
                        break;
                    case 'e':
                        System.out.println("Saliendo del menú...");
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                }
            }
        }
    }

    public static void ejercicio3(Scanner scanner) {
        final int claveCorrecta = 1234;  // Clave de apertura de la caja fuerte
        int intentos = 4;  // Número de intentos permitidos

        System.out.println("Bienvenido al sistema de apertura de la caja fuerte.");

        while (intentos > 0) {
            System.out.print("Introduce la clave de 4 dígitos: ");
            int claveUsuario = scanner.nextInt();

            if (claveUsuario == claveCorrecta) {
                System.out.println("Perfecto, la caja ha sido abierta");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Intento fallido, prueba de nuevo. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Lo siento, caja bloqueada.");
                }
            }
        }
    }

    public static void ejercicio4(Scanner scanner) {
        while (true) {
            System.out.print("Introduce un número en base decimal: ");
            int numeroDecimal = scanner.nextInt();

            if (numeroDecimal < 0) {
                System.out.println("No se puede hacer la operación con números negativos.");
            } else {
                while (true) {
                    System.out.println("Elige el tipo de cambio de base:");
                    System.out.println("a. Base 2");
                    System.out.println("b. Base 8");
                    System.out.println("c. Base 16");
                    System.out.println("d. Salir");

                    char opcion = scanner.next().charAt(0);

                    if (opcion == 'a') {
                        System.out.println("El número en base 2 es: " + Integer.toBinaryString(numeroDecimal));
                    } else if (opcion == 'b') {
                        System.out.println("El número en base 8 es: " + Integer.toOctalString(numeroDecimal));
                    } else if (opcion == 'c') {
                        System.out.println("El número en base 16 es: " + Integer.toHexString(numeroDecimal).toUpperCase());
                    } else if (opcion == 'd') {
                        System.out.println("Saliendo del menú.");
                        break;
                    } else {
                        System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    }
                }
            }

            System.out.print("¿Deseas introducir otro número? (s/n): ");
            char continuar = scanner.next().charAt(0);
            if (continuar == 'n') {
                System.out.println("Adiós.");
                break;
            }
        }
    }
}
