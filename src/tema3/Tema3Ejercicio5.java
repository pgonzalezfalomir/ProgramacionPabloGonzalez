package tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static void showTabla (int num) {

            for (int contador= 1; contador <= 10; contador++) {
                System.out.println(num + " * " + contador + " = " + num * contador);
            }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número del 1 al 10:");
        int num = in.nextInt();
        showTabla(num);

        }
    }
