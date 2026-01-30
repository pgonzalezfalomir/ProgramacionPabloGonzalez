package tema4.POO2;

public class Cuenta {
    // inicialización
    private String numeroCuenta;
    private double saldo;

    // inicialización por defecto
    private static final String CUENTA_POR_DEFECTO = "1111222233334444";
    private static final double SALDO_POR_DEFECTO = 50.0;

    public Cuenta() { // constructor vacío
        this.numeroCuenta = CUENTA_POR_DEFECTO;
        this.saldo = SALDO_POR_DEFECTO;
    }

    public Cuenta(String numeroCuenta, double saldo) { // constructor con parámetros
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // función consulta saldo
    public double consultarSaldo() {
        return this.saldo;
    }

    // procedimiento recibir abono
    public void recibirAbono(double cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            System.out.println("Tu nuevo saldo es: " + this.saldo + "$");
        }
    }

    // procedimiento pagar recibo
    public void pagarRecibo(double importe) {
        if (importe <= this.saldo) {
            this.saldo = this.saldo - importe;
        } else {
            System.out.println("Error: Saldo insuficiente para pagar el recibo.");
        }
    }

    // getters y setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta.length() == 16) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Error: El número de cuenta debe tener 16 dígitos.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}