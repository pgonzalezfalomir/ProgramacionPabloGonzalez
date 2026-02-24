package tema6.Colecciones2.ej1;

public abstract class Avistamiento {
    protected int hora;

    private final int HORA_DEFAULT = 19;

    public Avistamiento () {
        this.hora = HORA_DEFAULT;
    }

    public Avistamiento (int hora) {
        this.hora = hora;
    }

    public abstract String toString();

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}