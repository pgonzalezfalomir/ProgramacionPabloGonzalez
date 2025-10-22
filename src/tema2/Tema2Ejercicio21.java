package tema2;

public class Tema2Ejercicio21 {
    public static void main(String[] args) {

        int suma = 0;

        for (int inicio = 2; inicio <= 1000; inicio = inicio + 2) {
            suma = suma + inicio;
        }
        System.out.println(suma);

        System.out.println("El resultado final de la suma es 250500.");
    }
}
