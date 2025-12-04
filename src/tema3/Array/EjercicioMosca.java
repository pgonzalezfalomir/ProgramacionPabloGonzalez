package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class EjercicioMosca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arrayMosca;
        arrayMosca = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random random = new Random();
        int posicionMosca = random.nextInt(arrayMosca.length);

        System.out.println("Dame una posicion entre 1 y 15:");
        int posicion = in.nextInt();

        if (posicion < 1 || posicion > 15) {
            System.out.println("Posición inválida");
        } else {
            while (!comprobarMosca(posicion, posicionMosca)) {
                if (posicion + 1 == posicionMosca || posicion - 1 == posicionMosca) {
                    System.out.println("La mosca esta cerca, se ha movido");
                    posicionMosca = random.nextInt(arrayMosca.length);
                    System.out.println("Dame una posición entre 1 y 15:");
                    posicion = in.nextInt();
                } else {
                    System.out.println("Has fallado");
                    System.out.println("Dame una posición entre 1 y 15:");
                    posicion = in.nextInt();
                }
            }
            System.out.println("Has acertado");
        }


    }

    public static boolean comprobarMosca (int posicion, int posicionMosca) {
        if (posicion != posicionMosca) {
            return false;
        }
        return true;
    }
}
