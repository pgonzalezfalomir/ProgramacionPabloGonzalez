package tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {

    public static void comprobacion(int any, int mes, int dia) {

        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto.");
            return;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                System.out.println("Día incorrecto.");
            } else {
                System.out.println("La fecha es válida.");
            }
            return;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {
                System.out.println("Día incorrecto.");
            } else {
                System.out.println("La fecha es válida.");
            }
            return;
        }

        if (mes == 2) {
            if ((any % 4 == 0 && any % 100 != 0) || (any % 400 == 0)) {
                if (dia < 1 || dia > 29) {
                    System.out.println("Día incorrecto.");
                } else {
                    System.out.println("La fecha es válida.");
                }
            } else {
                if (dia < 1 || dia > 28) {
                    System.out.println("Día incorrecto.");
                } else {
                    System.out.println("La fecha es válida.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime el año");
        int any = in.nextInt();
        System.out.println("Dime el mes");
        int mes = in.nextInt();
        System.out.println("Dime el día");
        int dia = in.nextInt();

        comprobacion(any, mes, dia);
    }
}
