package tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius (double r) {
        if (r > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double calculateCirclePerimeter (double num1) {
        double perimetro = 2 * 3.14 * num1;
        return perimetro;
    }

    public static double calculateCircleArea (double num1) {
        double area = 3.14 * (num1 * num1);
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame el valor del radio");
        double num1 = in.nextDouble();
        boolean radio = validRadius(num1);
        double a = calculateCircleArea(num1);
        double p = calculateCirclePerimeter(num1);

        if (radio == true) {
            System.out.println("El perímetro es: " + p);
            System.out.println("El área es: " + a);
        }
    }
}
