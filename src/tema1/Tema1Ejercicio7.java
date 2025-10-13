package tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Pregunta un número al usuario
        System.out.println("Dame una cara del dado");

        // Lee el número
        int cara = in.nextInt();

        if (cara >= 1) if (cara <= 6){
            cara = 7 - cara;
            System.out.println("La cara opuesta es = " + cara);

        }else{
            System.out.println("El número no es correcto");
        }
    }
}
