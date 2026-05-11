package tema8.AADD1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PilotsCRUD {
    static String endpoint = "ad-postgres.czvemab3mwkb.us-east-1.rds.amazonaws.com";
    static String puerto = "5432";
    static String bd = "hogwarts";
    static String usuario = "postgres";
    static String password = "12345678";
    static String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;

    // case 1
    public static void createPilot (Piloto piloto) {
        String sql = "INSERT INTO drivers (driverid, code, forename, surname, dob, nationality, url) VALUES (" + piloto.getDriverID() + ", " + piloto.getCode() + ", " + piloto.getForename() + ", " + piloto.getSurname() + ", " + piloto.getDob() + ", " + piloto.getNationality() + ", " + piloto.getUrl() + ")";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int filaNueva = pstmt.executeUpdate();

            if (filaNueva > 0) {
                System.out.println("Piloto insertado correctamente.");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    // case 2
    public static void readPilot (int driverid) {
        String sql = "SELECT * FROM drivers WHERE driverid = " + driverid;
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Piloto piloto = new Piloto();
                piloto.setDriverID(rs.getInt("driverid"));
                piloto.setCode(rs.getString("code"));
                piloto.setForename(rs.getString("forename"));
                piloto.setSurname(rs.getString("surname"));
                piloto.setDob(rs.getString("dob"));
                piloto.setNationality(rs.getString("nationality"));
                piloto.setUrl(rs.getString("url"));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    // case 3
    public List<Piloto> readPilots () {
        List<Piloto> pilotos = new ArrayList<>();
        String sql = "SELECT * FROM drivers";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Piloto piloto = new Piloto();
                piloto.setDriverID(rs.getInt("driverid"));
                piloto.setCode(rs.getString("code"));
                piloto.setForename(rs.getString("forename"));
                piloto.setSurname(rs.getString("surname"));
                piloto.setDob(rs.getString("dob"));
                piloto.setNationality(rs.getString("nationality"));
                piloto.setUrl(rs.getString("url"));
                pilotos.add(piloto);
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return pilotos;
    }

    // case 4
    public static void updatePilot (Piloto piloto) {
        String sql = "UPDATE drivers SET driverid = " + piloto.getDriverID() + ", code = '" + piloto.getCode() + "', forename = '" + piloto.getForename() + "', surname = '" + piloto.getSurname() + "', dob = '" + piloto.getDob() + "', nationality = '" + piloto.getNationality() + "', url = '" + piloto.getUrl() + "' " + "WHERE driverid = " + piloto.getDriverID();
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int filaActualizada = pstmt.executeUpdate();

            if (filaActualizada > 0) {
                System.out.println("Piloto actualizado.");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    // case 5
    public static void deletePilot (Piloto piloto) {
        String sql = "DELETE FROM drivers WHERE driverid = '" + piloto.getDriverID();
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            int filaEliminada = pstmt.executeUpdate();

            if (filaEliminada > 0) {
                System.out.println("Piloto eliminado.");
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    // case 6
    public static void showPilotClassification () {
        String sql = "SELECT drivers.forename, drivers.surname, SUM(results.points) AS total_puntos FROM drivers INNER JOIN drivers ON results.driverid = drivers.driver_id GROUP BY drivers.driver_id ORDER BY total_puntos DESC";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("forename"));
                System.out.println("Apellido: " + rs.getString("surname"));
                System.out.println("Total de puntos: " + rs.getInt("total_puntos"));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    // case 7
    public static void showBuildersClassification () {
        String sql = "SELECT constructors.name, SUM(results.points) AS total_puntos FROM results INNER JOIN results ON results.driverid = drivers.driverid INNER JOIN constructors ON constructors.constructorid = drivers.constructorid GROUP BY constructors.name ORDER BY total_puntos DESC";
        try (Connection conn = DriverManager.getConnection(url, usuario, password)) {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Equipo: " + rs.getString("name"));
                System.out.println("Total de puntos: " + rs.getString("total_puntos"));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
