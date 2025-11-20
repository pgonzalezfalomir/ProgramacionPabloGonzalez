package tema3;

import java.util.Scanner;

import static tema3.Tema3MyMath.*;

public class Tema3Ejercicio10MyMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Que ejercicio quieres hacer?");
        System.out.println("'1': Calcular el perímetro y el área de un círculo, cuadrado y rectángulo");
        System.out.println("'2': Detectar numeros primos o no primos");
        int opc = in.nextInt();

        switch (opc) {
            case 1:
                // Ejercicio 1:
                System.out.println("¿Qué figura geométrica quieres calcular?");
                System.out.println("'c': Círculo");
                System.out.println("'s': Cuadrado");
                System.out.println("'r': Rectángulo");
                char opcion = in.next().charAt(0);

                switch (opcion) {
                    case 'c':
                        System.out.println("Dime el radio del círculo:");
                        double radio = in.nextDouble();
                        System.out.println("¿Qué calculo quieres hacer?");
                        System.out.println("'1': Área");
                        System.out.println("'2': Perímetro");
                        int opcioncalculocirculo = in.nextInt();

                        if (opcioncalculocirculo == 1) {
                            circleArea(radio);
                            System.out.println(circleArea(radio));
                        } else if (opcioncalculocirculo == 2) {
                            circlePerimeter(radio);
                            System.out.println(circlePerimeter(radio));
                        } else {
                            System.out.println("Valor incorrecto");
                        }
                        break;
                    case 's':
                        System.out.println("Dime la medida del lado del cuadrado:");
                        double ladocuadrado = in.nextDouble();
                        System.out.println("¿Qué calculo quieres hacer?");
                        System.out.println("'1': Área");
                        System.out.println("'2': Perímetro");
                        int opcioncalculocuadrado = in.nextInt();

                        if (opcioncalculocuadrado == 1) {
                            squareArea(ladocuadrado);
                            System.out.println(squareArea(ladocuadrado));
                        } else if (opcioncalculocuadrado == 2) {
                            squarePerimeter(ladocuadrado);
                            System.out.println(squarePerimeter(ladocuadrado));
                        } else {
                            System.out.println("Valor incorrecto");
                        }
                        break;
                    case 'r':
                        System.out.println("Dime la medida del lado del rectángulo:");
                        double ladorectangulo = in.nextDouble();
                        System.out.println("Dime la medida de la altura del rectángulo:");
                        double alturarectangulo = in.nextDouble();
                        System.out.println("¿Qué calculo quieres hacer?");
                        System.out.println("'1': Área");
                        System.out.println("'2': Perímetro");
                        int opcioncalculorectangulo = in.nextInt();

                        if (opcioncalculorectangulo == 1) {
                            rectangleArea(ladorectangulo, alturarectangulo);
                            System.out.println(rectangleArea(ladorectangulo, alturarectangulo));
                        } else if (opcioncalculorectangulo == 2) {
                            rectanglePerimeter(ladorectangulo, alturarectangulo);
                            System.out.println(rectanglePerimeter(ladorectangulo, alturarectangulo));
                        } else {
                            System.out.println("Valor incorrecto");
                        }
                        break;
                    default:
                        System.out.println("Valor incorrecto");
                        break;
                }
                break;
            case 2:
                // Ejercicio 2
                int numero = -1; // Inicializamos con un valor distinto de 0
                System.out.println("Introduce números enteros positivos (0 para terminar):");

                while (numero != 0) {
                    System.out.print("Número: ");
                    numero = in.nextInt();

                    if (numero > 0) {
                        if (esPrimo(numero)) {
                            System.out.println(numero + " es primo.");
                        } else {
                            System.out.println(numero + " no es primo.");
                        }
                    } else if (numero < 0) {
                        System.out.println("Por favor, introduce solo números positivos.");
                    }
                    // Si el número es 0, el bucle terminará automáticamente
                }
                System.out.println("Programa terminado.");
                break;
            case 3:

        }
    }
    }
