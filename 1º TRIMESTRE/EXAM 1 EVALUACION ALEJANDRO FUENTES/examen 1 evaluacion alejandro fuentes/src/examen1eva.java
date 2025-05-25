

    import java.util.;

    public class examen1eva{

        public static void main(String[] args) {
            //ejercicios
            fizzBuzz();
            pronosticoBonoloto();
            arrayUnicoRango();
            generadorPalabras(;
        }

        // Ejercicio 1
        public static void fizzBuzz() {
            System.out.println("Ejercicio 1: FizzBuzz");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // Ejercicio 2
        public static void pronosticoBonoloto() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEjercicio 2: Pronóstico Bonoloto");
            System.out.print("Introduce un número: ");
            int userNumber = sc.nextInt();

            Random random = new Random();
            int[] numeros = new int[10];
            int suma = 0;
            int mayor = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            // Generar números aleatorios para probarlos
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = random.nextInt(100) + 1;
                suma += numeros[i];
                if (numeros[i] > mayor) mayor = numeros[i];
                if (numeros[i] < menor) menor = numeros[i];
            }

            // Calcular media de los numeros
            double media = (double) suma / numeros.length;

            // Mostrar resultados
            System.out.println("Números generados: " + Arrays.toString(numeros));
            System.out.println("Número mayor: " + mayor);
            System.out.println("Número menor: " + menor);
            System.out.println("Media: " + media);
            System.out.println("Suma: " + suma);
            System.out.println("¿El número introducido está en la lista? " +
                    (Arrays.stream(numeros).anyMatch(n -> n == userNumber) ? "Sí" : "No");
        }

        // Ejercicio 3
        public static void arrayUnicoRango() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEjercicio 3: Array único y rango");
            System.out.print("¿Cuántos números quieres guardar? ");
            int size = sc.nextInt();

            System.out.print("Introduce el rango mínimo: ");
            int min = sc.nextInt();

            System.out.print("Introduce el rango máximo: ");
            int max = sc.nextInt();

            if (max - min + 1 < size) {
                System.out.println("No es posible generar un array con números únicos en este rango.");
                return;
            }

            Set<Integer> numeros = new HashSet<>();
            Random random = new Random();
            while (numeros.size() < size) {
                int num = random.nextInt(max - min + 1) + min;
                numeros.add(num);
            }

            List<Integer> listaNumeros = new ArrayList<>(numeros);
            Collections.sort(listaNumeros);
            System.out.println("Array ordenado: " + listaNumeros);
        }

        // Ejercicio 4
        public static void generadorPalabras() {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEjercicio 4: Generador de palabras");
            char[] abecedario = "abcdefghijklmnopqrstuvwxyz".toCharArray();

            System.out.print("¿Cuántas palabras quieres generar? ");
            int numPalabras = sc.nextInt();

            System.out.print("¿De cuántas letras quieres las palabras? ");
            int letrasPorPalabra = sc.nextInt();

            Random random = new Random();
            for (int i = 0; i < numPalabras; i++) {
                StringBuilder palabra = new StringBuilder();
                for (int j = 0; j < letrasPorPalabra; j++) {
                    char letra = abecedario[random.nextInt(abecedario.length)];
                    palabra.append(letra);
                }

            }
        }
    }

















