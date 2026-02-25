package Ejercicio3;

public abstract class Articulo {
    protected String nombre;
    protected boolean gratis;

    private final String NOMBRE_DEFAULT = "Nombre";
    private final boolean GRATIS_DEFAULT = false;

    public Articulo () {
        this.nombre = NOMBRE_DEFAULT;
        this.gratis = GRATIS_DEFAULT;
    }

    public Articulo (String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public abstract void tipoArticulo ();

    public abstract int precioArticulo ();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }
}
