package tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double numeros = in.nextDouble();

        if (numeros == 0) {
            System.out.println("El numero que me has dado es 0");
        } if (numeros > 0) {
            System.out.println("El número que me has dado es positivo.");
        } if (numeros < 0) {
            System.out.println("El número que me has dado es negativo.");
        }
    }
}
