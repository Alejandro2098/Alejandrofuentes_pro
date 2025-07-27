package model;

import java.sql.*;
import java.util.ArrayList;

public class ProfesorDAO {
    private Connection conexion;

    public ProfesorDAO() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/centro_formacion", "usuario", "contraseña");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarProfesor(Profesor p) {
        String sql = "INSERT INTO profesores (dni, nombre, salario_base, tipo, complemento_mensual, horas, precio_hora) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, p.getDni());
            stmt.setString(2, p.getNombre());
            stmt.setDouble(3, p.getSalarioBase());
            stmt.setString(4, p.getTipo());

            if (p instanceof ProfesorInterno) {
                stmt.setDouble(5, ((ProfesorInterno) p).getComplementoMensual());
                stmt.setNull(6, Types.INTEGER);
                stmt.setNull(7, Types.DOUBLE);
            } else if (p instanceof ProfesorExterno) {
                stmt.setNull(5, Types.DOUBLE);
                stmt.setInt(6, ((ProfesorExterno) p).getHoras());
                stmt.setDouble(7, ((ProfesorExterno) p).getPrecioHora());
            }

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Profesor> obtenerProfesores() {
        ArrayList<Profesor> lista = new ArrayList<>();
        String sql = "SELECT * FROM profesores";
        try (Statement stmt = conexion.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String tipo = rs.getString("tipo");
                if (tipo.equals("Interno")) {
                    lista.add(new ProfesorInterno(
                            rs.getString("nombre"),
                            rs.getString("dni"),
                            rs.getDouble("salario_base"),
                            rs.getDouble("complemento_mensual")));
                } else {
                    lista.add(new ProfesorExterno(
                            rs.getString("nombre"),
                            rs.getString("dni"),
                            rs.getDouble("salario_base"),
                            rs.getInt("horas"),
                            rs.getDouble("precio_hora")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void eliminarProfesor(String dni) {
        String sql = "DELETE FROM profesores WHERE dni = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, dni);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
