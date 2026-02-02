package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    private static final Scanner in = new Scanner(System.in);
    static Persona[] listaPersonas = new Persona[10];
    static int contadorPersonas = 0;

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
                    tema4.POO2.Persona.crearPersona();
                    break;
                case 2:
                    tema4.POO2.Cuenta.asociarCuenta();
                    break;
                case 3:
                    tema4.POO2.Persona.mostrarPersona();
                    break;
                case 4:
                    tema4.POO2.Cuenta.recibirNomina();
                    break;
                case 5:
                    tema4.POO2.Cuenta.realizarPago();
                    break;
                case 6:
                    tema4.POO2.Cuenta.realizarTransferencia();
                    break;
                case 7:
                    tema4.POO2.Cuenta.listarMorosos();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opc != 0);
    }
}
