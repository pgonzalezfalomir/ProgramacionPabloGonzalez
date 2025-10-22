package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Videojuego {
    public static void main(String[] args) {

        // Inicialización de las variables.
        int totalstats = 0;
        int totalstats2 = 0;
        int velocidad = 0;
        int velocidad2 = 0;
        int ataque = 0;
        int ataque2 = 0;
        int defensa = 0;
        int defensa2 = 0;
        int vida = 0;
        int vida2 = 0;
        int a1 = 0;
        int a2 = 0;
        int ronda = 1;

        // Mostrar instrucciones del juego.
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego! Las instrucciones son:");
        System.out.println("1. El total de las estadísticas no puede ser superior a 500");
        System.out.println("2. El valor máximo de una estadística es 200.");

        // Do while para pedir las estadísticas del jugador 1.
        do {
            System.out.println("¡Turno de Player 1!");
            System.out.println("Dame la estadística de velocidad:");
            velocidad = sc.nextInt();

            if (velocidad > 200) {
                velocidad = 200;
                System.out.println("Tu estadística de velocidad será 200.");
            }

            System.out.println("Dame la estadística de ataque:");
            ataque = sc.nextInt();

            if (ataque > 200) {
                ataque = 200;
                System.out.println("Tu estadística de ataque será 200.");
            }

            System.out.println("Dame la estadística de defensa:");
            defensa = sc.nextInt();

            if (defensa > 200) {
                defensa = 200;
                System.out.println("Tu estadística de defensa será 200.");
            }

            System.out.println("Introduce la estadística de puntos de vida:");
            vida = sc.nextInt();

            if (vida > 200) {
                vida = 200;
                System.out.println("Tu estadística de puntos de vida será 200.");
            }
            totalstats = velocidad + ataque + defensa + vida;
        } while (totalstats > 500);

        // Do while para pedir las estadísticas del jugador 2.
        do {
            System.out.println("¡Turno de Player 2!");
            System.out.println("Dame la estadística de velocidad:");
            velocidad2 = sc.nextInt();

            if (velocidad2 > 200) {
                velocidad2 = 200;
                System.out.println("Tu estadística de velocidad será 200.");
            }

            System.out.println("Dame la estadística de ataque:");
            ataque2 = sc.nextInt();

            if (ataque2 > 200) {
                ataque2 = 200;
                System.out.println("Tu estadística de ataque será 200.");
            }

            System.out.println("Dame la estadística de defensa:");
            defensa2 = sc.nextInt();

            if (defensa2 > 200) {
                defensa2 = 200;
                System.out.println("Tu estadística de defensa será 200.");
            }

            System.out.println("Introduce la estadística de puntos de vida:");
            vida2 = sc.nextInt();

            if (vida2 > 200) {
                vida2 = 200;
                System.out.println("Tu estadística de puntos de vida será 200.");
            }
            totalstats2 = velocidad2 + ataque2 + defensa2 + vida2;
        } while (totalstats2 > 500);


        System.out.println("Ronda " + ronda);
        // While vida > 0 && vida2 > 0.
        while (vida > 0 && vida2 > 0) {
            // Comparación de velocidad.
            if (velocidad > velocidad2) {
                // Player 1 ataca.
                double reduccion = defensa2 / 400.0; // 0.0 a 0.5
                a1 = ataque - defensa2;
                a1 = (int) (ataque * (1 - reduccion));
                if (a1 <= 0) a1 = 1; // daño mínimo
                Random random = new Random();
                vida2 = vida2 - random.nextInt(a1) + 1;
                System.out.println("La vida de Player 2 ha bajado a " + vida2);
                ronda++;
                break;
            } else {
                // Player 2 ataca.
                double reduccion = defensa / 400.0;
                a2 = (int) (ataque2 * (1 - reduccion));
                if (a2 <= 0) a2 = 1;
                Random random = new Random();
                vida = vida - random.nextInt(a2) + 1;
                System.out.println("La vida de Player 1 ha bajado a " + vida);
                ronda++;
                break;
            }

        }

    }
}
