package tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {

    public static int numberSign(int numero) {
        if (numero > 0) {
            return 1;
        } else if (numero == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número:");
        int numero = in.nextInt();
        int resultado = numberSign(numero);

        if (resultado == 1) {
            System.out.println("El número es positivo.");
        } else if (resultado == 0) {
            System.out.println("El número es 0.");
        } else {
            System.out.println("El número es negativo.");
        }
    }
}
