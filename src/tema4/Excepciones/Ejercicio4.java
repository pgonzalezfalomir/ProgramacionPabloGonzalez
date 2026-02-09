package tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random1 = new Random();
        int tamanoArray = random1.nextInt(100) + 1;
        int valoresArray = random1.nextInt(10) + 1;

        int [] array = new int[tamanoArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = valoresArray;
        }

        int eleccion = 0;

        while (eleccion >= 0) {
            try {
                System.out.println("Qué posición del array quieres mirar? Número negativo para salir.");
                eleccion = in.nextInt();
                System.out.println("La posición " + eleccion + " es " + array[eleccion]);
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
                System.err.println("Valor introducido incorrecto");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Error: " + ex.getMessage());
                System.err.println("Posición incorrecta");
            }
        }
    }
}