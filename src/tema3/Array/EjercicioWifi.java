package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class EjercicioWifi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] cobertura;
        cobertura = new int[20];

        System.out.println("Dime un número de habitación para instalar el router (1-20):");
        int habitacion = in.nextInt();

        if (habitacion < 1 || habitacion > 20) {
            System.out.println("Hay habitaciones solo del 1 al 20.");
        }

        System.out.println("Dime la potencia de transmisión del router (1-6)");
        int potencia = in.nextInt();

        if (potencia < 1 || potencia > 6) {
            System.out.println("La potencia es entre 1 y 6");
        }

        int posicionRouter = habitacion - 1;
        cobertura[posicionRouter] = potencia;

        int senal = potencia - 1;
        for (int i = posicionRouter - 1; i >= 0 && senal > 0; i--) {
            cobertura[i] = senal;
            senal--;
        }

        senal = potencia + 1;
        for (int i = posicionRouter + 1; i < 20 && senal > 0; i++) {
            cobertura[i] = senal;
            senal--;
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(cobertura[i] + " ");
        }
    }
}
