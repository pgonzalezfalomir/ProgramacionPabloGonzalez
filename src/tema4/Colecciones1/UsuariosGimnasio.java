package tema4.Colecciones1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsuariosGimnasio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Usuarios> gimnasio = new HashMap<>();
        int opc;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Dar de alta usuarios.");
            System.out.println("2. Dar de baja usuarios.");
            System.out.println("3. Mostrar datos de un usuario.");
            System.out.println("4. Modificar datos de un usuario.");
            System.out.println("5. Salir.");
            opc = in.nextInt();

            switch (opc) {
                case 1: // dar de alta usuario
                    System.out.println("Introduce el DNI del nuevo usuario: ");
                    in.nextLine();
                    String DNI = in.nextLine();
                    if (gimnasio.containsKey(DNI)) {
                        System.out.println("El DNI ya está en uso.");
                    } else {
                        System.out.println("Introduce tu nombre: ");
                        String nombre = in.nextLine();
                        System.out.println("Introduce tu edad: ");
                        int edad = in.nextInt();
                        gimnasio.put(DNI, new Usuarios(nombre, edad, DNI));
                        System.out.println("Usuario dado de alta.");
                    }
                    break;
                case 2: // dar de baja usuario
                    System.out.println("Introduce el DNI del usuario a eliminar: ");
                    in.nextLine();
                    DNI = in.nextLine();
                    if (gimnasio.containsKey(DNI)) {
                        gimnasio.remove(DNI);
                        System.out.println("Usuario eliminado.");
                    } else {
                        System.out.println("El DNI " + DNI + " no está registrado.");
                    }
                    break;
                case 3: // mostrar datos usuario
                    System.out.println("Introduce el DNI del usuario: ");
                    in.nextLine();
                    DNI = in.nextLine();
                    if (gimnasio.containsKey(DNI)) {
                        System.out.println("DNI: " + DNI + ":");
                        System.out.println("Nombre: " + gimnasio.get(DNI).getNombre());
                        System.out.println("Edad: " + gimnasio.get(DNI).getEdad());
                    } else {
                        System.out.println("El DNI " + DNI + " no está registrado.");
                    }
                    break;
                case 4: // modificar datos usuario
                    System.out.println("Introduce el DNI del usuario: ");
                    in.nextLine();
                    DNI = in.nextLine();
                    if (gimnasio.containsKey(DNI)) {
                        System.out.println("Dime el nuevo nombre: ");
                        String nombre = in.nextLine();
                        System.out.println("Dime la nueva edad: ");
                        int edad = in.nextInt();
                        gimnasio.put(DNI, new Usuarios(nombre, edad, DNI));
                    } else {
                        System.out.println("Ese DNI no está registrado.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 5);
    }
}