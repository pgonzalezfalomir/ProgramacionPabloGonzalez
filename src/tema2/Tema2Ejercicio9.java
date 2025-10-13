package tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce cuantos dólares quieres pasar a euros");
        double dolar = in.nextDouble();

        double euro = dolar * 0.86;
        System.out.println("Los dólares que has introducido en euros valen " + euro);
    }
}
