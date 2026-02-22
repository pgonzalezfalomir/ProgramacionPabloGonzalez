package tema6.POO3.ej7;

public class AtaqueFisico implements IAtaque{
    private int ataqueFisico;
    private int coste;

    private final int ATAQUE_FISICO_DEFAULT = 30;
    private final int COSTE_DEFAULT = 3;

    public AtaqueFisico () {
        this.ataqueFisico = ATAQUE_FISICO_DEFAULT;
        this.coste = COSTE_DEFAULT;
    }

    public AtaqueFisico (int ataqueFisico, int coste) {
        this.ataqueFisico = ataqueFisico;
        this.coste = coste;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado un ataque físico.");
    }

    @Override
    public int coste() {
        return coste;
    }

    @Override
    public int danoInfligido() {
        return ataqueFisico;
    }

    public int getAtaqueFisico() {
        return ataqueFisico;
    }

    public void setAtaqueFisico(int ataqueFisico) {
        this.ataqueFisico = ataqueFisico;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}