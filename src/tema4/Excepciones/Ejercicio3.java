package tema4.Excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vector = new double[5];

        for (int i = 0; i <= vector.length - 1; i++) {
            try {
                System.out.println("Introduce el valor de la posición " + i + ":");
                vector[i] = in.nextDouble();
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
                System.err.println("Error: Valor incorrecto. Inténtalo de nuevo.");
                in.nextLine();
                i--;
            } finally {
                System.out.println("Array actualizado: " + Arrays.toString(vector));
            }
        }
    }
}