package tema4.POO1;

import java.util.Random;

public class JuegoRolHero {
    public static void main(String[] args) {
        Random random = new Random();

        // Creación del heroe
        Hero pablo = new Hero();
        pablo.setName("Pablo");
        pablo.setHealth(150);
        pablo.setMaxHealth(150);

        int hordasSobrevividas = 0;

        // Bucle inicio del juego
        while (pablo.getHealth() > 0) {
            hordasSobrevividas++;
            System.out.println("Horda " + hordasSobrevividas);

            // Generación de enemigos aleatoria entre 1 y 3.
            int numEnemigos = random.nextInt(3) + 1;

            // Guarda a los enemigos en un array
            Hero[] horda = new Hero[numEnemigos];

            // Recorre a los enemigos con el array y les pone estadísticas
            for (int i = 0; i < numEnemigos; i++) {
                horda[i] = new Hero("Enemigo " + (i + 1), 1, 30, 30, 0, 15, 5);
            }

            System.out.println("Han aparecido " + numEnemigos + " enemigos.");

            boolean enemigosVivos = true;
            while (pablo.getHealth() > 0 && enemigosVivos) { // Sigue el combate mientras heroe este vivo y haya enemigos vivos

                enemigosVivos = false; // Empieza pensando que enemigos han muerto o han huido

                for (int i = 0; i < horda.length; i++) { // Recorre el array para comprobar que haya enemigos
                    if (horda[i] != null && horda[i].getHealth() > 0) { // Comprobación de que el enemigo no esté muerto

                        if (random.nextInt(100) < 10) { // Probabilidad de huir
                            System.out.println(horda[i].getName() + " ha huido.");
                            horda[i] = null;
                        } else {
                            enemigosVivos = true;

                            pablo.ataque(horda[i]); // Si el enemigo se queda, heroe ataca

                            if (horda[i].getHealth() > 0) { // Si sobrevive al ataque del héroe, el enemigo contraataca
                                horda[i].ataque(pablo);
                            } else {
                                System.out.println(horda[i].getName() + " ha muerto.");
                            }
                        }
                    }
                }
            }

            if (pablo.getHealth() > 0) { // Probabilidad de curarse rest() cuando acabas una oleada
                if (random.nextInt(1000) < 1) {
                    pablo.rest();
                    System.out.println("Has descansado.");
                }

                if (random.nextInt(100) < 10) { // Probabilidad de curarse drinkPotion() cuando acabas una oleada
                    pablo.drinkPotion();
                    System.out.println("Te has curado con una poción.");
                }
            }
        }
        // Mensaje cuando el heroe muere
        System.out.println("Has muerto. Hordas sobrevividas: " + (hordasSobrevividas - 1));
    }
}