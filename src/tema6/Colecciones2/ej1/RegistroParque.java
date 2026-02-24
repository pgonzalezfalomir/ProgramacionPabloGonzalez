package tema6.Colecciones2.ej1;

import java.util.ArrayList;
import java.util.List;

public class RegistroParque {
    private List<Avistamiento> avistamientos = new ArrayList<>();

    public void anadirAvistamiento(Avistamiento avistamiento) {
        avistamientos.add(avistamiento);
    }

    public void mostrarDesdeLasOcho() {
        System.out.println("Avistamientos desde las 8:00");
        for (Avistamiento a : avistamientos) {
            if (a.getHora() >= 8) {
                System.out.println(a);
            }
        }
    }

    public void mostrarNocturnos() {
        System.out.println("Avistamientos Nocturnos (20:00 a 08:00)");
        for (Avistamiento a : avistamientos) {
            if (a.getHora() >= 20 || a.getHora() < 8) {
                System.out.println(a);
            }
        }
    }

    public void mostrarManadas() {
        System.out.println("Listado de Manadas de Lobos");
        for (Avistamiento a : avistamientos) {
            if (a instanceof ManadasLobos) {
                System.out.println(a);
            }
        }
    }

    public void mostrarSerpientes() {
        System.out.println("Listado de Serpientes");
        for (Avistamiento a : avistamientos) {
            if (a instanceof Serpientes) {
                System.out.println(a);
            }
        }
    }

    public void mostrarPajaros() {
        System.out.println("Listado de Pájaros");
        for (Avistamiento a : avistamientos) {
            if (a instanceof Pajaros) {
                System.out.println(a);
            }
        }
    }
}