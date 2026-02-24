package tema6.Colecciones2.ej1;

public class ManadasLobos extends Avistamiento {
    private int numeroLobos;
    private String observaciones;

    private final int NUMERO_LOBOS_DEFAULT = 3;
    private final String OBSERVACIONES_DEFAULT = "Son 3 lobos de color gris.";

    public ManadasLobos () {
        this.numeroLobos = NUMERO_LOBOS_DEFAULT;
        this.observaciones = OBSERVACIONES_DEFAULT;
    }

    public ManadasLobos (int hora, int numeroLobos, String observaciones) {
        super(hora);
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Manada de lobos: " + "Número de lobos: " + numeroLobos + ", Observaciones: " + observaciones;
    }

    public int getNumeroLobos() {
        return numeroLobos;
    }

    public void setNumeroLobos(int numeroLobos) {
        this.numeroLobos = numeroLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}