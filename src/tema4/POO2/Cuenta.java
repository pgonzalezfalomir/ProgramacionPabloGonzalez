package tema4.POO2;

import java.util.Scanner;

public class Cuenta {
    static Scanner in = new Scanner(System.in);

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

    // instanciar objetos de tipo Cuenta y asociarlo a una persona
    public static void asociarCuenta() {
        Persona p1 = tema4.POO2.Persona.buscarPersona();
        if (p1 != null) {
            System.out.print("Número de cuenta (16 dígitos):");
            String num = in.nextLine();
            while (num.length() != 16) {
                System.out.println("No tiene 16 dígitos, vuelve a poner otro número de cuenta:");
                num = in.nextLine();
            }
            System.out.print("Saldo inicial:");
            double saldo = in.nextDouble();
            p1.anadirCuenta(new Cuenta(num, saldo)); // coje funcion del archivo persona
        }
    }

    // eecibir la nómina mensual de una persona (por dni y núm de cuenta)
    public static void recibirNomina() {
        Persona p1 = tema4.POO2.Persona.buscarPersona();
        if (p1 != null) {
            System.out.print("Número de cuenta:");
            String num = in.nextLine();
            System.out.print("Importe de la nómina:");
            double importe = in.nextDouble();
            in.nextLine();

            for (Cuenta c1 : p1.getCuentas()) {
                if (c1 != null && c1.getNumeroCuenta().equals(num)) {
                    c1.recibirAbono(importe);
                    System.out.println("Nómina ingresada correctamente.");
                    return;
                }
            }
            System.out.println("Cuenta no encontrada.");
        }
    }

    // recibir un pago (por dni y núm de cuenta)
    public static void realizarPago() {
        Persona p1 = tema4.POO2.Persona.buscarPersona();
        if (p1 != null) {
            System.out.print("Número de cuenta:");
            String num = in.nextLine();
            System.out.print("Importe del recibo:");
            double importe = in.nextDouble();
            in.nextLine();

            for (Cuenta c1 : p1.getCuentas()) {
                if (c1 != null && c1.getNumeroCuenta().equals(num)) {
                    c1.pagarRecibo(importe);
                    System.out.println("Pago realizado correctamente.");
                    return;
                }
            }
            System.out.println("Cuenta no encontrada.");
        }
    }

    // realizar transferencia entre cuentas
    public static void realizarTransferencia() {
        System.out.println("Persona Origen:");
        Persona personaOrigen = tema4.POO2.Persona.buscarPersona();
        System.out.println("Persona Destino:");
        Persona personaDestino = tema4.POO2.Persona.buscarPersona();

        if (personaOrigen != null && personaDestino != null) {
            System.out.print("IBAN Origen:");
            String ibanOrigen = in.nextLine();
            System.out.print("IBAN Destino:");
            String ibanDestino = in.nextLine();
            System.out.print("Cantidad a transferir:");
            double cantidad = in.nextDouble();

            Cuenta cuentaOrigen = encontrarCuenta(personaOrigen, ibanOrigen);
            Cuenta cuentaDestino = encontrarCuenta(personaDestino, ibanDestino);

            if (cuentaOrigen != null && cuentaDestino != null && cuentaOrigen.getSaldo() >= cantidad) {
                cuentaOrigen.pagarRecibo(cantidad);
                cuentaDestino.recibirAbono(cantidad);
                System.out.println("Transferencia completada.");
            } else {
                System.out.println("Error: Saldo insuficiente o cuentas inválidas.");
            }
        }
    }

    // imprimir las personas morosas
    public static void listarMorosos() {
        System.out.println("Lista de morosos:");
        for (Persona p1 : tema4.POO2.PruebaCuentas.listaPersonas) {
            if (p1.esMorosa()) {
                System.out.println("- " + p1.getDni());
            } else {
                System.out.println("No hay morosos");
            }
        }
    }


    // metodo para buscar cuenta
    public static Cuenta encontrarCuenta(Persona p1, String iban) {
        for (Cuenta c1 : p1.getCuentas()) {
            if (c1 != null && c1.getNumeroCuenta().equals(iban)) {
                return c1;
            }
        }
        return null;
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
