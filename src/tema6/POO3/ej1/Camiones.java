package tema6.POO3.ej1;

// creacion variable enum
enum tipoMercancia {
    PELIGROSA, NOPELIGROSA
}

public class Camiones extends Vehiculo {
    // inicializacion variables
    private int peso;
    private tipoMercancia mercancia;

    // variables default
    private final int PESO_DEFAULT = 3500;
    private final tipoMercancia TIPO_MERCANCIA_DEFAULT = tipoMercancia.NOPELIGROSA;

    // constructor con parametros
    public Camiones (String marca, String modelo, int any, int peso, tipoMercancia mercancia) {
        super(marca, modelo, any);
        this.peso = peso;
        this.mercancia = mercancia;
    }

    // constructor vacio
    public Camiones () {
        this.peso = PESO_DEFAULT;
        this.mercancia = TIPO_MERCANCIA_DEFAULT;
    }

    // getters y setters
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
