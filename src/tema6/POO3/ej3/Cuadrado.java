package tema6.POO3.ej3;

public class Cuadrado extends Figura2D{
    // inicializar atributos
    private double longitud;

    // atributos default
    private final double LONGITUD_DEFAULT = 4;

    // constructor vacio
    public Cuadrado () {
        super();
        this.longitud = LONGITUD_DEFAULT;
    }

    // constructor con parametros
    public Cuadrado (String nombre, double longitud) {
        super(nombre);
        this.longitud = longitud;
    }

    // llamada a los métodos clase padre
    @Override
    public double areaFigura () {
        double area = longitud * longitud;
        return area;
    }

    @Override
    public double perimetroFigura() {
        double perimetro = longitud * 4;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    // getters and setters
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}