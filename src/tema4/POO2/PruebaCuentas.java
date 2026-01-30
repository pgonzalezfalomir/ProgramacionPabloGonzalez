package tema4.POO2;

import java.util.Scanner;
import java.util.ArrayList;

public class PruebaCuentas {
    private static final Scanner in = new Scanner(System.in);
    private static final ArrayList<Persona> listaPersonas = new ArrayList<>();

    public static void main(String[] args) {
        int opc;
        do {
            System.out.println("Menú:");
            System.out.println("1. Instanciar Persona");
            System.out.println("2. Asociar Cuenta a Persona");
            System.out.println("3. Mostrar datos de Persona");
            System.out.println("4. Recibir Nómina (Abono)");
            System.out.println("5. Realizar Pago (Recibo)");
            System.out.println("6. Transferencia entre cuentas");
            System.out.println("7. Listar Morosos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opc = in.nextInt();
            in.nextLine();

            switch (opc) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    asociarCuenta();
                    break;
                case 3:
                    mostrarPersona();
                    break;
                case 4:
                    recibirNomina();
                    break;
                case 5:
                    realizarPago();
                    break;
                case 6:
                    realizarTransferencia();
                    break;
                case 7:
                    listarMorosos();
                    break;
            }
        } while (opc != 0);
    }

    // instanciar objetos de tipo Persona
    private static void crearPersona() {
        System.out.print("Introduce DNI:");
        String dni = in.nextLine();
        listaPersonas.add(new Persona(dni));
        System.out.println("Persona creada.");
    }

    // instanciar objetos de tipo Cuenta y asociarlo a una persona
    private static void asociarCuenta() {
        Persona p1 = buscarPersona();
        if (p1 != null) {
            System.out.print("Número de cuenta (16 dígitos):");
            String num = in.nextLine();
            System.out.print("Saldo inicial:");
            double saldo = in.nextDouble();
            p1.anadirCuenta(new Cuenta(num, saldo));
        }
    }

    // mostrar datos de una persona (por su dni)
    private static void mostrarPersona() {
        Persona p1 = buscarPersona();
        if (p1 != null) {
            System.out.println("DNI:" + p1.getDni());
            System.out.println("Cuentas asociadas:");
            for (Cuenta c1 : p1.getCuentas()) {
                if (c1 != null) {
                    System.out.println("IBAN:" + c1.getNumeroCuenta() + " | Saldo:" + c1.getSaldo() + "€");
                }
            }
        }
    }

    // eecibir la nómina mensual de una persona (por dni y núm de cuenta)
    private static void recibirNomina() {
        Persona p1 = buscarPersona();
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
    private static void realizarPago() {
        Persona p1 = buscarPersona();
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
    private static void realizarTransferencia() {
        System.out.println("Persona Origen:");
        Persona personaOrigen = buscarPersona();
        System.out.println("Persona Destino:");
        Persona personaDestino = buscarPersona();

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
    private static void listarMorosos() {
        System.out.println("Lista de morosos:");
        for (Persona p1 : listaPersonas) {
            if (p1.esMorosa()) {
                System.out.println("- " + p1.getDni());
            }
        }
    }

    // metodo para buscar persona
    private static Persona buscarPersona() {
        System.out.print("Introduce DNI de la persona:");
        String dni = in.nextLine();
        for (Persona p : listaPersonas) {
            if (p.getDni().equalsIgnoreCase(dni)) {
                return p;
            }
        }
        System.out.println("Persona no encontrada.");
        return null;
    }

    // metodo para buscar cuenta
    private static Cuenta encontrarCuenta(Persona p1, String iban) {
        for (Cuenta c1 : p1.getCuentas()) {
            if (c1 != null && c1.getNumeroCuenta().equals(iban)) {
                return c1;
            }
        }
        return null;
    }
}