
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Pedir los 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar el contenido del array con su índice
        System.out.println("\nContenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] puntos = new int[30];
        int suma = 0;

        // Generar 30 números aleatorios entre 0 y 10 y calcular la suma
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = random.nextInt(11); // Genera entre 0 y 10
            suma += puntos[i];
        }

        // Mostrar total de puntos y media
        System.out.println("Total de puntos obtenidos: " + suma);
        System.out.println("Media de puntos obtenidos: " + (double)suma / puntos.length);
    }
}


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números por teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar en orden inverso
        System.out.println("\nNúmeros en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar en orden normal
        System.out.println("\n\nNúmeros en orden normal:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}


public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Llenar el array numero con valores aleatorios entre 0 y 100
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(101); // Genera entre 0 y 100
            cuadrado[i] = numero[i] * numero[i]; // Calcular el cuadrado
            cubo[i] = numero[i] * numero[i] * numero[i]; // Calcular el cubo
        }

        // Mostrar los resultados
        System.out.println("Número  Cuadrado  Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%5d %10d %10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }

import java.util.Scanner;

    public class ParImparArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[8];

            // Pedir 8 números enteros y almacenarlos en el array
            System.out.println("Introduce 8 números enteros:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Mostrar cada número con "par" o "impar"
            System.out.println("\nResultados:");
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " - par");
                } else {
                    System.out.println(numero + " - impar");
                }
            }

            scanner.close();
        }
    }

<<<<<<< HEAD
public static void main (String[]args ){
        //definir un array con filas 5 y columnas aleatorias entre 2-6
    //rellenar el array (entera) en aleatorias
    public static void main (String []args)//al array hay que quitarle uno a cadda posicion
    //y volver a imprimir
    public scanner scanner (seiu)
 object ( int numero 0,2,3,5,
    )
}
=======

>>>>>>> 94ef94c5288f0a62a81dfd6b01a265a510893416


}
