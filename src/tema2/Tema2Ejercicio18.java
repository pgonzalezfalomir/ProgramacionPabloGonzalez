package tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num = in.nextDouble();

        if (num < 0) {
            System.out.println("Has puesto un número negativo.");
        }
        else {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es " + raiz);
        }

    }
}
