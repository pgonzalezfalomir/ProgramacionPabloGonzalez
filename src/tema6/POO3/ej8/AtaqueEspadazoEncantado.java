package tema6.POO3.ej8;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado {
    private int costeTotal;
    private int danoTotal;

    private final int COSTE_TOTAL_DEFAULT = 8;
    private final int DANO_TOTAL_DEFAULT = 80;

    public AtaqueEspadazoEncantado () {
        this.costeTotal = COSTE_TOTAL_DEFAULT;
        this.danoTotal = DANO_TOTAL_DEFAULT;
    }

    public AtaqueEspadazoEncantado (int costeTotal, int danoTotal) {
        this.costeTotal = costeTotal;
        this.danoTotal = danoTotal;
    }

    @Override
    public void lanzar() {
        System.out.println("Has lanzado un espadazo encantado.");
    }

    @Override
    public int coste() {
        return costeTotal;
    }

    @Override
    public int danoInfligido() {
        return danoTotal;
    }

    public int getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(int costeTotal) {
        this.costeTotal = costeTotal;
    }

    public int getDanoTotal() {
        return danoTotal;
    }

    public void setDanoTotal(int danoTotal) {
        this.danoTotal = danoTotal;
    }
}