package tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {

        int cont = 2;
        boolean esPrimo = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número primo:");
        double num = in.nextDouble();

        if (num <= 1) {
            esPrimo = false;
        } else {
            while (cont < num) {
                if (num % cont == 0) {
                    esPrimo = false;
                    break;
                }
                cont++;
            }
        }

        if (esPrimo) {
            System.out.println(num + " es primo.");
        } else {
            System.out.println(num + " no es primo.");
        }
        }
        }