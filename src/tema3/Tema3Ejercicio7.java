package tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primos = 0;
        int noprimos = 0;
        int num = 0;
        int contador = 1;

        System.out.println("Dame un número. Pon '0' para salir.");
        num = in.nextInt();

        while (num != 0) {
            for (int i = 0; contador != num; contador++) {
                if (num % contador == 0) {
                    System.out.println("El número es primo");
                    primos++;
                    num = in.nextInt();
                    if (num == 0) {
                    }
                } else {
                    System.out.println("El número no es primo");
                    noprimos++;
                    num = in.nextInt();
                    if (num == 0) {
                    }
                }
            }
            contador = 1;
        }
    }
}
