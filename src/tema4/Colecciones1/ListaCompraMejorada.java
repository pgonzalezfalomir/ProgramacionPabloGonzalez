package tema4.Colecciones1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompraMejorada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listaCompra = new LinkedHashSet<>();
        Set<String> carroCompra = new LinkedHashSet<>();
        int opc;

        do {
            System.out.println("Menú:");
            System.out.println("1. Añadir producto a la lista.");
            System.out.println("2. Pasar producto de la lista al carro.");
            System.out.println("3. Ver productos que faltan (union).");
            System.out.println("4. Ver productos en el carro.");
            System.out.println("5. Salir.");
            opc = in.nextInt();
            in.nextLine();

            String producto;

            switch (opc) {
                case 1:
                    System.out.println("Introduce el producto que quieres añadir a la lista:");
                    producto = in.nextLine();

                    if (listaCompra.contains(producto)) {
                        System.out.println("El producto ya está en la lista.");
                    } else {
                        listaCompra.add(producto);
                        System.out.println("Has añadido el producto a la lista.");
                    }
                    break;
                case 2:
                    System.out.println("Dime el producto que quieres añadir al carro:");
                    producto = in.nextLine();

                    if (carroCompra.contains(producto)) {
                        System.out.println("El producto ya está en el carro.");
                    } else {
                        carroCompra.add(producto);
                        System.out.println("Has añadido el producto al carro.");
                        listaCompra.remove(producto);
                        System.out.println("Producto eliminado de la lista.");
                    }
                    break;
                case 3:
                    Set<String> productosRestantes = new LinkedHashSet<>(listaCompra);
                    productosRestantes.removeAll(carroCompra);

                    if (productosRestantes.isEmpty()) {
                        System.out.println("No falta nada por añadir al carrito.");
                    } else {
                        System.out.println("Productos que faltan por comprar: " + productosRestantes);
                    }
                    break;
                case 4:
                    System.out.println("Productos en el carro: " + carroCompra);
                    break;
                case 5:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opc != 5);
    }
}