package tema7.EjereciciosSerializacion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = in.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = in.nextInt();

        Path archivo = Paths.get("/home/pabgonsot/Documents/ficherosSerializacion/usuario.txt");
        try {
            if (Files.notExists(archivo)) {
                Files.createFile(archivo);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/pabgonsot/Documents/ficherosSerializacion/usuario.txt"))) {
            String linea = "Nombre: " + nombre + ", " + "Edad: " + edad;
            bw.write(linea);
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}