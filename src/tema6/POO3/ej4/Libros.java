package tema6.POO3.ej4;

public class Libros extends Ficha {
    private String autor;
    private String editorial;

    private final String AUTOR_DEFAULT = "J.K. Rowling";
    private final String EDITORIAL_DEFAULT = "Grupo Planeta";

    public Libros () {
        this.autor = AUTOR_DEFAULT;
        this.editorial = EDITORIAL_DEFAULT;
    }

    public Libros (int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
