import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class entrada{

    public static void main(String[] args) {
        multiplicarArray();
        mayorArray();
        sumaArrays();
        posicionesArray();
        operacionesArray();
        arrayNoRepetidos();
        generadorPalabras();
        ahorcadoArray();
        invisibleArray();
        menuArray();
    }

    // Ejercicio 1: MultiplicarArray
    public static void multiplicarArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el número para la posición " + i + ": ");
            array[i] = scanner.nextInt() * 2;
        }

        int sumaTotal = 0;
        for (int num : array) {
            sumaTotal += num;
        }
        double media = sumaTotal / (double) array.length;

        System.out.println("Suma de todos los números: " + sumaTotal);
        System.out.println("Media de todos los elementos: " + media);
    }

    // Ejercicio 2: MayorArray
    public static void mayorArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        int[] array = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int mayor = array[0];
        int menor = array[0];
        for (int num : array) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        System.out.println("Elemento mayor: " + mayor);
        System.out.println("Elemento menor: " + menor);
    }

    // Ejercicio 3: SumaArrays
    public static void sumaArrays() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Introduce la longitud del primer array: ");
        int longitud1 = scanner.nextInt();
        System.out.print("Introduce la longitud del segundo array: ");
        int longitud2 = scanner.nextInt();

        if (longitud1 != longitud2) {
            System.out.println("Las longitudes de los arrays deben ser iguales.");
            return;
        }

        int[] array1 = new int[longitud1];
        int[] array2 = new int[longitud2];
        int[] array3 = new int[longitud1];

        for (int i = 0; i < longitud1; i++) {
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
            array3[i] = array1[i] + array2[i];
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3 (suma de posiciones): " + Arrays.toString(array3));
    }

    // Ejercicio 4: PosicionesArray
    public static void posicionesArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();
        int[] array = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Introduce el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int[] arrayDerecha = new int[longitud];
        arrayDerecha[0] = array[longitud - 1];
        for (int i = 1; i < longitud; i++) {
            arrayDerecha[i] = array[i - 1];
        }
        System.out.println("Array movido a la derecha: " + Arrays.toString(arrayDerecha));

        int[] arrayIzquierda = new int[longitud];
        arrayIzquierda[longitud - 1] = array[0];
        for (int i = 0; i < longitud - 1; i++) {
            arrayIzquierda[i] = array[i + 1];
        }
        System.out.println("Array movido a la izquierda: " + Arrays.toString(arrayIzquierda));
    }

    // Ejercicio 5: OperacionesArray
    public static void operacionesArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Array inicial: " + Arrays.toString(array));

        // Incrementar en 1 los pares, disminuir en 1 los impares
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            } else {
                array[i]--;
            }
        }
        System.out.println("Array tras ajuste de pares/impares: " + Arrays.toString(array));

        // Duplicar valores positivos menores que 5
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] < 5) {
                array[i] *= 2;
            }
        }
        System.out.println("Array tras duplicar positivos <5: " + Arrays.toString(array));
    }


    // Ejercicio 6: ArrayNoRepetidos
    public static void arrayNoRepetidos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        int maximo;
        do {
            System.out.print("Introduce el número máximo que se va a guardar (debe ser mayor o igual a la longitud): ");
            maximo = scanner.nextInt();
        } while (maximo < longitud);

        HashSet<Integer> numeros = new HashSet<>();
        Random random = new Random();
        while (numeros.size() < longitud) {
            numeros.add(random.nextInt(maximo + 1));
        }

        System.out.println("Array sin números repetidos: " + numeros);
    }

    // Ejercicio 7: GeneradorPalabras
    public static void generadorPalabras() {
        Scanner scanner = new Scanner(System.in);
        char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.print("¿Cuántas palabras quieres guardar?: ");
        int numPalabras = scanner.nextInt();
        String[] palabras = new String[numPalabras];

        Random random = new Random();
        for (int i = 0; i < numPalabras; i++) {
            System.out.print("¿Cuál es la longitud de la palabra " + (i + 1) + "?: ");
            int longitud = scanner.nextInt();
            StringBuilder palabra = new StringBuilder();

            for (int j = 0; j < longitud; j++) {
                palabra.append(abecedario[random.nextInt(abecedario.length)]);
            }
            palabras[i] = palabra.toString();
        }

        System.out.println("Las palabras generadas son:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    // Ejercicio 8: AhorcadoArray
    public static void ahorcadoArray() {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = {
                "elefante", "computadora", "telefono", "parque", "auto",
                "escalera", "naranja", "pintura", "maestro", "bicicleta",
                "cancion", "libro", "guitarra", "cielo", "puerta",
                "ventana", "futbol", "reloj", "teclado", "raton"
        };

        Random random = new Random();
        String palabraSeleccionada = palabras[random.nextInt(palabras.length)];
        char[] guiones = new char[palabraSeleccionada.length()];
        for (int i = 0; i < guiones.length; i++) guiones[i] = '_';

        int vidas = 5;
        boolean acertada = false;

        while (vidas > 0 && !acertada) {
            System.out.println("Palabra: " + new String(guiones));
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().charAt(0);
            boolean acierto = false;

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra) {
                    guiones[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                vidas--;
                System.out.println("Letra incorrecta. Te quedan " + vidas + " vidas.");
            }
            acertada = new String(guiones).equals(palabraSeleccionada);
        }

        if (acertada) {
            System.out.println("¡Felicidades! Has acertado la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Te has quedado sin vidas. La palabra era: " + palabraSeleccionada);
        }
    }

    // Ejercicio 9: InvisibleArray
    public static void invisibleArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de participantes (debe ser par): ");
        int numParticipantes = scanner.nextInt();

        if (numParticipantes % 2 != 0) {
            System.out.println("El número de participantes debe ser par.");
            return;
        }

        String[] participantes = new String[numParticipantes];
        for (int i = 0; i < numParticipantes; i++) {
            System.out.print("Introduce el nombre del participante " + (i + 1) + ": ");
            participantes[i] = scanner.next();
        }

        ArrayList<String> listaParticipantes = new ArrayList<>(Arrays.asList(participantes));
        Collections.shuffle(listaParticipantes);

        System.out.println("Parejas para el amigo invisible:");
        for (int i = 0; i < listaParticipantes.size(); i += 2) {
            System.out.println(listaParticipantes.get(i) + " - " + listaParticipantes.get(i + 1));
        }
    }

    // Ejercicio 10: MenuArray
    public static void menuArray() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = null;

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Crear array");
            System.out.println("2. Rellenar array con números aleatorios");
            System.out.println("3. Rellenar array con números por consola");
            System.out.println("4. Ordenar array de mayor a menor");
            System.out.println("5. Clonar array con mayor longitud");
            System.out.println("6. Mover todas las posiciones");
            System.out.println("7. Mostrar array");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la longitud del array: ");
                    int longitud = scanner.nextInt();
                    array = new int[longitud];
                    break;

                case 2:
                    if (array != null) {
                        for (int i = 0; i < array.length; i++) {
                            array[i] = random.nextInt(100);
                        }
                        System.out.println("Array rellenado con números aleatorios.");
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 3:
                    if (array != null) {
                        for (int i = 0; i < array.length; i++) {
                            System.out.print("Introduce el valor para la posición " + i + ": ");
                            array[i] = scanner.nextInt();
                        }
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 4:
                    if (array != null) {
                        Arrays.sort(array);
                        for (int i = 0; i < array.length / 2; i++) {
                            int temp = array[i];
                            array[i] = array[array.length - 1 - i];
                            array[array.length - 1 - i] = temp;
                        }
                        System.out.println("Array ordenado de mayor a menor.");
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 5:
                    if (array != null) {
                        int nuevaLongitud;
                        do {
                            System.out.print("Introduce la nueva longitud (debe ser mayor): ");
                            nuevaLongitud = scanner.nextInt();
                        } while (nuevaLongitud <= array.length);

                        array = Arrays.copyOf(array, nuevaLongitud);
                        System.out.println("Array clonado con la nueva longitud.");
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 6:
                    if (array != null) {
                        System.out.print("Elige la dirección (1 para derecha, 2 para izquierda): ");
                        int direccion = scanner.nextInt();

                        if (direccion == 1) {
                            int ultimo = array[array.length - 1];
                            System.arraycopy(array, 0, array, 1, array.length - 1);
                            array[0] = ultimo;
                        } else if (direccion == 2) {
                            int primero = array[0];
                            System.arraycopy(array, 1, array, 0, array.length - 1);
                            array[array.length - 1] = primero;
                        } else {
                            System.out.println("Dirección no válida.");
                        }
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 7:
                    if (array != null) {
                        System.out.println("Contenido del array: " + Arrays.toString(array));
                    } else {
                        System.out.println("Primero debes crear el array.");
                    }
                    break;

                case 8:
                    System.out.println("Saliendo del menú...");
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}