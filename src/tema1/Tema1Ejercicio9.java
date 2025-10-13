package tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Pide un número
        System.out.println("Dame un número:");

        // Lee el numero1
        int numero1 = in.nextInt();

        // Pide otro número
        System.out.println("Dame otro número:");

        // Lee el numero1
        int numero2 = in.nextInt();

        int suma = numero1 + numero2;
        int producto = numero1 * numero2;
        int resta = numero1 - numero2;
        int resto = numero1 % numero2;
        int division = numero1 / numero2;

        System.out.println("La suma es = "+ suma);
        System.out.println("El producto es = "+ producto);
        System.out.println("La resta es = "+ resta);
        System.out.println("El resto es = "+ resto);
        System.out.println("La división es = "+ division);
    }
}
