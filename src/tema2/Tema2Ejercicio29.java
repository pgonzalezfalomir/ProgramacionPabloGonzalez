package tema2;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomInt = random.nextInt(100) + 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 100.");
        int num = in.nextInt();

        while (randomInt != num) {
            if (num < randomInt) {
                System.out.println("El número secreto es mayor que " + num);
            } else {
                System.out.println("El número secreto es menor que " + num);
            }
            num = in.nextInt();
        }
        System.out.println("Has acertado, el numero era " + randomInt);
    }
}
