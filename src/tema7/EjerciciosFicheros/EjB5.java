package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjB5 {
    public static void main(String[] args) {
        Path archivoDiccionario = Paths.get("/home/pabgonsot/Baixades/Documentos/diccionario.txt");
        Path carpetaDestino = Paths.get("/home/pabgonsot/Baixades/Documentos/Diccionario");

        try {
            if (Files.notExists(carpetaDestino)) {
                Files.createDirectories(carpetaDestino);
                System.out.println("Carpeta 'Diccionario' creada.");
            }

            try (BufferedReader br = Files.newBufferedReader(archivoDiccionario)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String palabra = linea.trim();

                    if (!palabra.isEmpty()) {
                        char primeraLetra = Character.toUpperCase(palabra.charAt(0));

                        if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
                            escribirPalabraEnSuArchivo(carpetaDestino, primeraLetra, palabra);
                        }
                    }
                }
            }
        } catch (IOException ioe) {
            System.err.println("Hubo un error con los archivos: " + ioe.getMessage());
        }
    }

    private static void escribirPalabraEnSuArchivo(Path carpeta, char letra, String palabra) throws IOException {
        Path archivoLetra = carpeta.resolve(letra + ".txt");

        try (BufferedWriter bw = Files.newBufferedWriter(archivoLetra,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            bw.write(palabra);
            bw.newLine();
        }
    }
}