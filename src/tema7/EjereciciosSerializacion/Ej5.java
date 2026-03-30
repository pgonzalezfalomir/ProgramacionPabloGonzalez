package tema7;

import java.io.*;

public class Ej5 {
    public static void main(String[] args) {
        File fichero = new File("/home/pabgonsot/Documents/ficherosSerializacion/persona.dat");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            Persona p1 = (Persona) ois.readObject();
            System.out.println("Persona: " + p1);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}