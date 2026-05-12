package tema8;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Operaciones ops = new Operaciones();

    public static void main(String[] args) {
        int opc;
        do {
            showMenu();
            opc = in.nextInt();
            in.nextLine();

            switch (opc) {
                case 1:
                    listarAsignaturas();
                    break;
                case 2:
                    gestionEstudiantesPorCasa();
                    break;
                case 3:
                    gestionMascotaEstudiante();
                    break;
                case 4:
                    ops.devolverNumeroEstudiantesPorCasa();
                    break;
                case 5:
                    ops.insertarNuevaAsignatura();
                    break;
                case 6:
                    gestionModificarAula();
                    break;
                case 7:
                    ops.eliminarAsignatura();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 0);
    }

    public static void showMenu() {
        System.out.println("Menú (0 para salir del programa):");
        System.out.println("1. Listado de todas las asignaturas");
        System.out.println("2. Consulta estudiantes por casa");
        System.out.println("3. Mascota de un estudiante específico");
        System.out.println("4. Número de estudiantes de todas las casas");
        System.out.println("5. Insertar una nueva asignatura");
        System.out.println("6. Modificar el aula de una asignatura");
        System.out.println("7. Eliminar una asignatura");
    }

    public static void listarAsignaturas() {
        List<Asignatura> listaLeida = Operaciones.listarAsignaturas();
        for (Asignatura a : listaLeida) {
            System.out.println(a.getNombreAsignatura() + " (" + a.getAula() + ")");
        }
    }

    public static void gestionEstudiantesPorCasa() {
        System.out.println("Dime el nombre de la casa:");
        String casa = in.nextLine();
        Operaciones.mostrarEstudiantesPorCasa(casa);
    }

    public static void gestionMascotaEstudiante() {
        System.out.println("Dime el nombre:");
        String nombre = in.nextLine();
        System.out.println("Dime el apellido:");
        String apellido = in.nextLine();
        ops.mostrarMascotaPorEstudiante(nombre, apellido);
    }

    public static void gestionModificarAula() {
        System.out.println("Dime el nombre del nuevo aula:");
        String nombreAula = in.nextLine();
        ops.modificarAulaAsignatura(nombreAula);
    }
}