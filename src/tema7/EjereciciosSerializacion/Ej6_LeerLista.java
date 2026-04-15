package tema7.EjereciciosSerializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej6_LeerLista {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/home/pabgonsot/Documents/ficherosSerializacion/persona.dat");
             ObjectInputStream salida = new ObjectInputStream(fis)) {
            Persona p1 = (Persona) salida.readObject();
            System.out.println("Nombre: " + p1.getNombre() + "\n" + "Edad: " + p1.getEdad());
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}