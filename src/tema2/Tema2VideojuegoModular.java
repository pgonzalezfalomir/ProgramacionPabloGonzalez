package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2VideojuegoModular {
    public static void main(String[] args) {
        mostrarBienvenida();

        System.out.println();
        System.out.println("Turno de jugador 1:");
        String nombre = leerNombres();
        int[] stats1 = configurarPersonaje();

        System.out.println();
        System.out.println("Turno de jugador 2:");
        String nombre2 = leerNombres();
        int[] stats2 = configurarPersonaje();

        int vida = stats1[0], ataque = stats1[1], defensa = stats1[2], velocidad = stats1[3];
        int vida2 = stats2[0], ataque2 = stats2[1], defensa2 = stats2[2], velocidad2 = stats2[3];

        inicioCombate(nombre, vida, ataque, defensa, velocidad, nombre2, vida2, ataque2, defensa2, velocidad2);
    }

    public static void mostrarBienvenida() {
        System.out.println();
        System.out.println("¡Bienvenido al juego! Las instrucciones son:");
        System.out.println("1. El total de las estadísticas no puede superar 500");
        System.out.println("2. El valor máximo de una estadística es 200");
    }

    public static String leerNombres() {
        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");
        return in.nextLine();
    }

    public static int[] configurarPersonaje() {
        Scanner in = new Scanner(System.in);
        System.out.println("¿Personaje predeterminado (1) o personalizado (2)?");
        int opciones = Integer.parseInt(in.nextLine());
        if (opciones == 1) {
            return elegirPersonajePredeterminado();
        }
        return crearPersonajePersonalizado();
    }

    public static int[] elegirPersonajePredeterminado() {
        Scanner in = new Scanner(System.in);
        System.out.println("Asesino (1) | Tanque (2) | Híbrido (3)");
        int personajes = Integer.parseInt(in.nextLine());
        if (personajes == 1) {
            return new int[]{130, 150, 90, 130};
        } if (personajes == 2) {
            return new int[]{175, 95, 180, 50};
        }
        return new int[]{125, 125, 125, 125};
    }

    public static int[] crearPersonajePersonalizado() {
        int vida;
        int ataque;
        int defensa;
        int velocidad;

        do {
            velocidad = validarStats("Introduce velocidad:");
            ataque = validarStats("Introduce ataque:");
            defensa = validarStats("Introduce defensa:");
            vida = validarStats("Introduce vida:");
            if (vida + ataque + defensa + velocidad > 500) {
                System.out.println("Tus estadísticas suman más de 500.");
            }
        } while (vida + ataque + defensa + velocidad > 500);
        return new int[]{vida, ataque, defensa, velocidad};
    }

    public static int validarStats(String msj) {
        Scanner in = new Scanner(System.in);
        System.out.println(msj);
        int val = Integer.parseInt(in.nextLine());
        if (val > 200) {
            return 200;
        }
        if (val <= 0) {
            return 1;
        }
        return val;
    }

    public static void inicioCombate(String nombre1, int vida1, int ataque1, int defensa1, int velocidad1, String nombre2, int vida2, int ataque2, int defensa2, int velocidad2) {
        int vidaMax1 = vida1;
        int vidaMax2 = vida2;
        int ronda = 1;
        while (vida1 > 0 && vida2 > 0) {
            System.out.println("Ronda " + ronda);
            System.out.println();
            mostrarBarraVida(vida1, vidaMax1, nombre1);
            mostrarBarraVida(vida2, vidaMax2, nombre2);

            if (velocidad1 >= velocidad2) {
                vida2 = turno(nombre1, nombre2, ataque1, defensa2, vida2);
                if (vida2 > 0) {
                    vida1 = turno(nombre2, nombre1, ataque2, defensa1, vida1);
                }
            } else {
                vida1 = turno(nombre2, nombre1, ataque2, defensa1, vida1);
                if (vida1 > 0) {
                    vida2 = turno(nombre1, nombre2, ataque1, defensa2, vida2);
                }
            }
            ronda++;
        }
        System.out.println("Ha ganado " + (vida1 > 0 ? nombre1 : nombre2));
    }

    public static int turno(String atacante, String defensor, int ataqueStat, int defensaStat, int vidaRival) {
        Random random = new Random();
        double aleatorio = random.nextDouble() + 0.5;
        double reduccion = defensaStat / 400.0;
        double danoBase = ataqueStat * (1 - reduccion);
        int danoFinal = (int) (danoBase * aleatorio / 2);

        if (danoFinal < 1) {
            danoFinal = 1;
        }
        System.out.println(atacante + " ataca a " + defensor);
        System.out.println();
        System.out.println("Quita " + danoFinal + " puntos de vida");
        System.out.println();
        int vidaRestante = vidaRival - danoFinal;

        if (vidaRestante < 0) {
            vidaRestante = 0;
        }
        return vidaRestante;
    }

    public static void mostrarBarraVida(int vidaActual, int vidaMaxima, String nombre) {
        int bloques = (int) ((vidaActual / (double) vidaMaxima) * 20);
        if (bloques < 0) bloques = 0;
        String barra = "█".repeat(bloques) + "-".repeat(Math.max(0, 20 - bloques));
        System.out.println(nombre + " ❤️ [" + barra + "] (" + vidaActual + "/" + vidaMaxima + ")");
    }
}