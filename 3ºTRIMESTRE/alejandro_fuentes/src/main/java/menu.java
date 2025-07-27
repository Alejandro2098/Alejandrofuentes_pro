package view;

import controller.ProfesorController;
import model.*;

import java.util.Scanner;

public class Menu {
    private ProfesorController controller = new ProfesorController();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opc;
        do {
            System.out.println("\n1. Agregar profesor");
            System.out.println("2. Mostrar profesores");
            System.out.println("3. Eliminar profesor");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> agregar();
                case 2 -> controller.mostrarProfesores();
                case 3 -> {
                    System.out.print("DNI del profesor a eliminar: ");
                    String dni = sc.nextLine();
                    controller.eliminarProfesor(dni);
                }
            }
        } while (opc != 0);
    }

    private void agregar() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();
        sc.nextLine();

        System.out.print("¿Tipo? (1: Interno, 2: Externo): ");
        int tipo = sc.nextInt();
        sc.nextLine();

        Profesor p = null;

        if (tipo == 1) {
            System.out.print("Complemento mensual: ");
            double complemento = sc.nextDouble();
            sc.nextLine();
            p = new ProfesorInterno(nombre, dni, salarioBase, complemento);
        } else {
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Precio por hora: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            p = new ProfesorExterno(nombre, dni, salarioBase, horas, precio);
        }

        controller.agregarProfesor(p);
    }
}
