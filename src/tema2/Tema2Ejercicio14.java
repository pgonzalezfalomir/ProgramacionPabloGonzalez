package tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuántas personas sois?");
        double personas = in.nextDouble();
        System.out.println("¿Cuántos noches os quedaís?");
        double noches = in.nextDouble();

        double precio = personas * noches * 15;
        double precio2 = personas * noches * 15 * 0.25;

        //juntar estos 2 ifs en uno (||)
        if (personas < 6 || personas > 5 && noches < 7) {
            System.out.println("El precio de la instancia en total es = " + precio);
        }
        if (personas > 5 && noches >= 7) {
            System.out.println("El precio de la instancia en total con el descuento por ser más de 5 personas y quedarse una semana o más es = " + precio2);
        }

    }
}
