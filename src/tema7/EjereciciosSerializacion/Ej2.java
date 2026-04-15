package tema7.EjereciciosSerializacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Documents/ficherosSerializacion/usuario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}