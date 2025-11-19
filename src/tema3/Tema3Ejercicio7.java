package tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    // Función para comprobar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerooo = -1; // Inicializamos con un valor distinto de 0

        System.out.println("Introduce números enteros positivos (0 para terminar):");

        while (numerooo != 0) {
            System.out.print("Número: ");
            numerooo = in.nextInt();

            if (numerooo > 0) {
                if (esPrimo(numerooo)) {
                    System.out.println(numerooo + " es primo.");
                } else {
                    System.out.println(numerooo + " no es primo.");
                }
            } else if (numerooo < 0) {
                System.out.println("Por favor, introduce solo números positivos.");
            }
            // Si el número es 0, el bucle terminará automáticamente
        }

        System.out.println("Programa terminado.");
        in.close();
    }
}
