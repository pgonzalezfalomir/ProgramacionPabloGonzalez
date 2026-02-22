package tema6.POO3.ej7;

public class AtaqueMagico implements IAtaque{
    private int ataqueMagico;
    private int coste;

    private final int ATAQUE_MAGICO_DEFAULT = 20;
    private final int COSTE_DEFAULT = 2;

    public AtaqueMagico () {
        this.ataqueMagico = ATAQUE_MAGICO_DEFAULT;
        this.coste = COSTE_DEFAULT;
    }

    public AtaqueMagico (int ataqueMagico, int coste) {
        this.ataqueMagico = ataqueMagico;
        this.coste = coste;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado un ataque mágico.");
    }

    @Override
    public int coste() {
        return coste;
    }

    @Override
    public int danoInfligido() {
        return ataqueMagico;
    }

    public int getAtaqueMagico() {
        return ataqueMagico;
    }

    public void setAtaqueMagico(int ataqueMagico) {
        this.ataqueMagico = ataqueMagico;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}