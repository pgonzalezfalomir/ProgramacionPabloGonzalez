package tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la base de un triángulo");
        double base = in.nextDouble();
        System.out.println("Dime la altura de un triángulo");
        double altura = in.nextDouble();

        double superficies = base * altura / 2;
        System.out.println("La superfície de un triángulo es " + superficies);
    }
}
