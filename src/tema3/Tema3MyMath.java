package tema3;

import java.util.Scanner;

public class Tema3MyMath {



    // Funciones EJ 1
    public static double circleArea(double radio) {
        double resultado = 3.14 * (radio * radio);
        return resultado;
    }

    public static double circlePerimeter(double radio) {
        double resultado = 2 * 3.14 * radio;
        return resultado;
    }

    public static double squareArea(double ladocuadrado) {
        double resultado = ladocuadrado * ladocuadrado;
        return resultado;
    }

    public static double squarePerimeter(double ladocuadrado) {
        double resultado = ladocuadrado * 4;
        return resultado;
    }

    public static double rectangleArea(double ladorectangulo, double alturarectangulo) {
        double resultado = ladorectangulo * alturarectangulo;
        return resultado;
    }

    public static double rectanglePerimeter(double ladorectangulo, double alturarectangulo) {
        double resultado = (2 * ladorectangulo) + (2 * alturarectangulo);
        return resultado;
    }

    // Función EJ 2

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean noEsPrimo(int n) {
        return !esPrimo(n);
    }

        // Función EJ 3

    public static int contarDigitos(int num) {
        int contador = 1;
        while (num < 1 || num > 9) {
            num = num / 10;
            contador++;
        }
        return contador;
    }

    // Funcion EJ 4

    public static int contarDigitosPares(int num2) {
        int contador = 0;
        while (num2 > 0) {
            int digito = num2 % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            num2 = num2 / 10;
        }
        return contador;
    }

    // Función EJ 5

    public static int contarDigitosImpares(int num3) {
        int contador = 0;
        while (num3 > 0) {
            int digito = num3 % 10;
            if (digito % 2 != 0) {
                contador++;
            }
            num3 = num3 / 10;
        }
        return contador;
    }

    // Función EJ 6

    public static int calcularFactorial(int num4) {
        int factorial = 1;
        for (int contador = 1; num4 >= contador; contador++) {
            factorial = factorial * contador;
        }
        return factorial;
    }

    // Función EJ 7

    public static int calcularFactorialRecursivo(int num5) {
        int factorial2 = 1;
        if (num5 == 0 || num5 == 1) {
            return 1;
        } else {
            return num5 * calcularFactorialRecursivo(num5 - 1);
        }
    }

    // Función EJ 8

    public static int solucionesEcuacion (int coeficiente1, int coeficiente2, int coeficiente3) {
        int discriminante = coeficiente2 * coeficiente2 - 4 * coeficiente1 * coeficiente3;
        if (discriminante > 0) {
            return 2;
        } else if (discriminante < 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Función EJ 9

    public static int sumaDigitos (int num6) {
        int suma = 0;
        while (num6 > 0) {
            int digito = num6 % 10;
            suma = suma + digito;
            num6 = num6 / 10;
        }
        return suma;
    }

    }

