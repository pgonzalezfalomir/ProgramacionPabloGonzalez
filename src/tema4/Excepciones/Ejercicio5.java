package tema4.Excepciones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean bucleActivo = true;

        while (bucleActivo) {
            System.out.println("Introduce un número:");
            int numero = in.nextInt();
            try {
                imprimePositivo(numero);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

            try {
                imprimeNegativo(numero);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }

            System.out.println("Introduce 'true' para continuar o 'false' para salir.:");
            bucleActivo = in.nextBoolean();
        }

    }

    public static void imprimePositivo (int p) throws Exception {
        if (p < 0) {
            throw new Exception("Número negativo.");
        }
        System.out.println("Número positivo: " + p);
    }

    public static void imprimeNegativo (int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Número positivo o es 0.");
        }
        System.out.println("Número negativo: " + n);
    }
}
