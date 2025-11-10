package tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = '1';

        do {
            System.out.println("Dime un número:");
            num = in.nextInt();
        }
        while (num != 0);

        System.out.println(num);
    }
}