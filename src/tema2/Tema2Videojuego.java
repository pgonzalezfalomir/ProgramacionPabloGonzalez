package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Videojuego {
    // Muestra barra de vida con guiones
    public static void mostrarBarraVida(int vidaActual, int vidaMaxima, String nombre) {
        int longitudBarra = 20;
        int bloques = (int) ((vidaActual / (double) vidaMaxima) * longitudBarra);
        if (bloques < 0) bloques = 0;

        String barra = "█".repeat(bloques) + "-".repeat(longitudBarra - bloques);
        System.out.println(nombre + " ❤️ [" + barra + "] (" + vidaActual + "/" + vidaMaxima + ")");
    }

    public static void main(String[] args) {

        // Inicialización variables
        int totalstats = 0;
        int totalstats2 = 0;
        int opciones = 0;
        int personajes = 0;
        String nombre = "";
        String nombre2 = "";
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

        // 🆕 Variables para control de curación
        boolean seCuroAntes1 = false;
        boolean seCuroAntes2 = false;

        // Instrucciones juego
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego! Las instrucciones son:");
        System.out.println("1. El total de las estadísticas no puede ser superior a 500");
        System.out.println("2. El valor máximo de una estadística es 200.");

        // Eleccion personaje predeterminado o personaje personalizado
        System.out.println("¿Quieres elegir un personaje predeterminado (1) o crear tu propio personaje (2)?");
        opciones = sc.nextInt();
        sc.nextLine();
        switch (opciones) {
            case 1:
                // Turno jugador 1 personaje predeterminado
                System.out.println("¡Turno de Player 1!");
                System.out.println("¿Cuál es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("¿Qúe tipo de personaje quieres?");
                System.out.println("Asesino (++velocidad, ++ataque, -defensa, -vida) (1), Tanque (++vida ++defensa, -ataque, -velocidad) (2), Híbrido (+ataque, +defensa, +vida, +velocidad) (3)");
                personajes = sc.nextInt();
                sc.nextLine();
                switch (personajes) {
                    case 1:
                        // Elección asesino
                        System.out.println("Tu personaje es asesino");
                        ataque = 150;
                        velocidad = 150;
                        defensa = 100;
                        vida = 100;
                        break;
                    case 2:
                        // Elección tanque
                        System.out.println("Tu personaje es tanque");
                        ataque = 95;
                        velocidad = 50;
                        defensa = 180;
                        vida = 175;
                        break;
                    case 3:
                        // Elección híbrido
                        System.out.println("Tu personaje es híbrido");
                        ataque = 125;
                        velocidad = 125;
                        defensa = 125;
                        vida = 125;
                        break;
                }
                // Turno jugador 2 personaje predeterminado
                System.out.println("¡Turno de Player 2!");
                System.out.println("¿Cuál es tu nombre?");
                nombre2 = sc.nextLine();
                System.out.println("¿Qúe tipo de personaje quieres?");
                System.out.println("Asesino (++velocidad, ++ataque, -defensa, -vida) (1), Tanque (++vida ++defensa, -ataque, -velocidad) (2), Híbrido (+ataque, +defensa, +vida, +velocidad) (3)");
                personajes = sc.nextInt();
                sc.nextLine();
                switch (personajes) {
                    case 1:
                        // Elección asesino
                        System.out.println("Tu personaje es asesino");
                        ataque2 = 150;
                        velocidad2 = 150;
                        defensa2 = 100;
                        vida2 = 100;
                        break;
                    case 2:
                        // Elección tanque
                        System.out.println("Tu personaje es tanque");
                        ataque2 = 95;
                        velocidad2 = 50;
                        defensa2 = 180;
                        vida2 = 175;
                        break;
                    case 3:
                        // Elección híbrido
                        System.out.println("Tu personaje es híbrido");
                        ataque2 = 125;
                        velocidad2 = 125;
                        defensa2 = 125;
                        vida2 = 125;
                        break;
                }
                break;
            case 2:
                do {
                    // Estadísticas personalizadas jugador 1
                    System.out.println("¡Turno de Player 1!");
                    System.out.println("¿Cuál es tu nombre?");
                    nombre = sc.nextLine();
                    System.out.println("Introduce la estadística de velocidad 🏃‍♂️:");
                    velocidad = sc.nextInt();
                    if (velocidad > 200) {
                        velocidad = 200;
                        System.out.println("Tu estadística de velocidad será 200.");
                    }
                    if (velocidad <= 0) {
                        velocidad = 1;
                        System.out.println("Tu estadística de velocidad será 1.");
                    }
                    System.out.println("Introduce la estadística de ataque 👊:");
                    ataque = sc.nextInt();
                    if (ataque > 200) {
                        ataque = 200;
                        System.out.println("Tu estadística de ataque será 200.");
                    }
                    if (ataque <= 0) {
                        ataque = 1;
                        System.out.println("Tu estadística de ataque será 1.");
                    }
                    System.out.println("Introduce la estadística de defensa 🛡️:");
                    defensa = sc.nextInt();
                    if (defensa > 200) {
                        defensa = 200;
                        System.out.println("Tu estadística de defensa será 200.");
                    }
                    if (defensa <= 0) {
                        defensa = 1;
                        System.out.println("Tu estadística de defensa será 1.");
                    }
                    System.out.println("Introduce la estadística de puntos de vida ❤️:");
                    vida = sc.nextInt();
                    if (vida > 200) {
                        vida = 200;
                        System.out.println("Tu estadística de puntos de vida será 200.");
                    }
                    if (vida <= 0) {
                        vida = 1;
                        System.out.println("Tu estadística de puntos de vida será 1.");
                    }
                    totalstats = velocidad + ataque + defensa + vida;
                    sc.nextLine();
                } while (totalstats > 500);
                do {
                    // Estadísticas personalizadas jugador2
                    System.out.println("¡Turno de Player 2!");
                    System.out.println("¿Cuál es tu nombre?");
                    nombre2 = sc.nextLine();
                    System.out.println("Introduce la estadística de velocidad 🏃‍♂️:");
                    velocidad2 = sc.nextInt();
                    if (velocidad2 > 200) {
                        velocidad2 = 200;
                        System.out.println("Tu estadística de velocidad será 200.");
                    }
                    if (velocidad2 <= 0) {
                        velocidad2 = 1;
                        System.out.println("Tu estadística de velocidad será 1.");
                    }
                    System.out.println("Introduce la estadística de ataque 👊:");
                    ataque2 = sc.nextInt();
                    if (ataque2 > 200) {
                        ataque2 = 200;
                        System.out.println("Tu estadística de ataque será 200.");
                    }
                    if (ataque2 <= 0) {
                        ataque2 = 1;
                        System.out.println("Tu estadística de ataque será 1.");
                    }
                    System.out.println("Introduce la estadística de defensa 🛡️:");
                    defensa2 = sc.nextInt();
                    if (defensa2 > 200) {
                        defensa2 = 200;
                        System.out.println("Tu estadística de defensa será 200.");
                    }
                    if (defensa2 <= 0) {
                        defensa2 = 1;
                        System.out.println("Tu estadística de defensa será 1.");
                    }
                    System.out.println("Introduce la estadística de puntos de vida ❤️:");
                    vida2 = sc.nextInt();
                    if (vida2 > 200) {
                        vida2 = 200;
                        System.out.println("Tu estadística de puntos de vida será 200.");
                    }
                    if (vida2 <= 0) {
                        vida2 = 1;
                        System.out.println("Tu estadística de puntos de vida será 1.");
                    }
                    totalstats2 = velocidad2 + defensa2 + ataque2 + vida2;
                    sc.nextLine();
                } while (totalstats2 > 500);
        }

        int vidaMax1 = vida;
        int vidaMax2 = vida2;

        // Desempate velocidad
        if (velocidad == velocidad2) {
            System.out.println("Los dos jugadores tienen la misma velocidad, se decidirá de forma aleatoria");
            Random random = new Random();
            int velocidad_random = random.nextInt(3) + 1;
            if (velocidad_random == 1) {
                System.out.println("El más rápido será " + nombre);
                velocidad++;
            } else {
                System.out.println("El más rápido será " + nombre2);
                velocidad2++;
            }
        }

        // Condición bucle combate
        while (vida > 0 && vida2 > 0) {
            System.out.println("-".repeat(50));
            System.out.println("Ronda " + ronda + ":");

            // Mostrar barras de vida inicio cada ronda
            mostrarBarraVida(vida, vidaMax1, nombre);
            mostrarBarraVida(vida2, vidaMax2, nombre2);

            Random random = new Random();

            if (velocidad > velocidad2) {
                System.out.println("El más rápido es " + nombre + ", por lo que ataca primero");

                // 🆕 ELECCIÓN DE ACCIÓN JUGADOR 1
                System.out.println(nombre + ", elige tu movimiento: 1. Atacar  2. Curarte");
                int accion1 = sc.nextInt();
                if (accion1 == 2 && seCuroAntes1) {
                    System.out.println("No puedes curarte dos veces seguidas. Atacas por obligación.");
                    accion1 = 1;
                }

                if (accion1 == 2) {
                    int curacion = random.nextInt(16) + 10; // cura 10-25
                    // 🆕 Probabilidad de curación crítica
                    if (random.nextInt(10) == 0) {
                        curacion *= 2;
                        System.out.println("💥 ¡Curación crítica! 💥");
                    }
                    vida += curacion;
                    if (vida > vidaMax1) vida = vidaMax1;
                    System.out.println(nombre + " se ha curado ❤️ +" + curacion + " puntos de vida");
                    mostrarBarraVida(vida, vidaMax1, nombre);
                    seCuroAntes1 = true;
                } else {
                    // 🆕 Probabilidad de fallo de ataque
                    if (random.nextInt(10) == 0) {
                        System.out.println("💨 ¡" + nombre + " ha fallado el ataque!");
                    } else {
                        double reduccion = defensa2 / 400.0;
                        a1 = (int) (ataque * (1 - reduccion));
                        if (a1 <= 0) a1 = 1;
                        vida2 -= (random.nextInt(a1) + 1) / 2;
                        if (vida2 < 0) vida2 = 0;

                        System.out.println("La vida de " + nombre2 + " ha bajado a " + vida2);
                        mostrarBarraVida(vida2, vidaMax2, nombre2);
                    }
                    seCuroAntes1 = false;
                }

                if (vida2 == 0) {
                    System.out.println(nombre2 + " ha sido eliminado. ¡Ganó " + nombre + " 🥇!");
                    break;
                }

                // 🆕 ELECCIÓN DE ACCIÓN JUGADOR 2
                System.out.println(nombre2 + ", elige tu movimiento: 1. Atacar  2. Curarte");
                int accion2 = sc.nextInt();
                if (accion2 == 2 && seCuroAntes2) {
                    System.out.println("No puedes curarte dos veces seguidas. Atacas por obligación.");
                    accion2 = 1;
                }

                if (accion2 == 2) {
                    int curacion2 = random.nextInt(16) + 10;
                    if (random.nextInt(10) == 0) {
                        curacion2 *= 2;
                        System.out.println("💥 ¡Curación crítica! 💥");
                    }
                    vida2 += curacion2;
                    if (vida2 > vidaMax2) vida2 = vidaMax2;
                    System.out.println(nombre2 + " se ha curado ❤️ +" + curacion2 + " puntos de vida");
                    mostrarBarraVida(vida2, vidaMax2, nombre2);
                    seCuroAntes2 = true;
                } else {
                    if (random.nextInt(10) == 0) {
                        System.out.println("💨 ¡" + nombre2 + " ha fallado el ataque!");
                    } else {
                        double reduccion = defensa / 400.0;
                        a2 = (int) (ataque2 * (1 - reduccion));
                        if (a2 <= 0) a2 = 1;
                        vida -= (random.nextInt(a2) + 1) / 2;
                        if (vida < 0) vida = 0;

                        System.out.println("La vida de " + nombre + " ha bajado a " + vida);
                        mostrarBarraVida(vida, vidaMax1, nombre);
                    }
                    seCuroAntes2 = false;
                }

                if (vida == 0) {
                    System.out.println(nombre + " ha sido eliminado. ¡Ganó " + nombre2 + " 🥇!");
                    break;
                }

            } else {
                System.out.println("El más rápido es " + nombre2 + ", por lo que ataca primero");

                // 🆕 ELECCIÓN DE ACCIÓN JUGADOR 2
                System.out.println(nombre2 + ", elige tu movimiento: 1. Atacar  2. Curarte");
                int accion2 = sc.nextInt();
                if (accion2 == 2 && seCuroAntes2) {
                    System.out.println("No puedes curarte dos veces seguidas. Atacas por obligación.");
                    accion2 = 1;
                }

                if (accion2 == 2) {
                    int curacion2 = random.nextInt(16) + 10;
                    if (random.nextInt(10) == 0) {
                        curacion2 *= 2;
                        System.out.println("💥 ¡Curación crítica! 💥");
                    }
                    vida2 += curacion2;
                    if (vida2 > vidaMax2) vida2 = vidaMax2;
                    System.out.println(nombre2 + " se ha curado ❤️ +" + curacion2 + " puntos de vida");
                    mostrarBarraVida(vida2, vidaMax2, nombre2);
                    seCuroAntes2 = true;
                } else {
                    if (random.nextInt(10) == 0) {
                        System.out.println("💨 ¡" + nombre2 + " ha fallado el ataque!");
                    } else {
                        double reduccion = defensa / 400.0;
                        a2 = (int) (ataque2 * (1 - reduccion));
                        if (a2 <= 0) a2 = 1;
                        vida -= (random.nextInt(a2) + 1) / 2;
                        if (vida < 0) vida = 0;

                        System.out.println("La vida de " + nombre + " ha bajado a " + vida);
                        mostrarBarraVida(vida, vidaMax1, nombre);
                    }
                    seCuroAntes2 = false;
                }

                if (vida == 0) {
                    System.out.println(nombre + " ha sido eliminado. ¡Ganó " + nombre2 + " 🥇!");
                    break;
                }

                // 🆕 ELECCIÓN DE ACCIÓN JUGADOR 1
                System.out.println(nombre + ", elige tu movmiento: 1. Atacar  2. Curarte");
                int accion1 = sc.nextInt();
                if (accion1 == 2 && seCuroAntes1) {
                    System.out.println("No puedes curarte dos veces seguidas. Atacas por obligación.");
                    accion1 = 1;
                }

                if (accion1 == 2) {
                    int curacion = random.nextInt(16) + 10;
                    if (random.nextInt(10) == 0) {
                        curacion *= 2;
                        System.out.println("💥 ¡Curación crítica! 💥");
                    }
                    vida += curacion;
                    if (vida > vidaMax1) vida = vidaMax1;
                    System.out.println(nombre + " se ha curado ❤️ +" + curacion + " puntos de vida");
                    mostrarBarraVida(vida, vidaMax1, nombre);
                    seCuroAntes1 = true;
                } else {
                    if (random.nextInt(10) == 0) {
                        System.out.println("💨 ¡" + nombre + " ha fallado el ataque!");
                    } else {
                        double reduccion = defensa2 / 400.0;
                        a1 = (int) (ataque * (1 - reduccion));
                        if (a1 <= 0) a1 = 1;
                        vida2 -= (random.nextInt(a1) + 1) / 2;
                        if (vida2 < 0) vida2 = 0;

                        System.out.println("La vida de " + nombre2 + " ha bajado a " + vida2);
                        mostrarBarraVida(vida2, vidaMax2, nombre2);
                    }
                    seCuroAntes1 = false;
                }

                if (vida2 == 0) {
                    System.out.println(nombre2 + " ha sido eliminado. ¡Ganó " + nombre + " 🥇!");
                    break;
                }
            }
            // Repetición bucle hasta que jugador1 / jugador
            ronda++;
        }
    }
}
