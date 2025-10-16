package tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {

        int aprobados = 0;
        int suspendidos = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la nota de un alumno. Si has terminado, introduce una nota negativa.");
        double nota = in.nextDouble();

        while (nota >= 0) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            System.out.println("Introduce la nota de otro alumno");
            nota = in.nextDouble();
        }
        System.out.println("Han aprobado " + aprobados + " alumnos");
        System.out.println("Han suspendido " + suspendidos + " alumnos");
        }
    }
