package tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {

    public static void triangulo(char caracter, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            // Espacios a la izquierda
            for (int j = 1; j <= lineas - i; j++) {
                System.out.print(" ");
            }
            // Caracteres del triángulo (2*i - 1 para hacerlo pirámide)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame el carácter:");
        char caracter = in.next().charAt(0);
        System.out.println("Dame el número de líneas del triángulo:");
        int lineas = in.nextInt();

        triangulo(caracter, lineas);
    }
}
