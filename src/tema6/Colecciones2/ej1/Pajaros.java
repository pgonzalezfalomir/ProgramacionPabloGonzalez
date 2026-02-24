package tema6.Colecciones2.ej1;

public class Pajaros extends Avistamiento {
    private int peso;
    private String especie;

    private final int PESO_DEFAULT = 13;
    private final String ESPECIE_DEFAULT = "Golondrina";

    public Pajaros () {
        this.peso = PESO_DEFAULT;
        this.especie = ESPECIE_DEFAULT;
    }

    public Pajaros (int hora, int peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Pájaros: " + "Peso: " + peso + " Especie: " + especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}