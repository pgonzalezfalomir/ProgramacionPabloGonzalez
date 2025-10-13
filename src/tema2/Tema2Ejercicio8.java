package tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce cuantos euros quieres pasar a dólares");
        double euro = in.nextDouble();

        double dolar = euro * 1.17;
        System.out.println("Los euros que has introducido en dólares valen " + dolar);
    }
}
