package tema6.Colecciones2.ej1;

import java.util.ArrayList;
import java.util.List;

public class RegistroParque {
    private List<Avistamiento> avistamientos = new ArrayList<>();

    public void anadirAvistamiento (Avistamiento avistamiento) {
        avistamientos.add(avistamiento);
    }

    public void mostrarDesdeLasOcho () {
        System.out.println("Avistamientos desde las 8:00:");
    }
}
