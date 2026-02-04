package tema4.POO2;

import java.util.Scanner;

public class Persona {
    static Scanner in = new Scanner(System.in);
    // inicialización
    private String dni;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public Persona(String dni) { // constructor con parámetros
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    // instanciar objetos de tipo Persona
    public static void crearPersona() {
        // comprobacion que haya hueco para la siguiente persona
        if (PruebaCuentas.contadorPersonas < PruebaCuentas.listaPersonas.length) {
            System.out.print("Introduce DNI:");
            String dni = in.nextLine();

            // pone la persona creada en la posicion del contador
            PruebaCuentas.listaPersonas[PruebaCuentas.contadorPersonas] = new Persona(dni);

            // suma 1 contador al crear 1 persona
            PruebaCuentas.contadorPersonas++;

            System.out.println("Persona creada.");
        } else {
            System.out.println("El array está lleno.");
        }
    }

    // mostrar datos de una persona (por su dni)
    public static void mostrarPersona() {
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

    // metodo para buscar persona
    public static Persona buscarPersona() {
        System.out.print("Introduce DNI de la persona:");
        String dni = in.nextLine();

        for (Persona p1 : tema4.POO2.PruebaCuentas.listaPersonas) {
            if (p1.getDni().equalsIgnoreCase(dni)) {
                return p1;
            }
        }
        System.out.println("Persona no encontrada.");
        return null;
    }

    // procedimiento añadir cuentas hasta max de 3
    public void anadirCuenta(Cuenta nuevaCuenta) {
        if (contadorCuentas < 3) {
            this.cuentas[contadorCuentas] = nuevaCuenta;
            this.contadorCuentas++;
            System.out.println("Cuenta añadida.");
        } else {
            System.out.println("Error: Esta persona ya tiene 3 cuentas.");
        }
    }

    // moroso
    public boolean esMorosa() {
        boolean morosa = false;

        for (int i = 0; i < contadorCuentas; i++) {
            if (this.cuentas[i].getSaldo() < 0) {
                morosa = true;
            }
        }
        return morosa;
    }

    // getters y setters
    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
}
