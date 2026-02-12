package tema4.Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        Gato[] arrayGatos = new Gato[5];

        while (gatos.size() < 5) {
            Gato gato = new Gato();
            try {
                System.out.println("Dime el nombre del gato: ");
                gato.setNombre(in.nextLine());
                System.out.println("DIme la edad del gato: ");
                gato.setEdad(in.nextInt());
                in.nextLine();
                gatos.add(gato);
                System.out.println("Gato guardado.");
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
                in.nextLine();
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
        System.out.println("Lista de gatos guardados.");
        for (Gato listaFinal : gatos) {
            System.out.println("Nombre: " + listaFinal.getNombre());
            System.out.println("Edad: " + listaFinal.getEdad());
        }
    }
}