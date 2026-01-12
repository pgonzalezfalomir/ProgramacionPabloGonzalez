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
        in.nextLine();

        switch (opc) {
            case 'a':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena = in.nextLine();
                System.out.println("Tu cadena invertida es: " + stringMayusuclaInvertida(cadena));
                break;
            case 'b':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena2 = in.nextLine();
                System.out.println("Tu cadena tiene " + contarVocales(cadena2) + " vocales.");
                break;
            case 'c':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena3 = in.nextLine();
                System.out.println("La palabra más larga de tu cadena es: " + mayorLongitud(cadena3));
                break;
            case 'd':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena4 = in.nextLine();
                System.out.println("Dame otra cadena separada por espacios:");
                String cadena5 = in.nextLine();
                System.out.println("La cadena '" + cadena5 + "' aparece " + repeticionCadena(cadena4, cadena5) + " veces en la primera cadena.");
                break;
            case 'e':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena6 = in.nextLine();
                System.out.println("La cadena tiene " + contadorPalabras(cadena6) + " palabras.");
                break;
            case 'f':
                System.out.println("Dame el número de teléfono en formato 34555332211");
                String cadena7 = in.nextLine();
                System.out.println(conversorTelefono(cadena7));
                break;
            case 'g':
                System.out.println("Dame una cadena separada por espacios:");
                String cadena8 = in.nextLine();
                histogramaVocales(cadena8);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    // Función case a
    public static String stringMayusuclaInvertida (String cadena) {
        String mayusculas = cadena.toUpperCase();
        String invertida = "";
        int longitud = mayusculas.length();

        for (int i = longitud - 1; i >= 0; i--) {
            char caracter = mayusculas.charAt(i);
            invertida = invertida + caracter;
        }
        return invertida;
    }

    // Función case b
    public static int contarVocales (String cadena2) {
        int vocales = 0;
        for (int i = 0; i < cadena2.length(); i++) {
            char caracter = cadena2.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
                vocales++;
            }
        }
        return vocales;
    }

    // Función case c
    public static String mayorLongitud (String cadena3) {
        String [] palabras = cadena3.split(" ");
        String palabraMasLarga = "";

        for (int i = 0; i < palabras.length; i++) {
            String palabraActual = palabras[i];
            if (palabraActual.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraActual;
            }
        }
        return palabraMasLarga;
        }

    // Función case d
    public static int repeticionCadena (String cadena4, String cadena5) {
        int contador = 0;
        int index = 0;
        while ((index = cadena4.indexOf(cadena5, index)) != -1) {
            contador++;
            index += cadena5.length();
        }
        return contador;
    }

    // Funcion case e
    public static int contadorPalabras (String cadena6) {
        String[] palabras = cadena6.split(" ");
        return palabras.length;
    }

    // Funcion case f
    public static String conversorTelefono (String cadena7) {
        String numeroPais = cadena7.substring(0,2);
        String parte1 = cadena7.substring(2, 5);
        String parte2 = cadena7.substring(5);
        return "(+" + numeroPais + ")-" + parte1 + "-" + parte2;
    }

    // Funcion case g
    public static void histogramaVocales (String cadena8) {
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        cadena8 = cadena8.toLowerCase();

        for (int i = 0; i < cadena8.length(); i++) {
            char c = cadena8.charAt(i);
            if (c == 'a') {
                contadorA++;
            }
            if (c == 'e') {
                contadorE++;
            }
            if (c == 'i') {
                contadorI++;
            }
            if (c == 'o') {
                contadorO++;
            }
            if (c == 'u') {
                contadorU++;
            }
        }

        System.out.println("a " + contadorA + " " + "*".repeat(contadorA));
        System.out.println("e " + contadorE + " " + "*".repeat(contadorE));
        System.out.println("i " + contadorI + " " + "*".repeat(contadorI));
        System.out.println("o " + contadorO + " " + "*".repeat(contadorO));
        System.out.println("u " + contadorU + " " + "*".repeat(contadorU));
    }
    }
