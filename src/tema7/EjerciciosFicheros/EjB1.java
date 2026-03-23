package tema7.EjerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjB1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/pabgonsot/Baixades/Documentos/numeros.txt"))) {
            String linea = "";
            int lineaMasCorta = 999999;
            int lineaMasLarga = 0;
            while ((linea = br.readLine()) != null) {
                if (Integer.parseInt(linea) > lineaMasLarga) {
                    lineaMasLarga = Integer.parseInt(linea);
                } if (Integer.parseInt(linea) < lineaMasCorta) {
                    lineaMasCorta = Integer.parseInt(linea);
                }
            }
            System.out.println("El valor máximo es: " + lineaMasLarga);
            System.out.println("El valor mínimo es: " + lineaMasCorta);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}