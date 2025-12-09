package tema3.Array;

import java.util.Scanner;

public class EjercicioParejas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] parejas;
        parejas = new String[] {"leon", "leon", "mandril", "mandril", "suricata", "suricata", "facóquero", "facóquero", "lobo", "lobo", "rana", "rana", "tortuga", "tortuga", "buho", "buho", "zorro", "zorro", "pinguino", "pinguino"};

        String [] visible;
        visible = new String[] {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"};

        boolean terminado = false;

        while (!terminado) {
            System.out.println("\nEstado actual:");
            for (int i = 0; i < visible.length; i++) {
                System.out.println((i+1) + ": " + visible[i] + " ");
            }
            System.out.println();

            System.out.println("Introduce la posición de la pareja que quieres elegir: (1-20)");
            int posicion = in.nextInt() - 1;

            if (posicion < 0 || posicion > 19) {
                System.out.println("Esa posición no es válida.");
            }

            System.out.println("Elige la posición de la pareja que quieres elegir: (1-20)");
            int posicion2 = in.nextInt() - 1;

            if (posicion2 < 0 || posicion2 > 19) {
                System.out.println("Esa posición no es válida.");
            }

            System.out.println("Has destapado:");
            System.out.println("Posición " + (posicion + 1) + ": " + parejas[posicion]);
            System.out.println("Posición " + (posicion2 + 1) + ": " + parejas[posicion2]);

            if (parejas[posicion] == parejas[posicion2]) {
                System.out.println("Pareja encontrada");
                visible[posicion] = parejas[posicion];
                visible[posicion2] = parejas[posicion2];
            } else {
                System.out.println("No son pareja.");
                System.out.println("Pulsa Enter para seguir:");
                in.nextLine();
                in.nextLine();

                for (int i = 0; i < 30; i++) {
                    System.out.println();
                }
            }

            terminado = true;
            for (String s : visible) {
                if (s == "*") {
                    terminado = false;
                }
            }

            System.out.println("Has encontrado todas las parejas");
        }
    }
}
