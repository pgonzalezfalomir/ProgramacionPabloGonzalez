package tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la medida del lado de una figura geométrica");
        double a = in.nextDouble();
        System.out.println("Introduce otra medida del lado de una figura geométrica");
        double b = in.nextDouble();

        System.out.println("Introduce 0, 1 o 2");
        int nume = in.nextInt();

        double superficie_cuadrado = a * a;
        double perimetro_cuadrado = a + a + a + a;

        double superficie_rectangulo = a * b;
        double perimetro_rectangulo = 2 * (a+b);

        double superficie_triangulo = a * b / 2;
//swicth
        switch (nume) {
            case 0:
                System.out.println("La superfície y el perímetro de un cuadrado con las medidas que has dado son = " + superficie_cuadrado + ", " + perimetro_cuadrado);
                break;
            case 1:
                System.out.println("La superfície y el perímetro de un rectángulo con las medidas que has dado son = " + superficie_rectangulo + ", " + perimetro_rectangulo);
                break;
            case 2:
                System.out.println("La superfície de un triángulo con las medidas que has dado son = " + superficie_triangulo);
                break;

            }

    }
}