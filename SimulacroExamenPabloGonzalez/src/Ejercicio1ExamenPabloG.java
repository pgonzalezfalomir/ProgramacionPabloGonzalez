import java.util.Scanner;

public class Ejercicio1ExamenPabloG {
    public static void main(String[] args) {

        int aprobados = 0;
        int suspendidos = 0;

        double precio = 32;
        int veces = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("¿Qué menú quieres elegir? 'a': Aprobados y suspendidos. 'b': Billetes a Madrid. 'c': Salir");
        char opcion = in.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Dame la nota de un alumno/a, si quieres salir, pon un número negativo:");
                int nota = in.nextInt();
                    while (nota < 0) {
                        if (nota >= 5) {
                        System.out.println("Este alumno/a ha aprobado.");
                        aprobados = aprobados + 1; // no entiendo porque no suma y porque se acaba el programa
                    } else {
                        System.out.println("Este alumno/a ha suspendido.");
                        suspendidos = suspendidos + 1; // no entiendo porque no suma y porque se acaba el programa
                        }
                    }
                System.out.println("Han aprobado " + aprobados);
                System.out.println("Han suspendido " + suspendidos);

                if (aprobados > suspendidos) {
                    System.out.println("Hay mas aprobados que suspendidos");
                } else if (suspendidos > aprobados) {
                    System.out.println("Hay mas suspendidos que aprobados");
                } else {
                    System.out.println("Hay los mismos suspendidos que aprobados");
                }
                break;

            case 'b':
                System.out.println("¿Cuantas personas sois?");
                int contador = in.nextInt();
                while (veces != contador) {
                    System.out.println("¿Que edad tienes?");
                    int edad = in.nextInt();
                    if (edad >= 65) {
                        double precio65 = precio * 0.10;
                        System.out.println("El precio de la entrada para mayores de 65 años es: " + precio65);
                    }
                    if (edad >= 12 && edad <= 15) {
                        double precio12a15 = precio * 0.8;
                        System.out.println("El precio de la entrada para personas entre 12 y 15 años es: " + precio12a15);
                    }
                    if (edad >= 4 && edad <= 11) {
                        double precio4a11 = precio * 0.35;
                        System.out.println("El precio de la entrada para personas entre 12 y 15 años es: " + precio4a11);
                    }
                    if (edad < 4) {
                        double preciomenora4 = 0;
                        System.out.println("El precio de la entrada para personas entre 12 y 15 años es: " + preciomenora4);
                    }
                }


            case 'c':
                System.out.println("Has salido del programa");
                break;

            default:
                System.out.println("Has puesto un carácter incorrecto");
        }

        }
    }
