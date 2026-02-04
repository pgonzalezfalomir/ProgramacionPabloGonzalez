package tema4.Colecciones1;

import java.util.*;

public class ColaBanco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Banco> colaBanco = new LinkedList<>();
        int opc;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Añadir a alguien a la cola.");
            System.out.println("2. Quitar al primero de la cola.");
            System.out.println("3. Quitar a alguien de la cola.");
            System.out.println("4. Salir.");
            opc = in.nextInt();
            in.nextLine();

            switch (opc) {
                case 1: // añadir una persona a la cola
                    System.out.println("Introduce el nombre de la persona:");
                    String nombre = in.nextLine();
                    System.out.println("Introduce la edad de la persona:");
                    int edad = in.nextInt();
                    System.out.println("Introduce el DNI de la persona:");
                    in.nextLine();
                    String DNI = in.nextLine();
                    colaBanco.add(new Banco(nombre, edad, DNI));
                    break;
                case 2: // que se vaya el primero de la cola
                    if (colaBanco.isEmpty()) {
                        System.out.println("No hay nadie.");
                    } else {
                        Banco primero = colaBanco.get(0);
                        colaBanco.remove(primero);
                        System.out.println("El primero se ha ido.");
                    }
                    break;
                case 3: // que se vaya de la cola aleatoriamente
                    Random random = new Random();
                    int personaCansada = random.nextInt(colaBanco.toArray().length);
                    System.out.println(colaBanco.get(personaCansada).getNombre() + " se ha cansado de esperar y se ha ido.");
                    colaBanco.remove(personaCansada);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 4);
    }
}