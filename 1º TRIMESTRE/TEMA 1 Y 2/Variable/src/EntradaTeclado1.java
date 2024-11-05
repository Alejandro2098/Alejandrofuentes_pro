import java.util.Scanner;

public class EntradaTeclado1 {


        static Scanner lectorTeclado = new Scanner(System.in);


        public static void main(String[] args) {
            String nombre; // null
            System.out.println("por favor introduce tu nonbre");
            // el usuario introduzca el nombre por el teclado
            nombre = lectorTeclado.next(); //se pone next porque es string
            System.out.println("Mi nombre es " + nombre);

            //Mi nombre es (xxx)) tengo xxx  mido xxx y tengo experiencia trabjando xxx
            int edad;
            System.out.println("Por favor introduce tu edad");
            edad=lectorTeclado.nextInt();

            float altura;
            System.out.println("Por favor introduce tu altura");
            altura=lectorTeclado.nextFloat();

            boolean trabajo;
            System.out.println("¿Has trabajado? True o False");
            trabajo=lectorTeclado.nextBoolean();


            System.out.println("Mi nombre es " + nombre + " tengo " + edad + ", mido " + altura + " y tengo experiencia trabajando" + trabajo);
        }

        }
