package tema6.POO3.ej3;

public abstract class Figura2D {
    // inicializar atributos clase padre
    protected String nombre;

    // atributos default clase padre
    protected final String DEFAULT_NOMBRE = "Figura";

    // constructor vacio
    public Figura2D() {
        this.nombre = DEFAULT_NOMBRE;
    }

    // constructor con parametros
    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    // creacion métodos abstractos clase padre
    public abstract double areaFigura();

    public abstract double perimetroFigura();

    // metodo toString
    public abstract String toString();

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}