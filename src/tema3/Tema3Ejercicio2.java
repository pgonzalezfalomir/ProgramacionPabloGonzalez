package tema3;
import java.util.Scanner;

public class Tema3Ejercicio2 {

    public static boolean isAdult(int edad2) {
        if (edad2 >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número:");
        int numero = in.nextInt();
        int resultado = Tema3Ejercicio1.numberSign(numero);
        if (resultado == 1) {
            System.out.println("Es positivo");
        } else if (resultado == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("Es negativo");
        }

        System.out.println("Dime tu edad:");
        int edad2 = in.nextInt();
        boolean resultado2 = isAdult(edad2);

        if (resultado2 == true) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}

