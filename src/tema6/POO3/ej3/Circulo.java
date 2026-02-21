package tema6.POO3.ej3;

public class Circulo extends Figura2D{
    // inicializar atributos
    private double radio;
    private final double NUM_PI = 3.14159265359;

    // atributos default
    private final double RADIO_DEFAULT = 5;

    // constructor vacio
    public Circulo () {
        this.radio = RADIO_DEFAULT;
    }

    // constructor con parametros
    public Circulo (String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // llamada a los métodos clase padre
    @Override
    public double areaFigura() {
        double area;
        area = NUM_PI * (radio * radio);
        return area;
    }

    @Override
    public double perimetroFigura() {
        double perimetro;
        perimetro = 2 * NUM_PI * radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    // getters y setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
