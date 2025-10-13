package tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el número del mes (1-12)");
        int mes = in.nextInt();
        System.out.println("Introduce el año");
        int any = in.nextInt();

        int dias = 0;
        boolean mesValido = true;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias = 30;
        } else if (mes == 2) {
            if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
                dias = 29;
            } else {
                dias = 28;
            }
        } else {
            System.out.println("Mes inválido. Debe ser entre 1 y 12.");
            mesValido = false; // marcamos que no es válido
        }

        // Solo imprimimos si el mes es válido
        if (mesValido) {
            System.out.println("El mes " + mes + " del año " + any + " tiene " + dias + " días.");
        }
    }
}
