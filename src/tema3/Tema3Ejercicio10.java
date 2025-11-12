package tema3;

import java.util.Scanner;

public class Tema3Ejercicio10 {

    public static void menu (char opcion, String[] args) {
        switch (opcion) {
            case 'a':
                Tema3Ejercicio1.main(args);
                break;
            case 'b':
                Tema3Ejercicio2.main(args);
                break;
            case 'c':
                Tema3Ejercicio3.main(args);
                break;
            case 'd':
                Tema3Ejercicio4.main(args);
                break;
            case 'e':
                Tema3Ejercicio5.main(args);
                break;
            case 'f':
                Tema3Ejercicio6.main(args);
                break;
            case 'h':
                Tema3Ejercicio8.main(args);
                break;
            default:
                System.out.println("Valor incorrecto.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dime la opción que quieres elegir:");
        System.out.println("'a': Muestra el signo de un número introducido por el usuario.");
        System.out.println("'b': Indica si el usuario es mayor de edad o no.");
        System.out.println("'c': Calcula el área y perímetro de un círculo.");
        System.out.println("'d': Conversor de euros a dólares y de dólares a euros.");
        System.out.println("'e': Mostrar tabla de multiplicar de un número.");
        System.out.println("'f': Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("'h': Comprobador de fechas.");
        char opcion = in.next().charAt(0);
        menu(opcion, args);
    }
}
