package tema6.POO3.ej2;

public class Canguro extends Animal {
    private boolean tieneCriaEnBolsa;

    private final boolean TIENE_CRIA_DEFAULT = true;

    public Canguro (String nombre, int edad, double peso, boolean tieneCriaEnBolsa) {
        super(nombre, edad, peso);
        this.tieneCriaEnBolsa = tieneCriaEnBolsa;
    }

    public Canguro () {
        this.tieneCriaEnBolsa = TIENE_CRIA_DEFAULT;
    }

    @Override
    public void hacerRuido () {
        System.out.println("¡Pshhh!");
    }

    // getters y setters
    public boolean isTieneCriaEnBolsa() {
        return tieneCriaEnBolsa;
    }

    public void setTieneCriaEnBolsa(boolean tieneCriaEnBolsa) {
        this.tieneCriaEnBolsa = tieneCriaEnBolsa;
    }
}