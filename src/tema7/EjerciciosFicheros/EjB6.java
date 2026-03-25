package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjB6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número de cualquier longitud:");
        String numero = in.nextLine();

        boolean encontrado = false;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pablo\\Documents\\Documentos\\Documentos\\pi-million.txt"))) {
            String linea;
            String resto = "";

            while ((linea = br.readLine()) != null) {
                linea = resto + linea;

                for (int i = 0; i <= linea.length() - numero.length(); i++) {
                    boolean coincidencia = true;

                    for (int j = 0; j < numero.length(); j++) {
                        if (linea.charAt(i + j) != numero.charAt(j)) {
                            coincidencia = false;
                            break;
                        }
                    }

                    if (coincidencia) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) break;

                if (linea.length() >= numero.length() - 1) {
                    resto = linea.substring(linea.length() - (numero.length() - 1));
                }
            }

            if (encontrado) {
                System.out.println("Encontrado");
            } else {
                System.out.println("No se ha encontrado");
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}