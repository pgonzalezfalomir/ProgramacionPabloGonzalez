package tema8;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Operaciones ops = new Operaciones();
    public static void main(String[] args) {
        showMenu();
        int opc = in.nextInt();
        switch (opc) {
            case 1:
                listarAsignaturas();
                break;
            case 2:
                System.out.println("Dime el nombre de la casa:");
                String casa = in.nextLine();
                Operaciones.mostrarEstudiantesPorCasa(casa);
                break;
            case 3:
                System.out.println("Dime el nombre:");
                String nombre = in.nextLine();
                System.out.println("Dime el apellido:");
                String apellido = in.nextLine();
                Operaciones.mostrarMascotaPorEstudiante(nombre, apellido);
                break;
            case 4:
                Operaciones.devolverNumeroEstudiantesPorCasa();
                break;
            case 5:
                Operaciones.insertarNuevaAsignatura();
                break;
            case 6:
                System.out.println("Dime el nombre del aula:");
                String nombreAula = in.nextLine();
                Operaciones.modificarAulaAsignatura(nombreAula);
                break;
            case 7:
                Operaciones.eliminarAsignatura();
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public static void showMenu() {
        System.out.println("Menú (0 para salir):");
        System.out.println("1. Listado de todas las asignaturas:");
        System.out.println("2. Consulta estudiantes por casa:");
        System.out.println("3. Mascota de un estudiante específico:");
        System.out.println("4. Número de estudiantes de todas las casas:");
        System.out.println("5. Insertar una nueva asignatura:");
        System.out.println("6. Modificar el aula de una asignatura:");
        System.out.println("7. Eliminar una asignatura:");
    }

    public static void listarAsignaturas() {
        List<Asignatura> listaLeida = ops.listarAsignaturas();
    }
}
