package tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dame un número");
        double a = in.nextDouble();
        System.out.println("Dame otro número");
        double b = in.nextDouble();
        System.out.println("Dame otro número");
        double c = in.nextDouble();

        if (a >= b && b >= c) {
            System.out.println(a + " >= " + b + " >= " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + " >= " + c + " >= " + b);
        } else if (b >= a && a >= c) {
            System.out.println(b + " >= " + a + " >= " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + " >= " + c + " >= " + a);
        } else if (c >= a && a >= b) {
            System.out.println(c + " >= " + a + " >= " + b);
        } else { // c >= b && b >= a
            System.out.println(c + " >= " + b + " >= " + a);
        }

        in.close();
    }
}
