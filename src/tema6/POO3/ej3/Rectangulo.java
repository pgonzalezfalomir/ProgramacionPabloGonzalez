package tema6.POO3.ej3;

public class Rectangulo extends Figura2D{
    // inicializar atributos
    private double base;
    private double altura;

    // atributos default
    private final double BASE_DEFAULT = 8;
    private final double ALTURA_DEFAULT = 4;

    // constructor vacio
    public Rectangulo () {
        super();
        this.base = BASE_DEFAULT;
        this.altura = ALTURA_DEFAULT;
    }

    // constructor con parametros
    public Rectangulo (String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // llamada a los métodos clase padre
    @Override
    public double areaFigura () {
        double area = base * altura;
        return area;
    }

    @Override
    public double perimetroFigura () {
        double perimetro = 2 * (base * altura);
        return perimetro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    // getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
