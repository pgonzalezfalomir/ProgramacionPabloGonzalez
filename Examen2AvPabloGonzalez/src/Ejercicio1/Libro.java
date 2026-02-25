package Ejercicio1;

enum Formato {
    TAPA_DURA, TAPA_BLANDA, BOLSILLO
}

public class Libro {
    // atributos
    public String ISBN;
    public String nombre;
    public String autor;
    public int numPaginas;
    public String genero;
    public Formato formato;
    private int peso;

    // defaults
    public final String ISBN_DEFAULT = "";
    public final String NOMBRE_DEFAULT = "Nombre";
    public final String AUTOR_DEFAULT = "Autor";
    public final int NUM_PAGINAS_DEFAULT = 223;
    public final String GENERO_DEFAULT = "Drama";
    public final Formato FORMATO_DEFAULT = Formato.TAPA_DURA;

    // vacio
    public Libro (String ISBN, String nombre, String autor) {
        this.ISBN = ISBN_DEFAULT;
        this.nombre = NOMBRE_DEFAULT;
        this.autor = AUTOR_DEFAULT;
        this.numPaginas = NUM_PAGINAS_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.formato = FORMATO_DEFAULT;
    }

    // 3 parametros
    public Libro (String nombre, String autor, Formato formato) {
        this.nombre = nombre;
        this.autor = autor;
        this.formato = formato;
    }

    // parametros
    public Libro (String ISBN, String nombre, String autor, int numPaginas, String genero, Formato formato, int peso) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.formato = formato;
        this.peso = peso;
    }

    // metodos
    public int pesoEnGramos () {
        int pesoTapaDura;
        int pesoTapaBlanda;
        int pesoBolsillo;
        if (formato == Formato.TAPA_DURA) {
            pesoTapaDura = 2 * numPaginas + 50;
            return pesoTapaDura;
        } else if (formato == Formato.TAPA_BLANDA) {
            pesoTapaBlanda = 2 * numPaginas + 20;
            return pesoTapaBlanda;
        } else {
            pesoBolsillo = numPaginas + 10;
            return pesoBolsillo;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Autor: " + autor + ", Peso: " + pesoEnGramos();
    }

    // getters y setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
