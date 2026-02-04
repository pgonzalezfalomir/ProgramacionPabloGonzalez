package tema4.Colecciones1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listaCompra = new LinkedHashSet<>();
        int opc;

        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir producto a la lista");
            System.out.println("2. Salir");
            opc = in.nextInt();
            String producto;

            switch (opc) {
                case 1:
                    System.out.println("Dime el producto que quieres añadir:");
                    in.nextLine();
                    producto=(in.nextLine());

                    if (listaCompra.contains(producto)) {
                        System.out.println("El producto ya está en la lista.");
                    } else {
                        listaCompra.add(producto);
                        System.out.println("Has añadido el producto a la lista.");
                    }
                    break;
                case 2:
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opc != 2);
    }
}