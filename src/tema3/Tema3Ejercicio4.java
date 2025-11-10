package tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {

    public static void showMenu() {
        System.out.println("¿Tienes euros o dólares?");
        System.out.println("Escribe '1' para pasar de euros a dólares");
        System.out.println("Escribe '2' para pasar de dólares a euros");
    }

    public static double euro2dollar (double dinero) {
        double resdollar = dinero * 1.16;
        return resdollar;
    }

    public static double dollar2euro (double dinero) {
        double reseuro = dinero * 0.87;
        return reseuro;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        showMenu();
        int opcion = in.nextInt();

        System.out.println("¿Cuántos dinero tienes?");
        double dinero = in.nextDouble();
        euro2dollar(dinero);
        dollar2euro(dinero);

        if (opcion == 1) {
            System.out.println(euro2dollar(dinero) + " €");
        } else {
            System.out.println(dollar2euro(dinero) + " $");
        }
    }
}
