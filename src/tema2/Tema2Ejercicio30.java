package tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {

        double num2 = 0;
        double resultado = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el operador (+, - , * , / , % o 's' para salir)");
        char op = in.next().charAt(0);

        // Bucle principal
        while (op != 's' && op != 'S') {
            System.out.println("Introduce un número:");
            double num = in.nextDouble();
            switch (op) {
                case '+':
                    System.out.println("Introduce otro número:");
                    num2 = in.nextDouble();
                    resultado = num + num2;
                    break;
                case '-':
                    System.out.println("Introduce otro número:");
                    num2 = in.nextDouble();
                    resultado = num - num2;
                    break;
                case '*':
                    System.out.println("Introduce otro número:");
                    num2 = in.nextDouble();
                    resultado = num * num2;
                    break;
                case '/':
                    System.out.println("Introduce otro número:");
                    num2 = in.nextDouble();
                    resultado = num / num2;
                    break;
                case '%':
                    System.out.println("Introduce otro número:");
                    num2 = in.nextDouble();
                    resultado = num % num2;
                    break;
                default:
                    System.out.println("Operador no válido. Intenta de nuevo.");
                    break;
            }

            System.out.println("El resultado es: " + resultado);
            System.out.println("Introduce el operador (+, - , * , / , % o 's' para salir)");
            op = in.next().charAt(0);
        }

        System.out.println("Gracias por usar el programa");
        in.close();
    }
}
