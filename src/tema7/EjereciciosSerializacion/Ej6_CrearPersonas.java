package tema7.EjereciciosSerializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej6_CrearPersonas {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean fin = false;
        String nombre;
        int edad;
        Persona persona = new Persona();
        while (fin == false){
            menu();
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce un nombre :");
                    nombre = in.nextLine();
                    System.out.println("Introduce la edad: ");
                    edad = in.nextInt();
                    persona = new Persona(nombre, edad);
                    lista.add(persona);
                    break;
                case 2:
                    fin = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/pabgonsot/Documents/ficherosSerializacion/persona.dat"))) {
            oos.writeObject(lista);
            System.out.println("Persona guardada con éxito.");
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex.getMessage());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void menu (){
        System.out.println("Menú: ");
        System.out.println("1. Añadir persona a la lista");
        System.out.println("2. Salir");
    }
}
