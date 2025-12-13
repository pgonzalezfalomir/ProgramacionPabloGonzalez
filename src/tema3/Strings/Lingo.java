package tema3.Strings;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palabra = "HUESO";
        int intentosMax = 5;
        int intentos = 0;

        System.out.println("Palabra oculta: " + "-----");

        while (intentos < intentosMax) {
            System.out.print("Try: ");
            String adivina = in.nextLine().toUpperCase();

            if (adivina.length() != 5) {
                System.out.println("Tiene que tener 5 letras.");
                continue;
            }

            String pista = generaPista(palabra, adivina);
            System.out.println("Pista: " + pista);

            if (adivina.equals(palabra)) {
                System.out.println("Has acertado");
                return;
            }

            intentos++;
        }
        System.out.println("Te has quedado sin intentos");
    }

    public static String generaPista(String palabra, String adivina) {
        char[] pista = new char[5];
        boolean[] usado = new boolean[5];

        for (int i = 0; i < 5; i++) {
            if (adivina.charAt(i) == palabra.charAt(i)) {
                pista[i] = '*';
                usado[i] = true;
            } else {
                pista[i] = '-';
            }
        }

        for (int i = 0; i < 5; i++) {
            if (pista[i] == '-') {
                char c = adivina.charAt(i);
                for (int j = 0; j < 5; j++) {
                    if (!usado[j] && palabra.charAt(j) == c) {
                        pista[i] = c;
                        usado[j] = true;
                        break;
                    }
                }
            }
        }

        return new String(pista);
    }
}
