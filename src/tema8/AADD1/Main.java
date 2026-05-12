package tema8.AADD1;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;
        do {
            showMenu();
            opc = in.nextInt();
            in.nextLine();

            switch (opc) {
                case 1:
                    case1Main();
                    break;
                case 2:
                    case2Main();
                    break;
                case 3:
                    case3Main();
                    break;
                case 4:
                    case4Main();
                    break;
                case 5:
                    case5Main();
                    break;
                case 6:
                    PilotsCRUD.showPilotClassification();
                    break;
                case 7:
                    PilotsCRUD.showBuildersClassification();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opc != 0);
    }

    public static void showMenu() {
        System.out.println("Menú: (0 para salir)");
        System.out.println("1. CreatePilot:");
        System.out.println("2. ReadPilot:");
        System.out.println("3. ReadPilots:");
        System.out.println("4. UpdatePilot:");
        System.out.println("5. DeletePilot:");
        System.out.println("6. ShowPilotClassification:");
        System.out.println("7. ShowBuildersClassification:");
    }

    public static void case1Main () {
        Piloto p1 = new Piloto();
        System.out.println("Introduce el driverid del piloto:");
        p1.setDriverID(in.nextInt());
        in.nextLine();
        System.out.println("Introduce el code del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el nombre del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el apellido del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el dob (AAAA-MM-DD) del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce la nacionalidad del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el constructorid del piloto:");
        p1.setConstructorid(in.nextInt());
        in.nextLine();
        System.out.println("Introduce la url del piloto:");
        p1.setCode(in.nextLine());
        PilotsCRUD.createPilot(p1);
    }

    public static void case2Main () {
        System.out.println("Introduce el driverid del piloto que buscas:");
        int driverid = in.nextInt();
        PilotsCRUD.readPilot(driverid);
    }

    public static void case3Main () {
        List<Piloto> listaPilotos = PilotsCRUD.readPilots();
        for (Piloto p1 : listaPilotos) {
            System.out.println("ID: " + p1.getDriverID());
            System.out.println("Code: " + p1.getCode());
            System.out.println("Forename: " + p1.getForename());
            System.out.println("Surname: " + p1.getSurname());
            System.out.println("Dob: " + p1.getDob());
            System.out.println("Nationality: " + p1.getNationality());
            System.out.println("Constructor ID: " + p1.getConstructorid());
            System.out.println("URL: " + p1.getUrl());
        }
    }

    public static void case4Main () {
        Piloto p1 = new Piloto();
        System.out.println("Introduce el driverid del piloto:");
        p1.setDriverID(in.nextInt());
        in.nextLine();
        System.out.println("Introduce el code del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el nombre del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el apellido del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el dob (AAAA-MM-DD) del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce la nacionalidad del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el constructorid del piloto:");
        p1.setConstructorid(in.nextInt());
        in.nextLine();
        System.out.println("Introduce la url del piloto:");
        p1.setCode(in.nextLine());
        PilotsCRUD.updatePilot(p1);
    }

    public static void case5Main () {
        Piloto p1 = new Piloto();
        System.out.println("Introduce el driverid del piloto:");
        p1.setDriverID(in.nextInt());
        in.nextLine();
        System.out.println("Introduce el code del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el nombre del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el apellido del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el dob (AAAA-MM-DD) del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce la nacionalidad del piloto:");
        p1.setCode(in.nextLine());
        System.out.println("Introduce el constructorid del piloto:");
        p1.setConstructorid(in.nextInt());
        in.nextLine();
        System.out.println("Introduce la url del piloto:");
        p1.setCode(in.nextLine());
        PilotsCRUD.deletePilot(p1);
    }
}