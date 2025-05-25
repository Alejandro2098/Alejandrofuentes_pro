package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Trabajador> trabajadores = new ArrayList<>();
    private Jefe jefe; // Solo puede haber un jefe en la empresa

    // Método para agregar un trabajador a la empresa
    public boolean agregarTrabajador(Trabajador t) {
        if (t == null) {
            System.out.println("Error: El trabajador no puede ser nulo.");
            return false;
        }

        // Comprobar si ya existe un trabajador con el mismo DNI
        for (Trabajador trab : trabajadores) {
            if (trab.getDni().equals(t.getDni())) {
                System.out.println("Error: Ya existe un trabajador con este DNI.");
                return false;
            }
        }

        // Si el trabajador es un Jefe, verificar que no haya otro jefe
        if (t instanceof Jefe) {
            if (jefe != null) {
                System.out.println("Error: Solo puede haber un jefe en la empresa.");
                return false;
            }
            jefe = (Jefe) t;
        }

        // Añadir al trabajador a la lista
        trabajadores.add(t);
        return true;
    }

    // Método para listar trabajadores según el tipo
    public void listarTrabajadores(String tipo) {
        if (tipo == null || (!tipo.equals("asalariados") && !tipo.equals("autonomos") && !tipo.equals("todos"))) {
            System.out.println("Error: Tipo de trabajador no válido. Use 'asalariados', 'autonomos' o 'todos'.");
            return;
        }

        for (Trabajador t : trabajadores) {
            // Filtrar según el tipo solicitado
            if ((tipo.equals("asalariados") && t instanceof Asalariado) ||
                    (tipo.equals("autonomos") && t instanceof Autonomo) ||
                    tipo.equals("todos")) {
                t.mostrarInformacion(); // Mostrar información del trabajador
            }
        }
    }
}