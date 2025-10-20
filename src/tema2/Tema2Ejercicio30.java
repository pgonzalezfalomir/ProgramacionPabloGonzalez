package tema2;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {

        char continuar = 's';

        while (continuar == 's') {

            Scanner in = new Scanner(System.in);
            System.out.println("Introduce un número:");
            double n1 = in.nextDouble();

            System.out.println("Introduce una operación (+, -, *, / o %):");
            char operador = in.next().charAt(0);

            switch (operador) {
                case '+':
                    System.out.println("Introduce otro número:");
                    double n2 = in.nextDouble();
                    double res_suma = n1 + n2;
                    System.out.println(n1 + " - " + n2 + " = " + res_suma);
                    break;
                case '-':
                    System.out.println("Introduce otro numero:");
                    double n3 = in.nextDouble();
                    double res_resta = n1 - n3;
                    System.out.println(n1 + " - " + n3 + " = " + res_resta);
                    break;
                case '*':
                    System.out.println("Introduce otro numero:");
                    double n4 = in.nextDouble();
                    double res_mult = n1 * n4;
                    System.out.println(n1 + " * " + n4 + " = " + res_mult);
                    break;
                case '/':
                    System.out.println("Introduce otro numero:");
                    double n5 = in.nextDouble();
                    double res_div = n1 / n5;
                    System.out.println(n1 + " / " + n5 + " = " + res_div);
                    break;
                case '%':
                    System.out.println("Introduce otro numero:");
                    double n6 = in.nextDouble();
                    double res_resto = n1 % n6;
                    System.out.println(n1 + " % " + n6 + " = " + res_resto);
                    break;
            }
            System.out.println("¿Quieres hacer otra operación? (s)");
            continuar = in.next().charAt(0);
        }
    }
}
