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

    // paso 4
    public List<Asignatura> listarAsignaturas() {
        List<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT id_asignatura, nombre_asignatura, aula, obligatoria FROM Asignatura";

        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    Asignatura asig = new Asignatura();
                    asig.setIdAsignatura(rs.getInt("id_asignatura"));
                    asig.setNombreAsignatura(rs.getString("nombre_asignatura"));
                    asig.setAula(rs.getString("aula"));
                    asig.setObligatoria(rs.getBoolean("obligatoria"));
                    lista.add(asig);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return lista;
    }

    // paso 5: ejercicio 1
    public static ArrayList<String> mostrarEstudiantesPorCasa(String casa) {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT Estudiante.nombre, Estudiante.apellido FROM Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa WHERE Casa.nombre_casa = '" + casa + "'";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellido");
                    String persona = nombre + " " + apellido;
                    lista.add(persona);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return lista;
    }

    // paso 5: ejercicio 2
    public static ArrayList<String> mostrarMascotaPorEstudiante(String nombre, String apellido) {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT Mascota.nombre_mascota FROM Mascota INNER JOIN Estudiante ON Estudiante.id_estudiante = Mascota.id_estudiante WHERE Estudiante.nombre = '" + nombre + "'" + "AND Estudiante.apellido = '" + apellido + "'";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    String nombreMascota = rs.getString("nombre_mascota");
                    lista.add(nombreMascota);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return lista;
    }

    // paso 5: ejercicio 3
    public static void devolverNumeroEstudiantesPorCasa() {
        String sql = "SELECT COUNT(Estudiante.casa) AS numero_estudiantes FROM Estudiante INNER JOIN Casa ON Casa.id_casa = Estudiante.id_casa GROUP BY Casa.id_casa";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString("nombre_casa"));
                    System.out.println(rs.getInt("numero_estudiantes"));
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // paso 5: ejercicio 4
    public static void insertarNuevaAsignatura() {
        String sql = "INSERT INTO Asignatura (id_asignatura, nombre_asignatura, aula, obligatoria) VALUES (777, 'Filosofía', '6B', false)";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                int resultados = pstmt.executeUpdate();
                if (resultados > 0) {
                    System.out.println("Se ha insertado la nueva asignatura.");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // paso 5: ejercicio 5
    public static void modificarAulaAsignatura(String nombreAula) {
        String sql = "UPDATE Asignatura SET Asignatura.aula = '" + nombreAula + "' WHERE Asignatura.id_asignatura = " + 777;
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                int resultados = pstmt.executeUpdate();
                if (resultados > 0) {
                    System.out.println("Se ha actualizado la asignatura.");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    // paso 6: ejercicio 5
    public static void eliminarAsignatura() {
        String sql = "DELETE FROM Asignatura WHERE id_asignatura = 777";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            {
                int resultados = pstmt.executeUpdate();
                if (resultados > 0) {
                    System.out.println("Asignatura eliminada.");
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}