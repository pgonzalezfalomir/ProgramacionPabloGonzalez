package tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double num1 = in.nextDouble();
        System.out.println("Dame otro número");
        double num2 = in.nextDouble();
        System.out.println("Dame otro número");
        double nume3 = in.nextDouble();

        if (num1 < num2 && num2 < nume3) {
            System.out.println("Los números que has introducido estan ordenados de menor a mayor.");
        } else {
            System.out.println("Los números que has introducido no estan ordenados de menor a mayor.");
        }
    }
}
