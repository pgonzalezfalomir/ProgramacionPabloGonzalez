package tema6.Colecciones2.ej1;

public class Serpientes extends Avistamiento {
    private int longitud;
    private String especie;

    private final int LONGITUD_DEFAULT = 13;
    private final String ESPECIE_DEFAULT = "Cobra";

    public Serpientes () {
        this.longitud = LONGITUD_DEFAULT;
        this.especie = ESPECIE_DEFAULT;
    }

    public Serpientes (int hora, int longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Serpiente: " + "Longitud: " + longitud + " Especie: " + especie;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}