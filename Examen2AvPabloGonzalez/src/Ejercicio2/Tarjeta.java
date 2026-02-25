package Ejercicio2;

public class Tarjeta implements IDinero {
    private String numero;
    private double saldo;
    private double credito;

    private final String NUMERO_DEFAULT = "";
    private final double SALDO_DEFAULT = 20;
    private final double CREDITO_DEFAULT = 10;

    public Tarjeta () {
        this.numero = NUMERO_DEFAULT;
        this.saldo = SALDO_DEFAULT;
        this.credito = CREDITO_DEFAULT;
    }

    public Tarjeta (String numero, double saldo, double credito) {
        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;
    }

    @Override
    public void valor() {
        double total = saldo + credito;
        System.out.println("El total de dinero es: " + total);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}