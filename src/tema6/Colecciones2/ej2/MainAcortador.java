package tema6.Colecciones2.ej2;

public class MainAcortador {
    public static void main(String[] args) {
        AcortadorURL miAcortador = new AcortadorURL();

        String link1 = miAcortador.acortar("https://es.wikipedia.org/wiki/Wikipedia");
        String link2 = miAcortador.acortar("https://www.google.com");

        System.out.println("Link generado 1: " + link1);
        System.out.println("Link generado 2: " + link2);

        miAcortador.mostrarTodos();

        System.out.println("Resolviendo dirección...");
    }
}