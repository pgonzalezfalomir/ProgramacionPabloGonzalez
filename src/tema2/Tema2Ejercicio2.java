package tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame la base de un rectángulo:");
        double base = in.nextDouble();
        System.out.println("Dame la altura de un rectángulo:");
        double altura = in.nextDouble();

        double superficie = base * altura;
        double perimetro = (base * 2) + (altura * 2);
        System.out.println("La superfície del rectángulo es " + superficie);
        System.out.println("El perímetro del rectángulo es " + perimetro);
    }
}
