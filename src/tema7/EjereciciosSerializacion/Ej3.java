package tema7.EjereciciosSerializacion;

import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Documents/ficherosSerializacion/texto.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String [] partes = linea.split(" ");
                if (!linea.isEmpty()) {
                    contador = contador + partes.length;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Número de palabras final: " + contador);
    }
}