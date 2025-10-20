package tema2;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
        int num = 1;
        Random random = new Random();
        int randomInt = random.nextInt(99999);
        Scanner in = new Scanner(System.in);
        System.out.println("Tienes 5 intentos para adivinar el número.");

        for (int i = 0; i < 5; i++) {
            num = in.nextInt();
            if (num == randomInt){
                System.out.println("Has acertado.");
                break;
            } else {
                System.out.println("No has acertado.");
            }
        }
        System.out.println("El numero era " + randomInt);
    }
}
