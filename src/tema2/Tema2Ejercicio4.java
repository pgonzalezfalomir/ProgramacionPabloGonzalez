package tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        int num1 = in.nextInt();
        System.out.println("Dame otro número");
        int num2 = in.nextInt();
        System.out.println("Dame otro número");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es " + num1);
        } if (num2 > num1 && num2 > num3) {
            System.out.println("El número mayor es " + num2);
        } if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es " + num3);
        } else {
            System.out.println("Los números " + num1 + ", " + num2 + " y " + num3 + " son iguales.");

        }
    }
}
