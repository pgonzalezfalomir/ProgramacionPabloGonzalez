package tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Dime un valor entero:");
            int num = in.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("Error: " + ex.getMessage());
            System.err.println("Valor introducido incorrecto");
        }
    }
}