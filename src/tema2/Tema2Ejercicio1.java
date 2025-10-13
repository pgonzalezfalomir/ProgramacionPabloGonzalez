package tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado");
        double lados = in.nextDouble();

        double superficie = lados * lados;
        double perimetro = lados + lados + lados + lados;
        System.out.println("La superfície del cuadrado es = " + superficie);
        System.out.println("El perímetro del cuadrado es = " + perimetro);
    }
}
