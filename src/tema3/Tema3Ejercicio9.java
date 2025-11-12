package tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {

    public static void triangulo (char caracter, int lineas) {
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
