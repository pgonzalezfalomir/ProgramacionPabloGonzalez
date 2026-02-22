package tema6.POO3.ej7;

public class AtaqueMagicoFisico implements IAtaque {
    private int ataqueMagicoFisico;
    private int coste;

    private final int ATAQUE_MAGICOFISICO_DEFAULT = 50;
    private final int COSTE_DEFAULT = 5;

    public AtaqueMagicoFisico () {
        this.ataqueMagicoFisico = ATAQUE_MAGICOFISICO_DEFAULT;
        this.coste = COSTE_DEFAULT;
    }

    public AtaqueMagicoFisico (int ataqueMagicoFisico, int coste) {
        this.ataqueMagicoFisico = ataqueMagicoFisico;
        this.coste = coste;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado un ataque mágico y otro físico.");
    }

    @Override
    public int coste() {
        return coste;
    }

    @Override
    public int danoInfligido() {
        return ataqueMagicoFisico;
    }

    public int getAtaqueMagicoFisico() {
        return ataqueMagicoFisico;
    }

    public void setAtaqueMagicoFisico(int ataqueMagicoFisico) {
        this.ataqueMagicoFisico = ataqueMagicoFisico;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}