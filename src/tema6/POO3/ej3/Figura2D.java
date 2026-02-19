package tema6.POO3.ej3;

public abstract class Figura2D {
    protected String nombre;

    protected final String DEFAULT_NOMBRE = "Figura";

    public Figura2D() {
        this.nombre = DEFAULT_NOMBRE;
    }

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }

    public abstract double areaFigura();

    public abstract double perimetroFigura();

    public abstract String toString();

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}