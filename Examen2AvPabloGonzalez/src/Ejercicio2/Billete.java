package Ejercicio2;

public class Billete implements IDinero {
    public int valor;

    private final int VALOR_DEFAULT = 5;

    public Billete () {
        this.valor = VALOR_DEFAULT;
    }

    public Billete (int valor) {
        this.valor = valor;
    }

    @Override
    public void valor() {
        System.out.println("El valor del billete es: " + valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}