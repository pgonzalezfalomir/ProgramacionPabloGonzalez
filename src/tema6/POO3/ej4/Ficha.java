package tema6.POO3.ej4;

public class Ficha {
    // inicialización variables
    protected int numero;
    protected String titulo;

    // vaiables default
    private final int NUMERO_DEFAULT = 1;
    private final String TITULO_DEFAULT = "Título";

    // constructor vacío
    public Ficha () {
        this.numero = NUMERO_DEFAULT;
        this.titulo = TITULO_DEFAULT;
    }

    // constructor con parámetros
    public Ficha (int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public String toString () {
        return "Título: " + titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
