

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llamada al ejercicio 1: Media de las temperaturas
        ejercicioTemperaturas(scanner);

        // Llamada al ejercicio 2: Tabla de multiplicar
        ejercicioTablaDeMultiplicar(scanner);

        // Cerrar el scanner
        scanner.close();
    }

    // Ejercicio 1: Calcular la media de las temperaturas
    public static void ejercicioTemperaturas(Scanner scanner) {
        // Solicitar el número de temperaturas a introducir
        System.out.print("Introduce el número de temperaturas a ingresar: ");
        int numTemperaturas = scanner.nextInt();

        // Si el número es 0 o negativo, se establece en 10
        if (numTemperaturas <= 0) {
            numTemperaturas = 10;
        }

        // Inicializamos un array para almacenar las temperaturas
        double[] temperaturas = new double[numTemperaturas];

        // Bucle para pedir las temperaturas
        for (int i = 0; i < numTemperaturas; i++) {
            System.out.print("Introduce la temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Calcular la media de las temperaturas
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        double media = suma / numTemperaturas;

        // Mostrar la media con dos decimales
        System.out.printf("La media de las temperaturas es: %.2f%n", media);
    }

    // Ejercicio 2: Mostrar la tabla de multiplicar
    public static void ejercicioTablaDeMultiplicar(Scanner scanner) {
        // Pedir un número entre 0 y 10
        System.out.print("Introduce un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        // Verificar que el número esté en el rango adecuado
        while (numero < 0 || numero > 10) {
            System.out.print("Número fuera de rango. Introduce un número entre 0 y 10: ");
            numero = scanner.nextInt();
        }

        // Mostrar la tabla de multiplicar del número introducido
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}





}
