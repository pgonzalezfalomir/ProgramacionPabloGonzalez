package tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {

    public static void comprobacion (int ano, int mes, int dia) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto");
        } else if (dia < 1 || dia > 31) {
            
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dame el año");
        int ano = in.nextInt();
        System.out.println("Dame el mes");
        int mes = in.nextInt();
        System.out.println("Dame el día");
        int dia = in.nextInt();
    }
}
