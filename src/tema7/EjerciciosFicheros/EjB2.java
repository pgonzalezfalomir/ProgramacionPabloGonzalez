package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class EjB2 {
    public static void main(String[] args) {
        int numAlumnos = 0;
        String [] nombres = new String[20];
        double [] medias = new double[20];
        int numLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/alumnos_notas.txt"))) {
            String datos;

            while ((datos = br.readLine()) != null) {
                String [] partes = datos.split(" ");
                String nombre = partes[0];
                String apellido = partes[1];

                double suma = 0;
                int contador = 0;

                for (int i = 2; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                    contador++;
                }

                if (contador > 0) {
                    nombres[numAlumnos] = nombre + " " + apellido;
                    medias[numAlumnos] = suma / contador;
                    numAlumnos++;
                }
            }
            } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}