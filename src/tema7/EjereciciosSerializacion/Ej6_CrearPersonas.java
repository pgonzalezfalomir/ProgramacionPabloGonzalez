package tema7.EjereciciosSerializacion;

import java.util.Scanner;

public class Ej6_CrearPersonas {
    public static void main(String[] args) {
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
                    break;
                case 2:
                    fin = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

    public static void menu (){
        System.out.println("Menú: ");
        System.out.println("1. Añadir persona a la lista");
        System.out.println("2. Salir");
    }
}
