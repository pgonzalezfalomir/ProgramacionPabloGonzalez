package tema6.Colecciones2.ej1;

public class Main {
    public static void main(String[] args) {
        RegistroParque registro = new RegistroParque();

        registro.anadirAvistamiento(new Serpientes(21, 120, "Víbora")); // Nocturno
        registro.anadirAvistamiento(new Pajaros(10, 50, "Gorrión"));    // Diurno
        registro.anadirAvistamiento(new ManadasLobos(2, 6, "Alfa liderando")); // Nocturno

        registro.mostrarNocturnos();
        registro.mostrarPajaros();
    }
}