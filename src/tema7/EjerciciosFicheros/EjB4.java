package tema7.EjerciciosFicheros;

import tema6.A;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EjB4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuántos nombres de personas quieres generar?");
        int totalPersonas = in.nextInt();
        in.nextLine();
        System.out.println("¿A qué archivo quieres añadir estas personas?");
        String archivoFinal = in.nextLine();

        ArrayList<String> nombresPersonas = new ArrayList<>();
        ArrayList<String> apellidosPersonas = new ArrayList<>();

        // nombres
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/usa_nombres.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                nombresPersonas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // apellidos
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/usa_apellidos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                apellidosPersonas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/pabgonsot/Baixades/Documentos/" + archivoFinal))) {
            for (int i = 0; i < totalPersonas; i++) {
                String randomNombre = nombresPersonas.get(random.nextInt(nombresPersonas.size()));
                String randomApellido = apellidosPersonas.get(random.nextInt(apellidosPersonas.size()));
                String nombreCompletoRandom = randomNombre + " " + randomApellido;

                bw.write(nombreCompletoRandom);
                bw.newLine();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}