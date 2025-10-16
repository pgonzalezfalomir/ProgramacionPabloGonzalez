package tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {

        int contador = 0;
        int sumatorio = 0;
        double media = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = in.nextInt();

        while (num >= 0) {
            sumatorio = sumatorio + num;
            contador++;
            media = (double) sumatorio / contador;
            System.out.println("Dame otro número");
            num = in.nextInt();
        }
        System.out.println("La media de los números positivos que has introducido es " + media);
    }
}