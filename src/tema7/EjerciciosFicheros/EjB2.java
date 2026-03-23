package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjB2 {
    public static void main(String[] args) {
        int numAlumnos = 0;
        String[] nombres = new String[20];
        double[] medias = new double[20];

        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/alumnos_notas.txt"))) {
            String datos;

            while ((datos = br.readLine()) != null) {
                String[] partes = datos.split(" ");
                String nombreCompleto = partes[0] + " " + partes[1];

                double suma = 0;
                int contadorNotas = 0;

                for (int i = 2; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                    contadorNotas++;
                }

                if (contadorNotas > 0) {
                    nombres[numAlumnos] = nombreCompleto;
                    medias[numAlumnos] = suma / contadorNotas;
                    numAlumnos++;
                }
            }

            for (int i = 0; i < numAlumnos - 1; i++) {
                for (int j = 0; j < numAlumnos - i - 1; j++) {
                    if (medias[j] < medias[j + 1]) {
                        // intercambiar medias
                        double tempMedia = medias[j];
                        medias[j] = medias[j + 1];
                        medias[j + 1] = tempMedia;

                        // nombres juntos a sus notas
                        String tempNombre = nombres[j];
                        nombres[j] = nombres[j + 1];
                        nombres[j + 1] = tempNombre;
                    }
                }
            }

            System.out.println("Notas medias de los alumnos (Ordenadas):");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.printf("%s: %.2f%n", nombres[i], medias[i]);
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}