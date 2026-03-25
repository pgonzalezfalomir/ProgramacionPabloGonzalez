package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class EjB7 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\pablo\\Documents\\Documentos\\Documentos\\Libros\\lazarillo.txt";
        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;

        Hashtable<String, Integer> contadorPalabras = new Hashtable<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numCaracteres += linea.length();

                String lineaLimpia = linea.toLowerCase().replaceAll("[^a-záéíóúüñ\\s]", "");
                String[] palabras = lineaLimpia.split("\\s+");

                for (String p : palabras) {
                    if (!p.isEmpty()) {
                        numPalabras++;
                        contadorPalabras.put(p, contadorPalabras.getOrDefault(p, 0) + 1);
                    }
                }
            }

            System.out.println("Estadísticas:");
            System.out.println("Líneas: " + numLineas);
            System.out.println("Palabras: " + numPalabras);
            System.out.println("Caracteres: " + numCaracteres);

            mostrarTop10(contadorPalabras);

        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void mostrarTop10(Hashtable<String, Integer> tabla) {
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(tabla.entrySet());
        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\n10 palabras más comunes");
        for (int i = 0; i < Math.min(10, lista.size()); i++) {
            Map.Entry<String, Integer> entrada = lista.get(i);
            System.out.println((i + 1) + ". " + entrada.getKey() + ": " + entrada.getValue() + " veces");
        }
    }
}