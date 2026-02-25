package Ejercicio3;

import java.util.*;

public class TiendaPokemonTPV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Articulo> ticket = new LinkedList<>();
        int precioRestante = 0;
        int opc;
        try {
            do {
                showMenu();
                opc = in.nextInt();
                in.nextLine();

                switch (opc) {
                    case 1:
                        Articulo pocion = new Pocion();
                        ticket.add(pocion);
                        System.out.println("Poción añadida correctamente al ticket.");
                        precioRestante = precioRestante + 5;
                        break;
                    case 2:
                        Articulo pokebola = new Pokebola();
                        System.out.println("Que tipo de Pokebola quieres añadir? (POKEBALL), (GREATBALL) o (ULTRABALL)");
                        String tipo = in.nextLine();
                        if (tipo == "POKEBALL") { // Es posible que diga que es incorrecto, si vuelves a probar funciona
                            precioRestante = precioRestante + 2;
                        } else if (tipo == "GREATBALL") {  // Es posible que diga que es incorrecto, si vuelves a probar funciona
                            precioRestante = precioRestante + 5;
                        } else if (tipo == "ULTRABALL") {  // Es posible que diga que es incorrecto, si vuelves a probar funciona
                            precioRestante = precioRestante + 10;
                        } else {
                            System.out.println("Tipo incorrecto, vuelve a intentarlo:");
                            tipo = in.nextLine();
                        }
                        ticket.add(pokebola);
                        System.out.println("Pokebola añadida correctamente al ticket.");
                        break;
                    case 3:
                        Articulo accesorio = new Accesorio();
                        ticket.add(accesorio);
                        System.out.println("Accesorio añadido correctamente al ticket.");
                        precioRestante = precioRestante + 5;
                        break;
                    case 4:
                        System.out.println("Qué posición quieres borrar?");
                        int posicionEliminar = in.nextInt();
                        ticket.remove(posicionEliminar);
                        System.out.println("Posición " + posicionEliminar + " eliminada correctamente del ticket.");
                        break;
                    case 5:
                        System.out.println("Ticket: ");
                        for (Articulo mostrarTicket : ticket) {
                            System.out.println(mostrarTicket);
                        }
                        break;
                    case 6:
                        int total = precioRestante;
                        System.out.println("El total es: " + precioRestante);
                        break;
                    case 7:
                        System.out.println("Has salido del programa");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            } while (opc != 7);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        }

    }

    public static void showMenu() {
        System.out.println("Menú:");
        System.out.println("1. Añadir poción al ticket");
        System.out.println("2. Añadir pokebola al ticket");
        System.out.println("3. Añadir accesorio al ticket");
        System.out.println("4. Borrar el artículo del ticket (por posición en el ticket)");
        System.out.println("5. Mostrar todos los artículos del ticket");
        System.out.println("6. Mostrar total");
        System.out.println("7. Salir");
    }
}
