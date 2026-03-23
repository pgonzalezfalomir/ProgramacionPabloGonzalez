package tema7.EjerciciosFicheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjB3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un fichero para leerlo: ");
        String archivoLectura = in.nextLine();
        System.out.println("Introduce un fichero para escribirlo: ");
        String archivoEscritura = in.nextLine();

        ArrayList<String> lineasArray = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/" + archivoLectura))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasArray.add(linea);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // ordenar alfabeticamente
        Collections.sort(lineasArray);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/pabgonsot/Baixades/Documentos/" + archivoEscritura))) {
            for (int i = 0; i < lineasArray.size(); i++) {
                bw.write(lineasArray.get(i));
                bw.newLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}