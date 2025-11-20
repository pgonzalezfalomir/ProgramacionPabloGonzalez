package tema3;

import java.util.Scanner;

public class Tema3MyMath {

    public static void main(String[] args) {
    }

    // Funciones EJ 1
        public static double circleArea ( double radio){
            double resultado = 3.14 * (radio * radio);
            return resultado;
        }

        public static double circlePerimeter ( double radio){
            double resultado = 2 * 3.14 * radio;
            return resultado;
        }

        public static double squareArea ( double ladocuadrado){
            double resultado = ladocuadrado * ladocuadrado;
            return resultado;
        }

        public static double squarePerimeter ( double ladocuadrado){
            double resultado = ladocuadrado * 4;
            return resultado;
        }

        public static double rectangleArea ( double ladorectangulo, double alturarectangulo){
            double resultado = ladorectangulo * alturarectangulo;
            return resultado;
        }

        public static double rectanglePerimeter ( double ladorectangulo, double alturarectangulo){
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
    }
