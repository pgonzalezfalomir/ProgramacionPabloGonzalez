package tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {

        int cont = 1;
        int resultado = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = in.nextInt();

        if (num < 0) {
            System.out.println("No puedo calcular el factorial de un número negativo.");
        } else {
            for (int n = 1; n <= num; n++) {
                resultado = resultado * n;
            }
            System.out.println("El factorial de " + num + " es " + resultado);
        }

    }
}