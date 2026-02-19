package tema6.POO3.ej2;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;

    private final int EDAD_DEFAULT = 5;
    private final double PESO_DEFAULT = 20;

    public Animal () {
        this.nombre = "Perro";
        this.edad = EDAD_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Animal (String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public void comer () {
        System.out.println("Ñam");
    }

    public void dormir () {
        System.out.println("Zzz...");
    }

    public abstract void hacerRuido();

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}