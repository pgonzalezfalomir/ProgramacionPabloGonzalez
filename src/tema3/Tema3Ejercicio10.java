package tema3;

import java.util.Scanner;

import static tema3.Tema3Ejercicio1.numberSign;
import static tema3.Tema3Ejercicio2.isAdult;
import static tema3.Tema3Ejercicio3.*;
import static tema3.Tema3Ejercicio4.*;
import static tema3.Tema3Ejercicio5.showTabla;
import static tema3.Tema3Ejercicio7.esPrimo;
import static tema3.Tema3Ejercicio8.comprobacion;
import static tema3.Tema3Ejercicio9.triangulo;

public class Tema3Ejercicio10 {

    public static void menu (char opcion, String[] args) {
        Scanner in = new Scanner(System.in);
        switch (opcion) {
            case 'a':
                System.out.println("Dime un número:");
                int numero = in.nextInt();
                int resultado = numberSign(numero);

                if (resultado == 1) {
                    System.out.println("El número es positivo.");
                } else if (resultado == 0) {
                    System.out.println("El número es 0.");
                } else {
                    System.out.println("El número es negativo.");
                }
                break;
            case 'b':
                System.out.println("Dame un número:");
                int numeroo = in.nextInt();
                int resultadoo = Tema3Ejercicio1.numberSign(numeroo);
                if (resultadoo == 1) {
                    System.out.println("Es positivo");
                } else if (resultadoo == 0) {
                    System.out.println("Es cero");
                } else {
                    System.out.println("Es negativo");
                }

                System.out.println("Dime tu edad:");
                int edadd2 = in.nextInt();
                boolean resultadoo2 = isAdult(edadd2);

                if (resultadoo2 == true) {
                    System.out.println("Es mayor de edad");
                } else {
                    System.out.println("Es menor de edad");
                }
                break;
            case 'c':
                System.out.println("Dame el valor del radio");
                double num1 = in.nextDouble();
                boolean radio = validRadius(num1);
                double a = calculateCircleArea(num1);
                double p = calculateCirclePerimeter(num1);

                if (radio == true) {
                    System.out.println("El perímetro es: " + p);
                    System.out.println("El área es: " + a);
                }
                break;
            case 'd':
                showMenu();
                int opcionn = in.nextInt();

                System.out.println("¿Cuántos dinero tienes?");
                double dinero = in.nextDouble();
                euro2dollar(dinero);
                dollar2euro(dinero);

                if (opcionn == 1) {
                    System.out.println(euro2dollar(dinero) + " $");
                } else {
                    System.out.println(dollar2euro(dinero) + " €");
                }
                break;
            case 'e':
                System.out.println("Dime un número del 1 al 10:");
                int num = in.nextInt();
                showTabla(num);
                break;
            case 'f':
                int contador = 1;
                int numm = 1;
                while (contador <= 10) {
                    Tema3Ejercicio5.showTabla(numm);
                    contador++;
                    System.out.println("\n");
                    numm++;
                }
                break;
            case 'g':
                int numerooo = -1; // Inicializamos con un valor distinto de 0
                System.out.println("Introduce números enteros positivos (0 para terminar):");
                while (numerooo != 0) {
                    System.out.print("Número: ");
                    numerooo = in.nextInt();
                    if (numerooo > 0) {
                        if (esPrimo(numerooo)) {
                            System.out.println(numerooo + " es primo.");
                        } else {
                            System.out.println(numerooo + " no es primo.");
                        }
                    } else if (numerooo < 0) {
                        System.out.println("Por favor, introduce solo números positivos.");
                    }
                    // Si el número es 0, el bucle terminará automáticamente
                }
                System.out.println("Programa terminado.");
                break;
            case 'h':
                System.out.println("Dime el año");
                int any = in.nextInt();
                System.out.println("Dime el mes");
                int mes = in.nextInt();
                System.out.println("Dime el día");
                int dia = in.nextInt();
                comprobacion(any, mes, dia);
                break;
            case 'i':
                System.out.println("Dame el carácter:");
                char caracter = in.next().charAt(0);
                System.out.println("Dame el número de líneas del triángulo:");
                int lineas = in.nextInt();
                triangulo(caracter, lineas);
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
        System.out.println("'g': Comprobador de números primos.");
        System.out.println("'h': Comprobador de fechas.");
        System.out.println("'i': Dibujar triángulos.");
        char opcion = in.next().charAt(0);
        menu(opcion, args);
    }
}