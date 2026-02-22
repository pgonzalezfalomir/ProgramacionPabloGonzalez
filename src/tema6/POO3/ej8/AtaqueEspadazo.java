package tema6.POO3.ej8;

public class AtaqueEspadazo implements IAtaqueAvanzado {
    private int esfuerzoFisico;
    private int danoFisico;

    private final int ESFUERZO_FISICO_DEFAULT = 5;
    private final int DANO_FISICO_DEFAULT = 50;

    public AtaqueEspadazo () {
        this.esfuerzoFisico = ESFUERZO_FISICO_DEFAULT;
        this.danoFisico = DANO_FISICO_DEFAULT;
    }

    public AtaqueEspadazo (int esfuerzoFisico, int danoFisico) {
        this.esfuerzoFisico = esfuerzoFisico;
        this.danoFisico = danoFisico;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado un espadazo.");
    }

    @Override
    public int coste() {
        return esfuerzoFisico;
    }

    @Override
    public int danoInfligido() {
        return danoFisico;
    }

    public int getEsfuerzoFisico() {
        return esfuerzoFisico;
    }

    public void setEsfuerzoFisico(int esfuerzoFisico) {
        this.esfuerzoFisico = esfuerzoFisico;
    }

    public int getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(int danoFisico) {
        this.danoFisico = danoFisico;
    }
}
