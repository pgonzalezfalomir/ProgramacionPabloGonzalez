package tema6.POO3.ej4;

enum tipo {
    ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
}

public class DVD extends Ficha {
    private String director;
    private int any;
    private tipo tipoDVD;

    private final String DIRECTOR_DEFAULT = "Maria Peters";
    private final int ANY_DEFAULT = 1990;
    private final tipo TIPO_DEFAULT = tipo.DOCUMENTAL;

    public DVD () {
        this.director = DIRECTOR_DEFAULT;
        this.any = ANY_DEFAULT;
        this.tipoDVD = TIPO_DEFAULT;
    }

    public DVD (int numero, String titulo, String director, int any, tipo tipoDVD) {
        super(numero, titulo);
        this.director = director;
        this.any = any;
        this.tipoDVD = tipoDVD;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}
