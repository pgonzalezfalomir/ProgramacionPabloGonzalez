package tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = in.nextInt();

        if (numero < 0) {
            System.out.println("No puedo calcular el factorial de un número negativo.");
        }

    }
}
