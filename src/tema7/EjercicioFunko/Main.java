package tema7.EjercicioFunko;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        GestionFunkos gestor = new GestionFunkos();
        gestor.cargarDatos();

        int opcion;
        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                    ejecutarAlta(gestor);
                    break;
                case 2:
                    ejecutarBaja(gestor);
                    break;
                case 3:
                    mostrarTodos(gestor);
                    break;
                case 4:
                    System.out.println("El más caro es: " + gestor.obtenerMasCaro());
                    break;
                case 5:
                    System.out.printf("Media de precio: %.2f€\n", gestor.obtenerMediaPrecio());
                    break;
                case 6:
                    System.out.println("Funkos ordenados por modelo:");
                    Map<String, List<Funko>> mapa = gestor.agruparPorModelos();

                    if (mapa.isEmpty()) {
                        System.out.println("No hay datos para agrupar.");
                    } else {
                        for (String modelo : mapa.keySet()) {
                            System.out.println("Modelo : " + modelo);

                            List<Funko> listaPorModelo = mapa.get(modelo);
                            for (Funko funko1 : listaPorModelo) {
                                System.out.println("  -> " + funko1.getNombre() + " | Precio: " + funko1.getPrecio() + "€");
                            }
                        }
                    }
                    break;
                case 7:
                    mostrarLanzamientos2023(gestor);
                    break;
                case 0:
                    gestor.guardarDatos();
                    System.out.println("Datos guardados. Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    public static int mostrarMenu() {
        System.out.println("Menú de gestión de funkos: ");
        System.out.println("1. Añadir funko");
        System.out.println("2. Borrar funko");
        System.out.println("3. Mostrar todos");
        System.out.println("4. Funko más caro");
        System.out.println("5. Media de precios");
        System.out.println("6. Agrupar por modelos");
        System.out.println("7. Funkos de 2023");
        System.out.println("0. Salir y Guardar");
        System.out.print("Introduce una opción: ");
        int opcion = in.nextInt();
        in.nextLine();
        return opcion;
    }

    public static void ejecutarAlta(GestionFunkos gestor) {
        System.out.print("Nombre: ");
        String nombre = in.nextLine();
        System.out.print("Modelo: ");
        String modelo = in.nextLine();
        System.out.print("Precio: ");
        double precio = in.nextDouble(); in.nextLine();
        System.out.print("Fecha (AAAA-MM-DD): ");
        String fechaLanzamiento = in.nextLine();

        String miCodigo = "codigo" + (gestor.getLista().size() + 1);
        gestor.anadir(new Funko(miCodigo, nombre, modelo, precio, fechaLanzamiento));
        System.out.println("Añadido como: " + miCodigo);
    }

    public static void ejecutarBaja(GestionFunkos gestor) {
        System.out.print("Nombre a borrar: ");
        String nombre = in.nextLine();
        if (gestor.borrar(nombre)) System.out.println("Nombre borrado");
        else System.out.println("Nombre no encontrado.");
    }

    public static void mostrarTodos(GestionFunkos gestor) {
        System.out.println("Listado de funkos: ");
        for (Funko funko1 : gestor.getLista()) {
            System.out.println(funko1);
        }
    }

    public static void mostrarLanzamientos2023(GestionFunkos gestor) {
        System.out.println("Lanzamientos del 2023: ");
        List<Funko> lista = gestor.obtenerFunkos2023();
        if (lista.isEmpty()) {
            System.out.println("No hay funkos lanzados en 2023.");
        }
        else {
            for (Funko funko1 : lista) {
                System.out.println(funko1);
            }
        }
    }
}