package tema6.Colecciones2.ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AcortadorURL {
    private Map<String, String> baseDatos = new HashMap<>();
    private final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private final int LONGITUD_CLAVE = 5;
    private Random random = new Random();

    public String acortar(String urlLarga) {
        String clave;
        do {
            clave = generarCadenaAleatoria();
        } while (baseDatos.containsKey(clave));

        baseDatos.put(clave, urlLarga);
        return "https://acortar.link/" + clave;
    }

    public String resolver(String clave) {
        if (baseDatos.containsKey(clave)) {
            return baseDatos.get(clave);
        } else {
            return "Error: La clave '" + clave + "' no existe.";
        }
    }

    public boolean borrar(String clave) {
        if (baseDatos.containsKey(clave)) {
            baseDatos.remove(clave);
            return true;
        }
        return false;
    }

    public void mostrarTodos() {
        if (baseDatos.isEmpty()) {
            System.out.println("No hay URLs registradas.");
        } else {
            System.out.println("\n--- Listado de URLs Acortadas ---");
            for (Map.Entry<String, String> entrada : baseDatos.entrySet()) {
                System.out.println("Código: " + entrada.getKey() + " -> URL: " + entrada.getValue());
            }
        }
    }

    private String generarCadenaAleatoria() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LONGITUD_CLAVE; i++) {
            int indice = random.nextInt(CARACTERES.length());
            sb.append(CARACTERES.charAt(indice));
        }
        return sb.toString();
    }
}