package Ejercicio3;

enum Tipo {
    POKEBALL, GREATBALL, ULTRABALL
}

public class Pokebola extends Articulo {
    private Tipo tipoPokeball;

    private final Tipo TIPO_POKEBALL_DEFAULT = Tipo.ULTRABALL;

    public Pokebola () {
        super();
        this.tipoPokeball = TIPO_POKEBALL_DEFAULT;
    }

    public Pokebola (String nombre, boolean gratis, Tipo tipoPokeball) {
        super(nombre, gratis);
        this.tipoPokeball = tipoPokeball;
    }

    @Override
    public void tipoArticulo() {
        System.out.println("Este articulo es una Pokeball.");
    }

    @Override
    public int precioArticulo() {
        if (tipoPokeball == Tipo.POKEBALL) {
            return 2;
        } else if (tipoPokeball == Tipo.GREATBALL) {
            return 5;
        } else {
            return 10;
        }
    }

    public Tipo getTipoPokeball() {
        return tipoPokeball;
    }

    public void setTipoPokeball(Tipo tipoPokeball) {
        this.tipoPokeball = tipoPokeball;
    }
}
