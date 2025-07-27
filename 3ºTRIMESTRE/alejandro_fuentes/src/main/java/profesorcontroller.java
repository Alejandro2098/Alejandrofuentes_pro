package controller;

import model.*;
import java.util.ArrayList;

public class ProfesorController {
    private ProfesorDAO dao = new ProfesorDAO();

    public void agregarProfesor(Profesor p) {
        dao.agregarProfesor(p);
    }

    public void mostrarProfesores() {
        ArrayList<Profesor> profesores = dao.obtenerProfesores();
        for (Profesor p : profesores) {
            System.out.printf("%s (%s) - Salario Total: %.2f\n",
                    p.getNombre(), p.getTipo(), p.calcularSalarioTotal());
        }
    }

    public void eliminarProfesor(String dni) {
        dao.eliminarProfesor(dni);
    }
}
