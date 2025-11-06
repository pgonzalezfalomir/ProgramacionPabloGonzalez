package tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double num1 = in.nextDouble();
        if (num1 < 0) {
            System.out.println("Número negativo, no puedo calcular ni la superfície ni el perímetro");
        }

        System.out.println("Dame otro número");
        double num2 = in.nextDouble();
        if (num2 < 0) {
            System.out.println("Número negativo, no puedo calcular ni la superfície ni el perímetro");
        }
    }
}
