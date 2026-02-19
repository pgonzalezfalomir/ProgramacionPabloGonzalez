package tema6.POO3.ej1;

public class Ciclomotores extends Vehiculo {
    // inicializacion variables
    private int cilindrada;

    // variables default
    private final int CILINDRADA_DEFAULT = 100;

    // constructor con parametros
    public Ciclomotores(String marca, String modelo, int any, int cilindrada) {
        super(marca, modelo, any);
        this.cilindrada = cilindrada;
    }

    public Ciclomotores() {
        this.cilindrada = CILINDRADA_DEFAULT;
    }

    public boolean necesitaCarnet(int cilindrada) {
        boolean necesitaCarnet = false;
        if (cilindrada >= 125) {
            necesitaCarnet = true;
        }
        return necesitaCarnet;
    }

    // getters y setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}