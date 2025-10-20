package tema2;

public class Tema2Ejercicio27 {
    public static void main(String[] args) {

        int num = 2;
        int contPrimo = 0;

        while (contPrimo < 20) {
            boolean esPrimo = true;

            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(num);
                contPrimo++;
            }

            num++;

        }
    }
}