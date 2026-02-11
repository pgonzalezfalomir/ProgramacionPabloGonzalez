package tema4.Excepciones;

public class Ejercicio6 {
    public static void main(String[] args) {
        Gato gato1 = new Gato();

        try {
            gato1.setNombre("Tom");
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }

        try {
            gato1.setEdad(2);
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}