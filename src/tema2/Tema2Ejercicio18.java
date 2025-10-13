package tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        double n1 = in.nextDouble();

        if (n1 < 0) {
            System.out.println("Has puesto un número negativo.");
        }
        else {
            double raiz = Math.sqrt(n1);
            System.out.println("La raíz cuadrada de " + n1 + " es " + raiz);
        }

    }
}
