

import javax.lang.model.element.ModuleElement;
import java.awt.datatransfer.SystemFlavorMap;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicios{


    static Scanner escribirTeclado = new Scanner(System.in);


    public static void main(String[] args) {

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
       //ejercicio8();
         ejercicio9();

    }

    public static void ejercicio1() {
        Scanner lectorTeclado = new Scanner(System.in);
        final String NOMBRE = "Luis González";
        final String DIRECCION = "C/ Maria de Molina";
        final int PORTAL = 51;
        final int PISO = 1;
        final char LETRA = 'a';
        final int CODIGO = 91023;
        final String PROVINCIA = "madrid";
        final String POBLACION = "madrid";
        final String PAIS = "españa";

        System.out.println(NOMBRE);
        System.out.printf("%s n %d %d%c\n", DIRECCION, PORTAL, PISO, LETRA);
        System.out.printf("%d,%s %s\n", CODIGO, POBLACION, PROVINCIA);
        System.out.println(PAIS);
    }

    public static void ejercicio2() {

        String nombreCompleto;
        System.out.println("introduce tu nombre");
        nombreCompleto = escribirTeclado.nextLine();
        int edad;
        System.out.println("escribre tu edad");
        edad = escribirTeclado.nextInt();
        System.out.println("te llamas " + nombreCompleto);
        System.out.println("tienes " + edad);

    }

    public static void ejercicio3() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("dime un numero");
        int numero1 = escribirTeclado.nextInt();
        System.out.println("dime otro numero");
        int numero2 = escribirTeclado.nextInt();
        System.out.println("El numero 1 es " + numero1 + " y el numero 2 es 2" + numero2);
        int suma = numero1 + numero2;
        System.out.println("SUMA " + suma);
        int resta = numero1 - numero2;
        System.out.println("RESTA " + resta);
        int multiplicacion = numero1 * numero2;
        System.out.println("MULTIPLICACION " + multiplicacion);
        int divisionEntera = numero1 / numero2;
        System.out.println("DIVISIONENTERA " + divisionEntera);
        int resto = numero1 % numero2;
        System.out.println("RESTO " + resto);
        float divisionReal = (float) numero1 / numero2;
        System.out.println("DIVISIONREAL " + divisionReal);
        double restoReal = (double) numero1 % numero2;
        System.out.println("RESTO " + resto);

    }

    public static void ejercicio4() {

        Scanner lectorTeclado = new Scanner(System.in);
        final float BEBIDAS = 1.25F;
        final float BOCADILLOS = 2.05F;
        System.out.println("¿Cuantas bebidas quereis?");
        int bebidasRespuesta = escribirTeclado.nextInt();
        System.out.println("¿Cuantas bocadillos quereis?");
        int bocadillosRespuesta = escribirTeclado.nextInt();
        float costeBebidas = bebidasRespuesta * BEBIDAS;
        System.out.println("COSTE DE LAS BEBIDAS " + costeBebidas);
        float costeBocadillos = bocadillosRespuesta * BOCADILLOS;
        System.out.println("COSTE DE LOS BOCADILLOS " + costeBocadillos);
        float costeTotal = costeBebidas + costeBocadillos;
        System.out.println("COSTE TOTAL" + costeTotal);

    }


    public static void ejercicio5() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Por favor dime cuantos segundos quieres pasar");
        int segundosTotales = lectorTeclado.nextInt();
        int horas = segundosTotales / 3600;
        segundosTotales = segundosTotales % 3600;
        int minutos = segundosTotales / 60;
        //System.out.printl("segundos restantes :+ segundosTotales);
        segundosTotales = segundosTotales % 60;
        System.out.println("horas:" + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundosTotales);
    }


    public static void ejercicio6() {
        Scanner lectorTeclado = new Scanner(System.in);
        double valor_compra;
        System.out.println("Valor de la compra(entre 0.00 y 500.00): ");
        valor_compra = lectorTeclado.nextFloat();

        double iva;
        System.out.println("IVA(entre 0 y 25%): ");
        iva = lectorTeclado.nextInt();

        double compra = valor_compra - (valor_compra * iva / 100);
        double iva_resto = valor_compra - compra;

        System.out.printf("Compra: %.2f\n", compra);
        System.out.printf("IVA: %.2f\n", iva_resto);
        System.out.println("======");
        System.out.printf("%.2f", valor_compra);

    }

    public static void ejercicio7() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Escribe un radio entero: ");
        int radio = lectorTeclado.nextInt();
        //double longitud = valor * (Math.PI * 2);
        double longitud = 2 * Math.PI * radio;
        System.out.println("Longitud de la circunferencia: " + longitud);
        //double area = Math.PI * valor * 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area de circulo: " + area);
    }


    public static void ejercicio8() {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Escribe los grados centigrados");
        float c = lectorTeclado.nextFloat();
        float f = ((9 * c) / 5) + 32;
        float k = c + 273.15F;
        System.out.printf("Earenheit: %.2f Kelvin: %.2f\n", f, k);
        System.out.println("Escribe los grados Farenheit");
        f = lectorTeclado.nextFloat();
        c = (5 * (f - 32)) / 9;
        k = c + 273.15F;
        System.out.printf("Centigrados: %.2f Kelvin: %.2f\n", c, k);
        System.out.println("Escribe los grados Kelvin");
        k = lectorTeclado.nextFloat();
        c = k - 273.15F;
        f = ((9 * c) / 5) + 32;
        System.out.printf("Centigrados: %.2f Farenheit: %.2f", c, f);


    }

    public static void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos bocadillos quieres");
        double cantidadBocadillos= scanner.nextInt();
        System.out.println("Cuantas bebidas quieres");
        double cantidadBebidas= scanner.nextInt();
       final double PRECIO_BOCATA=2.5
        final double PRECIO_BEBIDA = 1.25;
        System.out.println("Dime cuantos sois");
        int numerosComensales = scanner.nextInt();
        double total = PRECIO_BEBIDA*cantidadBebidas + PRECIO_BOCATA*cantidadBocadillos;
        double precioUsuarios= total/numerosComensales;
        System.out.printf("ARTICULO \t\t\t\");
    }





















}



















