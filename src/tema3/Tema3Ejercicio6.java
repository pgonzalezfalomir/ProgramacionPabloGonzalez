package tema3;

import java.util.Scanner;

public class Tema3Ejercicio6 {

    public static void main(String[] args) {
        int contador = 1;
        int numm = 1;
        while (contador <= 10) {
            Tema3Ejercicio5.showTabla(numm);
            contador++;
            System.out.println("\n");
            numm++;
        }
    }
}
