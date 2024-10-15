
import java.util.Scanner;

public class tema3 {

    Scanner Scanner= new Scanner(System.in);

    public class DiaDeLaSemana{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número del 1 al 7: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Número inválido. Debes ingresar un número del 1 al 7.");
                    break;
            }

            scanner.close();
        }

        public class VocalOConsonante {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un carácter: ");
                char caracter = scanner.next().charAt(0);

                switch (Character.toLowerCase(caracter)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("El carácter ingresado es una vocal.");
                        break;
                    default:
                        if (Character.isLetter(caracter)) {
                            System.out.println("El carácter ingresado es una consonante.");
                        } else {
                            System.out.println("El carácter ingresado no es una letra.");
                        }
                        break;
                }

                scanner.close();
            }
        }}




    public class ParOImpar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            switch (numero % 2) {
                case 0:
                    System.out.println("El número es par.");
                    break;
                case 1:
                    System.out.println("El número es impar.");
                    break;
                default:
                    System.out.println("Error inesperado.");
                    break;
            }

            scanner.close();
        }
    }


    public class DiasDelMes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un mes (1-12): ");
            int mes = scanner.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Enero tiene 31 días.");
                    break;
                case 2:
                    System.out.println("Febrero tiene 28 días (29 en año bisiesto).");
                    break;
                case 3:
                    System.out.println("Marzo tiene 31 días.");
                    break;
                case 4:
                    System.out.println("Abril tiene 30 días.");
                    break;
                case 5:
                    System.out.println("Mayo tiene 31 días.");
                    break;
                case 6:
                    System.out.println("Junio tiene 30 días.");
                    break;
                case 7:
                    System.out.println("Julio tiene 31 días.");
                    break;
                case 8:
                    System.out.println("Agosto tiene 31 días.");
                    break;
                case 9:
                    System.out.println("Septiembre tiene 30 días.");
                    break;
                case 10:
                    System.out.println("Octubre tiene 31 días.");
                    break;
                case 11:
                    System.out.println("Noviembre tiene 30 días.");
                    break;
                case 12:
                    System.out.println("Diciembre tiene 31 días.");
                    break;
                default:
                    System.out.println("Número de mes inválido. Debes ingresar un número del 1 al 12.");
                    break;
            }

            scanner.close();
        }
    }


    public class SeleccionarOpcion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número del 1 al 4: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Opción 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opción 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opción 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opción 4 seleccionada");
                    break;
                default:
                    System.out.println("Número inválido. Debes ingresar un número del 1 al 4.");
                    break;
            }

            scanner.close();
        }
    }
public class Calificaiones {
        public static void main(String [] args) {
           Scanner scanner  = new Scanner (System.in);
            System.out.println("muestrame not");
            int nota= scanner.nextInt();

            switch (nota){
               case 1;

        }
}



}

