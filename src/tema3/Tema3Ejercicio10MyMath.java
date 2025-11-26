package tema3;

import java.util.Scanner;

import static tema3.Tema3MyMath.*;

public class Tema3Ejercicio10MyMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//TODO: procedimiento showMenu()
        System.out.println("¿Que ejercicio quieres hacer?");
        System.out.println("'1': Calcular el perímetro y el área de un círculo, cuadrado y rectángulo");
        System.out.println("'2': Detectar numeros primos o no primos");
        System.out.println("'3': Número de dígitos de un número entero");
        System.out.println("'4': Número de dígitos pares de un número entero");
        System.out.println("'5': Número de dígitos impares de un número entero");
        System.out.println("'6': Calcular factorial");
        System.out.println("'7': Calcular factorial de forma recursiva");
        System.out.println("'8': Número de respuestas de ecuación segundo grado");
        System.out.println("'9': Suma de dígitos de un número entero");
        int opc = in.nextInt();

        switch (opc) {
            case 1:
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
                            //circleArea(radio);
                            System.out.println(circleArea(radio));
                        } else if (opcioncalculocirculo == 2) {
                            //circlePerimeter(radio);
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
                        System.out.println("Introduce solo números positivos.");
                    }
                }
                System.out.println("Programa terminado.");
                break;
            case 3:
                System.out.println("Introduce un número:");
                int num = in.nextInt();
                System.out.println("El número tiene " + Tema3MyMath.contarDigitos(num) + " digitos");
                break;
            case 4:
                System.out.println("Introduce un número:");
                int num2 = in.nextInt();
                System.out.println("El número tiene " + Tema3MyMath.contarDigitosPares(num2) + " dígitos pares");
                break;
            case 5:
                System.out.println("Introduce un número:");
                int num3 = in.nextInt();
                System.out.println("El número tiene " + Tema3MyMath.contarDigitosImpares(num3) + " dígitos impares");
                break;
            case 6:
                System.out.println("Introduce un número:");
                int num4 = in.nextInt();
                System.out.println("El factorial de " + num4 + " es " + Tema3MyMath.calcularFactorial(num4));
                break;
            case 7:
                System.out.println("Introduce un número:");
                int num5 = in.nextInt();
                System.out.println("El factorial calculado de forma recursiva de " + num5 + " es " + Tema3MyMath.calcularFactorialRecursivo(num5));
                break;
            case 8:
                System.out.println("Introduce un coeficiente");
                int coeficiente1 = in.nextInt();
                System.out.println("Introduce otro coeficiente");
                int coeficiente2 = in.nextInt();
                System.out.println("Introduce otro coeficiente");
                int coeficiente3 = in.nextInt();
                System.out.println("La ecuación tiene " + solucionesEcuacion(coeficiente1, coeficiente2, coeficiente3) + " soluciones");
                break;
            case 9:
                System.out.println("Introduce un número:");
                int num6 = in.nextInt();
                System.out.println("La suma de los dígitos de " + num6 + " es " + sumaDigitos(num6));
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }
    }
