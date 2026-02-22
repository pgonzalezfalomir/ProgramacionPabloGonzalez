package tema6.POO3.ej8;

public class AtaqueBolaFuego implements IAtaqueAvanzado {
    private int costeMana;
    private int danoMagico;

    private final int COSTE_MANA_DEFAULT = 3;
    private final int DANO_MAGICO_DEFAULT = 30;

    public AtaqueBolaFuego () {
        this.costeMana = COSTE_MANA_DEFAULT;
        this.danoMagico = DANO_MAGICO_DEFAULT;
    }

    public AtaqueBolaFuego (int costeMana, int danoMagico) {
        this.costeMana = costeMana;
        this.danoMagico = danoMagico;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado una bola de fuego.");
    }

    @Override
    public int coste() {
        return costeMana;
    }

    @Override
    public int danoInfligido() {
        return danoMagico;
    }

    public int getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(int costeMana) {
        this.costeMana = costeMana;
    }

    public int getDanoFisico() {
        return danoMagico;
    }

    public void setDanoFisico(int danoMagico) {
        this.danoMagico = danoMagico;
    }
}
