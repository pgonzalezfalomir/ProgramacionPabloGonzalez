package tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número");
        int numero = in.nextInt();
        int comprobacion = 1;


        while (numero / 10 >= 1 ) {
            numero = numero / 10;
            comprobacion = comprobacion + 1;
        }
        System.out.println("Tu número tiene " + comprobacion + " cifras");

    }
}
