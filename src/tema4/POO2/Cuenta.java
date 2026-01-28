package tema4.POO2;

import java.util.Scanner;

public class Cuenta {
    // Inicialización variables
    String numeroCuenta;
    double saldo;

    private static final String numeroCuentaDefault = "1111222233334444";
    private static final double saldoDefault = 50;

    public Cuenta () { // Constructor vacío
        this.numeroCuenta = numeroCuentaDefault;
        this.saldo = saldoDefault;
    }

    public Cuenta (String numeroCuenta, double saldo) { // Constructor con parámetros
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double mostrarSaldo (double saldo) { // funcion consulta de saldo
        return saldo;
    }

    public double recibirAbonos (double saldo, double extra) { // funcion recibir abonos
        this.saldo = this.saldo + extra;
        return this.saldo;
    }

    public double pagarRecibos (double saldo, double pago) { // funcion pagar recibos
        this.saldo = this.saldo - pago;
        return this.saldo;
    }

    public String getNumeroCuenta () { // Getter numero cuenta
        return numeroCuenta;
    }

    public double getSaldo () { // Getter saldo
        return saldo;
    }

    public void setNumeroCuenta (String numeroCuenta) { // Setter numero cuenta
        Scanner in = new Scanner(System.in);
        while (this.numeroCuenta.length() != 16) {
            System.out.println("Numero de cuenta incorrecto, vuelve a ponerlo");
            this.numeroCuenta = in.nextLine();
        }
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo (double saldo) { // Setter saldo
        this.saldo = saldo;
    }
}