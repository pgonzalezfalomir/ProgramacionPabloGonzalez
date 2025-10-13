package tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double numero = in.nextDouble();

        if (numero == 0) {
            System.out.println("El numero que me has dado es 0");
        } if (numero > 0) {
            System.out.println("El número que me has dado es positivo.");
        } if (numero < 0) {
            System.out.println("El número que me has dado es negativo.");
        }
    }
}
