package tema3.Strings;

import java.util.Locale;
import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("¿Qué ejercicio quieres hacer?");
        System.out.println("'a': Función que recibe 1 cadena que la invierte y en mayúsculas:");
        System.out.println("'b': Función que recibe 1 cadena que devuelve el número de vocales:");
        System.out.println("'c': Función que recibe 1 cadena que devuelve la palabra más larga:");
        System.out.println("'d': Función que recibe 2 cadenas que devuelve el número de veces que la segunda cadena está incluida en la primera:");
        System.out.println("'e': Función que recibe 1 cadena que devuelve el número de palabras que contiene:");
        System.out.println("'f': Función que reciba un número de teléfono que devuelva el número de teléfono con el formato (+34)-XXX-XXXXXX:");
        System.out.println("'g': Procedimiento que reciba una cadena que muestre por pantalla el histograma de frecuencias de las vocales:");
        char opc = in.next().charAt(0);

        switch (opc) {
            case 'a':
                System.out.println("Dime la cadena separada por espacios:");
                in.nextLine();
                String cadena = in.nextLine();
                String [] partes = cadena.split(" ");

                for (int i = partes.length - 1; i >= 0; i--) {
                    System.out.println(partes[i].toUpperCase(Locale.ROOT));
                }
                break;
            case 'b':
                System.out.println("Dime la cadena separada por espacios:");
                String cadena2 = in.nextLine();
        }
    }
}
