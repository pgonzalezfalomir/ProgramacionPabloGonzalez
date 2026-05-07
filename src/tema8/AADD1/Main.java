package tema8.AADD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String endpoint = "ad-postgres.czvemab3mwkb.us-east-1.rds.amazonaws.com";
        String puerto = "5432";
        String bd = "f12006";
        String usuario = "postgres";
        String password = "12345678";

        String url = "jdbc:postgresql://" + endpoint + ":" + puerto + "/" + bd;
        try (Connection con1 = DriverManager.getConnection(url, usuario, password)) {
            System.out.println("Conexión");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}