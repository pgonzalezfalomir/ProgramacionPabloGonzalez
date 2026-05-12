package tema8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
    static String endpoint = "ad-postgres.czvemab3mwkb.us-east-1.rds.amazonaws.com";
    static String puerto = "5432";
    static String bd = "hogwarts";
    static String usuario = "postgres";
    static String password = "12345678";
    static String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;

    // PASO 4: Listar asignaturas
    public static List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT id_asignatura, nombre_asignatura, aula, obligatoria FROM Asignatura";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Asignatura asig = new Asignatura();
                asig.setIdAsignatura(rs.getInt("id_asignatura"));
                asig.setNombreAsignatura(rs.getString("nombre_asignatura"));
                asig.setAula(rs.getString("aula"));
                asig.setObligatoria(rs.getBoolean("obligatoria"));
                lista.add(asig);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    // PASO 5.1: Estudiantes por casa
    public static void mostrarEstudiantesPorCasa(String casa) {
        String sql = "SELECT Estudiante.nombre, Estudiante.apellido FROM Estudiante " +
                "INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa " +
                "WHERE Casa.nombre_casa = '" + casa + "'";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // PASO 5.2: Mascota por estudiante
    public static void mostrarMascotaPorEstudiante(String nombre, String apellido) {
        String sql = "SELECT Mascota.nombre_mascota FROM Mascota " +
                "INNER JOIN Estudiante ON Estudiante.id_estudiante = Mascota.id_estudiante " +
                "WHERE Estudiante.nombre = '" + nombre + "' AND Estudiante.apellido = '" + apellido + "'";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Mascota: " + rs.getString("nombre_mascota"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // PASO 5.3: Número de estudiantes por casa
    public static void devolverNumeroEstudiantesPorCasa() {
        String sql = "SELECT Casa.nombre_casa, COUNT(Estudiante.id_estudiante) AS total " +
                "FROM Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa " +
                "GROUP BY Casa.nombre_casa";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Casa: " + rs.getString("nombre_casa"));
                System.out.println("Cantidad: " + rs.getInt("total"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // PASO 5.4: Insertar asignatura
    public static void insertarNuevaAsignatura() {
        String sql = "INSERT INTO Asignatura (id_asignatura, nombre_asignatura, aula, obligatoria) " +
                "VALUES (777, 'Filosofía', '6B', false)";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            int filas = stmt.executeUpdate(sql);
            if (filas > 0) {
                System.out.println("Se ha insertado la nueva asignatura.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar: " + ex.getMessage());
        }
    }

    // PASO 5.5: Modificar aula
    public static void modificarAulaAsignatura(String nombreAula) {
        String sql = "UPDATE Asignatura SET aula = '" + nombreAula + "' WHERE id_asignatura = 777";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            int filas = stmt.executeUpdate(sql);
            if (filas > 0) {
                System.out.println("Se ha actualizado la asignatura.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // PASO 6: Eliminar
    public static void eliminarAsignatura() {
        String sql = "DELETE FROM Asignatura WHERE id_asignatura = 777";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            Statement stmt = conn.createStatement();
            int filas = stmt.executeUpdate(sql);
            if (filas > 0) {
                System.out.println("Asignatura eliminada.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}