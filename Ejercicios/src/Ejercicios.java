

import java.util.Scanner;
import java.util.Random;

public class ejercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Llamada al ejercicio 1: Media de las temperaturas
        ejercicioTemperaturas(scanner);

        // Llamada al ejercicio 2: Tabla de multiplicar de un solo número
        ejercicioTablaDeMultiplicar(scanner);

        // Llamada al ejercicio 3: Tabla de multiplicar de todos los números del 0 al 10
        ejercicioTablaDeTodos();

        // Llamada al ejercicio 4: Tabla de multiplicar de números en un rango
        ejercicioTablaRango(scanner);

        // Llamada al ejercicio 5: Cálculo de potencias (BaseExponente)
        ejercicioBaseExponente(scanner);

        // Llamada al ejercicio 6: Mostrar todos los números pares entre dos dados
        ejercicioParesEntreDosDados(scanner);

        // Llamada al ejercicio 7: Simulación de lanzamientos de un dado
        ejercicioDado(scanner);

        // Llamada al ejercicio 8: Números positivos, negativos y ceros
        ejercicioNumerosTipos(scanner);

        // Llamada al ejercicio 9: Sueldos
        ejercicioSueldos(scanner);

        // Llamada al ejercicio 10: Notas de alumnos
        ejercicio10(scanner);
        ejercicio11(scanner);
        ejercicio13(scanner);
        ejercicio14(scanner);
        ejercicio15(scanner);
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

    // Ejercicio 2: Mostrar la tabla de multiplicar de un solo número
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

    // Ejercicio 3: Mostrar la tabla de multiplicar de todos los números del 0 al 10
    public static void ejercicioTablaDeTodos() {
        // Bucle para recorrer los números del 0 al 10
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("\nTabla de multiplicar del " + numero + ":");
            // Para cada número, imprimir su tabla de multiplicar
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

    // Ejercicio 4: Mostrar la tabla de multiplicar de los números en un rango
    public static void ejercicioTablaRango(Scanner scanner) {
        // Pedir los dos números que definen el rango
        System.out.print("Introduce el número inicial del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Introduce el número final del rango: ");
        int fin = scanner.nextInt();

        // Verificar que el rango sea válido (inicio <= fin)
        if (inicio > fin) {
            System.out.println("El número inicial debe ser menor o igual que el número final.");
            return;
        }

        // Bucle para recorrer los números en el rango especificado
        for (int numero = inicio; numero <= fin; numero++) {
            System.out.println("\nTabla de multiplicar del " + numero + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }

    // Ejercicio 5: Calcular la potencia de un número (base^exponente)
    public static void ejercicioBaseExponente(Scanner scanner) {
        // Pedir la base y el exponente
        System.out.print("Introduce la base (entre 0 y 5): ");
        int base = scanner.nextInt();
        System.out.print("Introduce el exponente (entre 0 y 5): ");
        int exponente = scanner.nextInt();

        // Manejar casos especiales
        if (base == 0 && exponente == 0) {
            System.out.println("Error: 0^0 no está definido.");
            return;
        } else if (exponente == 0) {
            System.out.println(base + "^" + exponente + " = 1");
            return;
        }

        // Calcular la potencia base^exponente
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        // Mostrar el resultado
        System.out.println(base + "^" + exponente + " = " + resultado);
    }

    // Ejercicio 6: Mostrar todos los números pares entre dos dados
    public static void ejercicioParesEntreDosDados(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);
        System.out.println("Números pares entre " + inicio + " y " + fin + ":");
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Ejercicio 7: Simular el lanzamiento de un dado
    public static void ejercicioDado(Scanner scanner) {
        Random random = new Random();
        System.out.print("Introduce el número de veces que se lanzará el dado: ");
        int lanzamientos = scanner.nextInt();
        if (lanzamientos <= 0) {
            lanzamientos = 100;
        }
        for (int i = 1; i <= lanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }
    }

    // Ejercicio 8: Números positivos, negativos y ceros
    public static void ejercicioNumerosTipos(Scanner scanner) {
        int positivos = 0, negativos = 0, ceros = 0;
        double sumaPositivos = 0, sumaNegativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
                sumaPositivos += numero;
            } else if (numero < 0) {
                negativos++;
                sumaNegativos += numero;
            } else {
                ceros++;
            }
        }
        System.out.printf("Media de los números positivos: %.2f%n", (positivos > 0 ? sumaPositivos / positivos : 0));
        System.out.printf("Media de los números negativos: %.2f%n", (negativos > 0 ? sumaNegativos / negativos : 0));
        System.out.println("Cantidad de ceros: " + ceros);
    }

    // Ejercicio 9: Sueldos
    public static void ejercicioSueldos(Scanner scanner) {
        double suma = 0;
        int mayoresDe1000 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el sueldo " + i + ": ");
            double sueldo = scanner.nextDouble();
            suma += sueldo;
            if (sueldo > 1000) {
                mayoresDe1000++;
            }
        }
        System.out.printf("Suma total de los sueldos: %.2f%n", suma);
        System.out.printf("Media de los sueldos: %.2f%n", suma / 10);
        System.out.println("Cantidad de sueldos mayores de 1000: " + mayoresDe1000);
    }

    public static void ejercicio10(Scanner scanner) {
        // Introduce  6 notas, escribir la cantidad de alumnos
        // aprobados,
        // condicionados (=4) y suspensos.(NotasTipos)
        int numeroSS = 0, numeroAP = 0, numeroCD = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce una nota");
            int nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota > 4) {
                    numeroAP++;
                } else if (nota < 4) {
                    numeroSS++;
                } else {
                    numeroCD++;
                }
            } else {
                System.out.println("Nota invalida");
            }
        }

        System.out.println("El numero de AP es " + numeroAP);
        System.out.println("El numero de SS es " + numeroSS);
        System.out.println("El numero de CD es " + numeroCD);
    }

    public static void ejercicio11(Scanner scanner) {
        System.out.println("De que lado quieres el cuadrado");
        int lado = scanner.nextInt();
        for (int i = 0; i < lado; i++) {
            //System.out.println("\t+\t");
            for (int j = 0; j < lado; j++) {
                // primera fila o ultima
                if (i == 0 || i == lado - 1) {
                    System.out.print("\t+\t");
                }
                // primera columna o ultima
                else if (j == 0 || j == lado - 1) {
                    System.out.print("\t+\t");
                } else
                    System.out.print("\to\t");
            }
            System.out.println();
        }
    }

    public static void ejercicio13(Scanner scanner) {
        System.out.println("Dime de que palabra quieres sacar contraria");
        String palabra = scanner.next();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
    }

    public static void ejercicio14(Scanner scanner) {

        System.out.println("Dime de que palabra quieres comprobar si es palindromo");
        // String palabra = scanner.next();
        String palabra = "Ejecúción";
        // NO SE TIENEN EN CUENTA MAYUSCULAS NI ACENTOS
        palabra = palabra.toLowerCase().replaceAll("ó", "o")
                .replaceAll("á", "a")
                .replaceAll("í", "i")
                .replaceAll("ú", "u")
                .replaceAll("é", "e");
        String palabraInversa = "";

        for (int i = palabra.length()-1; i >=0 ; i--) {
            palabraInversa+=palabra.charAt(i);
        }

        if (palabra.equals(palabraInversa)){
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }
    public static void  ejercicio15(Scanner scanner){

    }

}