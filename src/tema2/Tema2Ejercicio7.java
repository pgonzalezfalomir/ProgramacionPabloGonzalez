package tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double num1 = in.nextDouble();
        System.out.println("Dame otro número");
        double nume2 = in.nextDouble();

        if (num1 > nume2) {
            double resta = num1 - nume2;
            System.out.println("La resta es " + resta);
        } if (nume2 > num1) {
            double resta = nume2 - num1;
            System.out.println("La resta es " + resta);
        }
    }
}
