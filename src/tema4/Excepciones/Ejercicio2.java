package tema4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int division = 0;
        try {
            System.out.println("Dime el valor 1:");
            int num1 = in.nextInt();
            System.out.println("Dime el valor 2:");
            int num2 = in.nextInt();
            division = num1 / num2;
        } catch (InputMismatchException ex) {
            System.err.println("Error: " + ex.getMessage());
            System.err.println("Valor introducido incorrecto");
        } catch (ArithmeticException ex) {
            System.err.println("Error: " + ex.getMessage());
            System.err.println("No se puede dividir por 0");
        } finally {
            System.out.println(division);
        }
    }
}