package tema4.POO2;

public class Persona {
    // inicialización
    private String dni;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    public Persona(String dni) { // constructor con parámetros
        this.dni = dni;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
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
        for (int i = 0; i < contadorCuentas; i++) {
            if (this.cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }

    // getters y setters
    public String getDni() {
        return dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }
}