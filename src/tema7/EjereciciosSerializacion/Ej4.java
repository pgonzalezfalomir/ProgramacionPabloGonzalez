package tema7.EjereciciosSerializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ej4 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Agustin", 20);
        try (FileOutputStream fos = new FileOutputStream("/home/pabgonsot/Documents/ficherosSerializacion/persona.dat");
             ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(p1);
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}