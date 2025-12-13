package tema3.Strings;

public class CaesarCipher {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();

        String mensaje = "Hola soy Pablo Gonzalez 3910";
        String cifrado = cipher.cifrarCaesar(mensaje);
        String descifrado = cipher.descifrarCaesar(mensaje);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + cifrado);
        System.out.println("Mensaje descifrado: " + descifrado);
    }

    public static String cifrarCaesar (String mensaje) {
        mensaje = mensaje.toUpperCase();
        StringBuilder encrypted = new StringBuilder();

        for (char c : mensaje.toCharArray()) {
            if (c >= 'A' && c <= 'Y') {
                encrypted.append((char) (c + 1));
            } else if (c == 'Z') {
                encrypted.append('A');
            } else if (c >= '0' && c <= '8') {
                encrypted.append((char) (c + 1));
            } else if (c == '9') {
                encrypted.append('0');
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static String descifrarCaesar (String mensaje) {
        mensaje = mensaje.toUpperCase();
        StringBuilder decrypted = new StringBuilder();

        for (char c : mensaje.toCharArray()) {
            if (c >= 'B' && c <= 'Z') {
                decrypted.append((char) (c - 1));
            } else if (c == 'A') {
                decrypted.append('Z');
            } else if (c >= '1' && c <= '9') {
                decrypted.append((char) (c - 1));
            } else if (c == '0') {
                decrypted.append('9');
            } else {
                decrypted.append(c);
            }
        }

        return decrypted.toString();
    }
}
