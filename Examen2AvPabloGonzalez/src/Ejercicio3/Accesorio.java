package Ejercicio3;

public class Accesorio extends Articulo {
    private String nombreAccesorio;

    private final String NOMBRE_ACCESORIO_DEFAULT = "Accesorio";

    public Accesorio () {
        super();
        this.nombre = NOMBRE_ACCESORIO_DEFAULT;
    }

    public Accesorio (String nombre, boolean gratis, String nombreAccesorio) {
        super(nombre, gratis);
        this.nombreAccesorio = nombreAccesorio;
    }

    @Override
    public void tipoArticulo() {
        System.out.println("Este objeto es un accesorio.");
    }

    @Override
    public int precioArticulo() {
        return 7;
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }
}
