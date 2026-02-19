package tema6.POO3.ej2;

public class Pajaro extends Animal {
    private int alas;

    private final int DEFAULT_ALAS = 2;

    public Pajaro (String nombre, int edad, double peso, int alas) {
        super(nombre, edad, peso);
        this.alas = alas;
    }

    public Pajaro () {
        this.alas = DEFAULT_ALAS;
    }

    @Override
    public void hacerRuido () {
        System.out.println("Pío pío");
    }

    public int getAlas() {
        return alas;
    }

    // getters y setters
    public void setAlas(int alas) {
        this.alas = alas;
    }
}