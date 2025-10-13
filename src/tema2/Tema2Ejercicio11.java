package tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num1 = in.nextInt();
        System.out.println("Dame otro número");
        int num2 = in.nextInt();
        System.out.println("Dame otro número");
        int nume3 = in.nextInt();

        if ((num1 + 1 == num2 && num2 + 1 == nume3) || (num1 - 1 == num2 && num2 - 1 == nume3)) {
            System.out.println("Los números que has introducido son consecutivos.");
        } else {
            System.out.println("Los números que has introducido no son consecutivos.");
        }
    }
}
