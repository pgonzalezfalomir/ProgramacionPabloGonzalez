package tema6.POO3.ej3;

public class Triangulo extends Figura2D{
    // inicializar atributos
    private double base;
    private double lado1;
    private double lado2;
    private double altura;

    // atributos default
    private final double BASE_DEFAULT = 9;
    private final double LADO1_DEFAULT = 4;
    private final double LADO2_DEFAULT = 4;
    private final double ALTURA_DEFAULT = 9;

    // constructor vacio
    public Triangulo () {
        this.base = BASE_DEFAULT;
        this.lado1 = LADO1_DEFAULT;
        this.lado2 = LADO2_DEFAULT;
        this.altura = ALTURA_DEFAULT;
    }

    // constructor con parametros
    public Triangulo (String nombre, double base, double lado1, double lado2, double altura) {
        super(nombre);
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    // llamada a los métodos clase padre
    @Override
    public double areaFigura() {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double perimetroFigura() {
        double perimetro;
        perimetro = lado1 + lado2 + base;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }

    // getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
