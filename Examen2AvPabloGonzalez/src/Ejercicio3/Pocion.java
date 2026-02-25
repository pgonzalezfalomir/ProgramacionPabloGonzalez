package Ejercicio3;

public class Pocion extends Articulo {
    private int nivel;
    private String [] efectos = new String[5];

    private final int NIVEL_DEFAULT = 1;

    public Pocion () {
        super();
        this.nivel = NIVEL_DEFAULT;
    }

    public Pocion (String nombre, boolean gratis, int nivel) {
        super(nombre, gratis);
        this.nivel = nivel;
    }

    @Override
    public void tipoArticulo() {
        System.out.println("Este objeto es una poción.");
    }

    @Override
    public int precioArticulo() {
        return 5;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getEfectos() {
        return efectos;
    }

    public void setEfectos(String[] efectos) {
        this.efectos = efectos;
    }
}
