package tema6.POO3.ej1;

// creacion variable enum
enum tipoUso {
    PROFESIONAL, PARTICULAR
}

public class Turismo extends Vehiculo {
    // inicializacion variables
    private int numPlazas;
    private tipoUso tipo;

    // variables default
    private final int NUM_PLAZA_DEFAULT = 4;
    private final tipoUso PROFESIONAL_DEFAULT = tipoUso.PROFESIONAL;

    // constructor con parametros
    public Turismo (String marca, String modelo, int any, int numPlazas, tipoUso tipo) {
        super(marca, modelo, any);
        this.numPlazas = numPlazas;
        this.tipo = tipo;
    }

    // constructor vacio
    public Turismo () {
        this.numPlazas = NUM_PLAZA_DEFAULT;
        this.tipo = PROFESIONAL_DEFAULT;
    }

    // getters y setters
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
}