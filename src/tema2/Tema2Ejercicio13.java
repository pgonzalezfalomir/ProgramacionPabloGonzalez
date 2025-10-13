package tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce las horas");
        int horas = in.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = in.nextInt();
        System.out.println("Introduce los segundos");
        int segundos = in.nextInt();

//comprovar que les dades son correcte

        if (horas > 24) {
            System.out.println("No es un valor correcto");
        } else if (minutos > 60) {
            System.out.println("No es un valor correcto");
        } else if (segundos > 60) {
            System.out.println("No es un valor correcto");
        }
        else {
            segundos++;

            if (segundos == 60) {
                segundos = 00;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 00;
                horas++;
            }
            if (horas == 24) {
                horas = 00;
            }

            System.out.println("La hora con un segundo más es = " + horas + ":" + minutos + ":" + segundos);
        }

    }
}
