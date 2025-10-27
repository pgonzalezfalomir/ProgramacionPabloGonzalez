package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Videojuego {
    public static void main(String[] args) {

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

        // Instrucciones del juego:
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego! Las instrucciones son:");
        System.out.println("1. El total de las estadísticas no puede ser superior a 500");
        System.out.println("2. El valor máximo de una estadística es 200.");

        // Switch elección predeterminado o personalizado:
        System.out.println("¿Quieres elegir un personaje predeterminado (1) o crear tu propio personaje (2)?");
        opciones = sc.nextInt();
        sc.nextLine();
        switch (opciones) {
            case 1:
                // Turno jugador 1:
                System.out.println("¡Turno de Player 1!");
                System.out.println("¿Cuál es tu nombre?");
                nombre = sc.nextLine();
                System.out.println("¿Qúe tipo de personaje quieres?");
                System.out.println("Asesino (++velocidad, ++ataque, -defensa, -vida) (1), Tanque (++vida ++defensa, -ataque, -velocidad) (2), Híbrido (+ataque, +defensa, + vida, +velocidad) (3)");
                personajes = sc.nextInt();
                sc.nextLine();
                switch (personajes) {
                    // Eleccion tipo de personaje jugador 1 con switch:
                    case 1:
                        System.out.println("Tu personaje es asesino");
                        ataque = 200;
                        velocidad = 200;
                        defensa = 50;
                        vida = 50;
                        break;
                    case 2:
                        System.out.println("Tu personaje es tanque");
                        ataque = 50;
                        velocidad = 50;
                        defensa = 200;
                        vida = 200;
                        break;
                    case 3:
                        System.out.println("Tu personaje es híbrido");
                        ataque = 125;
                        velocidad = 125;
                        defensa = 125;
                        vida = 125;
                        break;
                }
                // Turno jugador 2:
                System.out.println("¡Turno de Player 2!");
                System.out.println("¿Cuál es tu nombre?");
                nombre2 = sc.nextLine();
                System.out.println("¿Qúe tipo de personaje quieres?");
                System.out.println("Asesino (++velocidad, ++ataque, -defensa, -vida) (1), Tanque (++vida ++defensa, -ataque, -velocidad) (2), Híbrido (+ataque, +defensa, + vida, +velocidad) (3)");
                personajes = sc.nextInt();
                sc.nextLine();
                switch (personajes) {
                    // Eleccion tipo de personaje jugador 2 con switch:
                    case 1:
                        System.out.println("Tu personaje es asesino");
                        ataque2 = 200;
                        velocidad2 = 200;
                        defensa2 = 50;
                        vida2 = 50;
                        break;
                    case 2:
                        System.out.println("Tu personaje es tanque");
                        ataque2 = 50;
                        velocidad2 = 50;
                        defensa2 = 200;
                        vida2 = 200;
                        break;
                    case 3:
                        System.out.println("Tu personaje es híbrido");
                        ataque2 = 125;
                        velocidad2 = 125;
                        defensa2 = 125;
                        vida2 = 125;
                        break;
                }
                break;
            case 2:
                // Personajes personalizados jugador 1 case 2 switch opciones:
                do {
                    // Turno jugador 1:
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
                    // Comprobación estadísticas máximas jugador 1:
                    totalstats = velocidad + ataque + defensa + vida;
                    sc.nextLine();
                }

                while (totalstats > 500);
                do {
                    // Personajes personalizados jugador 2 case 2 switch opciones:
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
                        vida = 1;
                        System.out.println("Tu estadística de puntos de vida será 1.");
                    }
                    // Comprobación estadísticas máximas jugador 2:
                    totalstats2 = velocidad2 + ataque2 + defensa2 + vida2;
                    sc.nextLine();
                } while (totalstats2 > 500);
        }

        // Comprobación velocidad
        if (velocidad == velocidad2) {
            System.out.println("Los dos jugadores tienen la misma velocidad, se decidirá de forma aleatoria");
            Random random = new Random();
            int velocidad_random = 0;
            velocidad_random = random.nextInt(3) + 1;
            if (velocidad_random == 1) {
                System.out.println("El más rápido será " + nombre);
                velocidad++;
            } else {
                System.out.println("El más rápido será " + nombre2);
                velocidad2++;
            }
        }

        // Bucle hasta que jugador 1 o jugador 2 tenga 0 puntos de vida:
        while (vida > 0 && vida2 > 0) {
            System.out.println("-".repeat(50));
            System.out.println("Ronda " + ronda + ":");
            if (velocidad > velocidad2) {
                double reduccion = defensa2 / 400.0;
                a1 = ataque - defensa2;
                a1 = (int) (ataque * (1 - reduccion));
                if (a1 <= 0) a1 = 1;
                Random random = new Random();
                vida2 = vida2 - (random.nextInt(a1) + 1) / 2;
                if (vida2 < 0) {
                    vida2 = 0;
                }
                System.out.println("La vida de " + nombre2 + " ha bajado a " + vida2);
                if (vida2 == 0) {
                    System.out.println(nombre2 + " ha sido eliminado. ¡Ganó " + nombre + " 🥇!");
                }

                reduccion = defensa / 400.0;
                a2 = (int) (ataque2 * (1 - reduccion));
                if (a2 <= 0) a2 = 1;
                vida = vida - (random.nextInt(a2) + 1) / 2;
                if (vida < 0) {
                    vida = 0;
                }
                System.out.println("La vida de " + nombre + " ha bajado a " + vida);
                if (vida == 0) {
                    System.out.println(nombre + " ha sido eliminado. ¡Ganó " + nombre2 + " 🥇!");
                }
                ronda++;

            } else if (velocidad2 > velocidad) {
                double reduccion = defensa / 400.0;
                a2 = (int) (ataque2 * (1 - reduccion));
                if (a2 <= 0) a2 = 1;
                Random random = new Random();
                vida = vida - (random.nextInt(a2) + 1) / 2;
                if (vida < 0) {
                    vida = 0;
                }
                System.out.println("La vida de " + nombre + " ha bajado a " + vida);
                if (vida == 0) {
                    System.out.println(nombre + " ha sido eliminado. ¡Ganó " + nombre2 + " 🥇!");
                }

                reduccion = defensa2 / 400.0;
                a1 = ataque - defensa2;
                a1 = (int) (ataque * (1 - reduccion));
                if (a1 <= 0) a1 = 1;
                vida2 = vida2 - (random.nextInt(a1) + 1) / 2;
                if (vida2 < 0) {
                    vida2 = 0;
                }
                System.out.println("La vida de " + nombre2 + " ha bajado a " + vida2);
                if (vida2 == 0) {
                    System.out.println(nombre2 + " ha sido eliminado. Ganó " + nombre + " 🥇!");
                }
                ronda++;
            }
        }
    }
}
