package tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("Introduce el dinero que tienes");
        double dinero = in.nextDouble();
        System.out.println("Introduce E (si son dólares) o D (si son euros)");
        char letra = in.next().charAt(0);

        if (letra == 'D' || letra == 'd') {
            double resultado = dinero * 1.16;
            System.out.println("El resultado es: " + resultado + "$");
        }
        else if (letra == 'E' || letra == 'e') {
            double resultado = dinero / 1.16;
            System.out.println("El resultado es: " + resultado + "€");
        }
        else {
            System.out.println("Has puesto una letra no válida");
        }
    }
}
