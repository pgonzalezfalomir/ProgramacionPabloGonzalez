package tema4;

import java.util.Random;

public class JuegoRolHero {
    public static void main(String[] args) {
        Random rnd = new Random();

        Hero pablo = new Hero();
        pablo.setName("Pablo");
        pablo.setHealth(150);
        pablo.setMaxHealth(150);

        int hordasSobrevividas = 0;

        while (pablo.getHealth() > 0) {
            hordasSobrevividas++;
            System.out.println("Horda " + hordasSobrevividas);

            int numEnemigos = rnd.nextInt(3) + 1;
            Hero[] horda = new Hero[numEnemigos];

            for (int i = 0; i < numEnemigos; i++) {
                horda[i] = new Hero("Enemigo " + (i + 1), 1, 30, 30, 0, 15, 5);
            }

            System.out.println("Han aparecido " + numEnemigos + " enemigos.");

            boolean enemigosVivos = true;
            while (pablo.getHealth() > 0 && enemigosVivos) {

                enemigosVivos = false;

                for (int i = 0; i < horda.length; i++) {
                    if (horda[i] != null && horda[i].getHealth() > 0) {

                        if (rnd.nextInt(100) < 10) {
                            System.out.println(horda[i].getName() + " ha huido.");
                            horda[i] = null;
                        } else {
                            enemigosVivos = true;

                            if (horda[i].getHealth() > 0) {
                                // horda[i].ataque(pablo); No encuentro el motivo de porque no me funciona la funcion ataque.
                            } else {
                                System.out.println(horda[i].getName() + " ha muerto.");
                            }
                        }
                    }
                }
            }

            if (pablo.getHealth() > 0) {
                if (rnd.nextInt(1000) < 1) {
                    pablo.rest();
                    System.out.println("Has descansado.");
                }

                if (rnd.nextInt(100) < 10) {
                    pablo.drinkPotion();
                    System.out.println("Te has curado con una poción.");
                }
            }
        }

        System.out.println("Has muerto. Hordas sobrevividas: " + (hordasSobrevividas - 1));
    }

}
