package tema3.Strings;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Usuario 1, dime la palabra:");
        String palabra = in.nextLine().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        char [] palabraAdivina = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivina[i] = '_';
        }

        int intentos = 6;

        while (intentos > 0) {
            System.out.println("Palabra: " + new String(palabraAdivina));
            dibujoAhoracado(intentos);

            System.out.println("Dime una letra o 'RESOLVER'");
            String input = in.nextLine().toUpperCase();

            if (input == "RESOLVER") {
                System.out.println("Dime la palabra completa:");
                String intento = in.nextLine().toUpperCase();
                if (intento == palabra) {
                    System.out.println("Has ganado.");
                    return;
                } else {
                    System.out.println("Palabra incorrecta.");
                    intentos--;
                }
            } else if (input.length() == 1) {
                char letra = input.charAt(0);
                boolean esCorrecto = false;
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra && palabraAdivina[i] == '_') {
                        palabraAdivina[i] = letra;
                        esCorrecto = true;
                    }
                }
                if (!esCorrecto) {
                    System.out.println("Letra incorrecta");
                    intentos--;
                }
            } else {
                System.out.println("Entrada inválida");
            }

            if (new String(palabraAdivina) == palabra) {
                System.out.println("Has adivinado la palabra");
                return;
            }
        }

        System.out.println("Has perdido");
    }

    public static void dibujoAhoracado (int intentos) {
        switch (intentos) {
            case 6:
                System.out.println();
                break;
            case 5:
                System.out.println("  O");
                break;
            case 4:
                System.out.println("  O");
                System.out.println("  |");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" /|");
                break;
            case 2:
                System.out.println("  O");
                System.out.println(" /|\\");
                break;
            case 1:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" /");
                break;
            case 0:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
        }
    }
}
