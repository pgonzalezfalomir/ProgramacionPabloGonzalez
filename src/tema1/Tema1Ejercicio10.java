package tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Pide un número
        System.out.println("Dame un número:");

        // Lee el numero1
        int numero1 = in.nextInt();

        if (numero1 > 0) {

        } else
            System.out.println("El " + numero1 + " no es un número real");

        // Pide otro número
        System.out.println("Dame otro número:");

        // Lee el numero1
        int numero2 = in.nextInt();

        if (numero1 > 0) if (numero2 > 0) {
            int suma = numero1 + numero2;
            int producto = numero1 * numero2;
            int resto = numero1 % numero2;
            int división = numero1 / numero2;

            System.out.println("La suma es = "+ suma);
            System.out.println("El producto es = "+ producto);
            System.out.println("El resto es = "+ resto);
            System.out.println("La división es = "+ división);

        } else {

            System.out.println("El "+numero2+ " no es un número real");

    }
}}
