package tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = in.nextInt();
        System.out.println("Introduce otro número");
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es " + num1);
        } else {
            if (num1 % 2 == 0)
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            else if (num1 % 2 == 1) {
                for (int i = num1; i <= num2; i = i + 2) {
                    System.out.println(i);
                }


            }
        }
    }
}