package tema7.EjereciciosSerializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ej6_LeerLista {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/home/pabgonsot/Documents/ficherosSerializacion/persona.dat");
             ObjectInputStream entrada = new ObjectInputStream(fis)) {
            ArrayList<Persona> listaRecuperada = (ArrayList<Persona>) entrada.readObject();
            for (Persona p1 : listaRecuperada) {
                System.out.println("Nombre: " + p1.getNombre() + "\n" + "Edad: " + p1.getEdad());
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}