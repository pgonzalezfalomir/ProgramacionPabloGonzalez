package tema6.POO3.ej2;

public class Gato extends Animal {
    private int vidas;

    private final int DEFAULT_VIDAS = 7;

    public Gato (String nombre, int edad, double peso, int vidas) {
        super(nombre, edad, peso);
        this.vidas = vidas;
    }

    public Gato () {
        this.vidas = DEFAULT_VIDAS;
    }

    @Override
    public void hacerRuido () {
        System.out.println("Miau");
    }

    // getters y setters
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}