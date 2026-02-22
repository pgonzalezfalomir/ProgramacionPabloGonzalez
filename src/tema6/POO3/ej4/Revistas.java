package tema6.POO3.ej4;

public class Revistas extends Ficha {
    private int numPublicacion;
    private int any;

    private final int NUM_PUBLICACION_DEFAULT = 15;
    private final int ANY_DEFAULT = 1999;

    public Revistas () {
        this.numPublicacion = NUM_PUBLICACION_DEFAULT;
        this.any = ANY_DEFAULT;
    }

    public Revistas (int numero, String titulo, int numPublicacion, int any) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.any = any;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }

    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}
