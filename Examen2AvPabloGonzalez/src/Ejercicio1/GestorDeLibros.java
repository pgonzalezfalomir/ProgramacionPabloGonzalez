package Ejercicio1;

import java.util.*;

public class GestorDeLibros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Libro> libros = new ArrayList<>();
        int opc;
        String ISBN;
        String nombre = "";
        String autor;

        try {
            do {
                showMenu();
                opc = in.nextInt();
                in.nextLine();

                switch (opc) {
                    case 1:
                        System.out.println("Introduce el ISBN del libro:");
                        ISBN = in.nextLine();
                        System.out.println("Introduce el nombre del libro:");
                        nombre = in.nextLine();
                        System.out.println("Introduce su autor:");
                        autor = in.nextLine();
                        Libro libro = new Libro(ISBN, nombre, autor);
                        libros.add(libro);
                        System.out.println("Libro añadido a la lista.");
                        break;
                    case 2:
                        System.out.println("Introduce el ISBN del libro que buscas:");
                        ISBN = in.nextLine();
                        if (libros.contains(ISBN)) {
                            for (int i = 0; i < libros.size(); i++) {
                                System.out.println(libros.get(i));
                            }
                        } else {
                            System.out.println("Ese ISBN no existe en la lista.");
                        }
                        break;
                    case 3:
                        System.out.println("Introduce el ISBN del libro que buscas:");
                        ISBN = in.nextLine();
                        if (libros.contains(ISBN)) {
                            for (int i = 0; i < libros.size(); i++) {
                                System.out.println(libros.get(i));
                            }
                        } else {
                            System.out.println("Ese ISBN no existe en la lista.");
                        }
                        break;
                    case 4:
                        System.out.println("Dime el nombre del autor:");
                        autor = in.nextLine();
                        if (libros.contains(autor)) {
                            System.out.println(libros.stream());
                        }
                        break;
                    case 5:
                        System.out.println("Has salido del programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta.");
                        break;
                }
            } while (opc != 5);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Programa finalizado");
        }
    }

    public static void showMenu() {
        System.out.println("Menú:");
        System.out.println("1. Introducir libro");
        System.out.println("2. Mostrar información de un libro (por ISBN)");
        System.out.println("3. Modificar el género de un libro (por ISBN)");
        System.out.println("4. Buscar todos los libros de un autor");
        System.out.println("5. Salir");
    }
}
