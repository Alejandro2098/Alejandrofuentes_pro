import java.util.Scanner;

public class Entrada{

    public static void main(String[] args) {

        //ejercicio1();
        ejercicio2();
    }

    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner1 = new Scanner(System.in);

        // Pedir por teclado un entero y guardarlo en una variable llamada 'a'
        System.out.print("Introduce un número entero: ");
        int a = scanner.nextInt();

        // Comprobar si 'a' es par
        String s;
        if (a % 2 == 0) {
            s = "Es par";
        } else {
            s = "No es par";
        }

        // Mostrar el mensaje por pantalla
        System.out.println(s);

        // Cerrar el objeto Scanner
        scanner.close();
    }


    public static void ejercicio2() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir por teclado un entero y guardarlo en una variable llamada 'a'
        System.out.print("Introduce un número entero: ");
        int a = scanner.nextInt();

        // Comprobar las condiciones y modificar 'a' según corresponda
        if (a % 2 == 0) {
            a += 1; // Incrementar en una unidad si es par
        } else if (a < 10) {
            a -= 1; // Decrementar en una unidad si es menor que 10
        } else if (a < 100) {
            a = (a * 2) + 1; // Duplicar y luego incrementar en una unidad si es menor que 100
        } else {
            a = 0; // Asignar el valor de 0 si no cumple ninguna de las condiciones anteriores
        }

        // Mostrar el valor de 'a' por pantalla
        System.out.println("El valor final de 'a' es: " + a);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}





