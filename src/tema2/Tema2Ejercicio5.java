package tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double num1 = in.nextDouble();
        System.out.println("Dame otro número");
        double num2 = in.nextDouble();
        System.out.println("Dame otro número");
        double num3 = in.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        int media2 = (int) (num1 + num2 + num3) / 3;
        System.out.println("La media de los 3 números con decimales es " + media);
        System.out.println("La media de los 3 números sin decimales es " + media2);
    }
}
