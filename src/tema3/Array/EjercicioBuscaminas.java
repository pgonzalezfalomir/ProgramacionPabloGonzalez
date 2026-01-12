package tema3.Array;

import java.util.Scanner;

public class EjercicioBuscaminas {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] tablero = new String[20];
        String[] visible = new String[20];

        for (int i = 0; i < 20; i++) {
            visible[i] = "*";
        }

        int minasColocadas = 0;
        while (minasColocadas < 6) {
            int pos = (int)(Math.random() * 20);
            if (tablero[pos] == null) {
                tablero[pos] = "*";
                minasColocadas++;
            }
        }

        for (int i = 0; i < 20; i++) {
            if (tablero[i] == null) {
                int minas = 0;

                if (i > 0 && "*".equals(tablero[i - 1])) minas++;

                if (i < 19 && "*".equals(tablero[i + 1])) minas++;

                tablero[i] = String.valueOf(minas);
            }
        }

        boolean juegoTerminado = false;

        while (!juegoTerminado) {

            System.out.println("\nTablero:");
            for (int i = 0; i < 20; i++) {
                System.out.print((i+1) + ":" + visible[i] + "  ");
            }
            System.out.println();

            System.out.print("Elige una posición (1-20): ");
            int pos = in.nextInt() - 1;

            if (pos < 0 || pos >= 20) {
                System.out.println("Posición inválida.");
                continue;
            }

            if (tablero[pos].equals("*")) {
                System.out.println("Has pisado una mina.");
                System.out.println("Has perdido.");
                juegoTerminado = true;
                continue;
            }

            visible[pos] = tablero[pos];

            boolean gana = true;
            for (int i = 0; i < 20; i++) {
                if (!tablero[i].equals("*") && visible[i].equals("*")) {
                    gana = false;
                    break;
                }
            }

            if (gana) {
                System.out.println("\n¡HAS GANADO! No has pisado ninguna mina.");
                juegoTerminado = true;
            }
        }

        System.out.println("\nTablero final:");
        for (int i = 0; i < 20; i++) {
            System.out.print(tablero[i] + " ");
        }
    }
}
