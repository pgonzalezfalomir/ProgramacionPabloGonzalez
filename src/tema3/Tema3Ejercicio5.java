package tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static int showTabla (int num) {
        int numtabla = num;
        if (num < 1 || num > 10) {
            return 1;
        } else {
            for (int contador= 1; contador <= 10; contador++) {
                System.out.println(numtabla + " * " + contador + " = " + numtabla * contador);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número del 1 al 10:");
        int num = in.nextInt();
        showTabla(num);

        }
    }
