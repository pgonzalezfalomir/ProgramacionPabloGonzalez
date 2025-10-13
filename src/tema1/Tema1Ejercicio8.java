package tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
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

        if (numero1 == numero2) {
            System.out.println(numero1 + " y " + numero2 + " son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("El número más grande es " + numero1);
        } else if (numero2 > numero1) {
                System.out.println("El número más grande es "+ numero2);

        }
    }
}
