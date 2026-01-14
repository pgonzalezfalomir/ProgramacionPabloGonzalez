package tema4;

import java.util.Scanner;

public class Persona {
    final String DNI;
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    boolean isAdult;
    boolean checkDNI;
    private static final int adultAge = 18;
    private static final int retiredAge = 65;

    public Persona() { // Constructor vacío
        this.DNI = "12345678A";
        this.nombre = "Pablo";
        this.apellido1 = "González";
        this.apellido2 = "Soto";
        this.edad = 20;
    }

    public Persona(String DNI, String nombre, String apellido1, String apellido2, int edad) { // Constructor parámetros
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public Persona(String DNI) { // Constructor DNI
        this.DNI = DNI;
    }

    public String isAdult() {
        if (edad >= adultAge) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }

    public String isRetired() {
        if (edad > retiredAge) {
            return "Esta jubilado";
        } else {
            return "No esta jubilado";
        }
    }

    public static String checkDNI() {
        char letraCorrecta = ' ';
        Scanner in = new Scanner(System.in);
        System.out.println("Dime los números del DNI:");
        int numDNI = in.nextInt();
        int resto = numDNI % 23;
        System.out.println("Dime la letra de tu DNI:");
        char letraDNI = in.next().toUpperCase().charAt(0);
        if (letraDNI == 'I' || letraDNI == 'O' || letraDNI == 'U' || letraDNI == 'Ñ') {
            return "Es falso";
        } else {
            switch (resto) {
                case 0:
                    letraCorrecta = 'T';
                    break;
                case 1:
                    letraCorrecta = 'R';
                    break;
                case 2:
                    letraCorrecta = 'W';
                    break;
                case 3:
                    letraCorrecta = 'A';
                    break;
                case 4:
                    letraCorrecta = 'G';
                    break;
                case 5:
                    letraCorrecta = 'M';
                    break;
                case 6:
                    letraCorrecta = 'Y';
                    break;
                case 7:
                    letraCorrecta = 'F';
                    break;
                case 8:
                    letraCorrecta = 'P';
                    break;
                case 9:
                    letraCorrecta = 'D';
                    break;
                case 10:
                    letraCorrecta = 'X';
                    break;
                case 11:
                    letraCorrecta = 'B';
                    break;
                case 12:
                    letraCorrecta = 'N';
                    break;
                case 13:
                    letraCorrecta = 'J';
                    break;
                case 14:
                    letraCorrecta = 'Z';
                    break;
                case 15:
                    letraCorrecta = 'S';
                    break;
                case 16:
                    letraCorrecta = 'Q';
                    break;
                case 17:
                    letraCorrecta = 'V';
                    break;
                case 18:
                    letraCorrecta = 'H';
                    break;
                case 19:
                    letraCorrecta = 'L';
                    break;
                case 20:
                    letraCorrecta = 'C';
                    break;
                case 21:
                    letraCorrecta = 'K';
                    break;
                case 22:
                    letraCorrecta = 'E';
                    break;
            }
            if (letraCorrecta == letraDNI) {
                return "Es válido";
            } else {
                return "Es falso";
            }
        }
    }

    public void print() {
        System.out.println("Esta persona se llama: " + nombre + " " + apellido1 + " " + apellido2 + ", con edad " + edad + ", y DNI " + DNI);
    }

    public String toString() { // print
        return "La información de la persona es: " + nombre + " " + apellido1 + " " + apellido2 + ", " + edad + ", " + DNI;
    }

    public static int ageDiference(int edad, int edad2) {
        if (edad > edad2) {
            return (edad - edad2);
        } else {
            return (edad2 - edad);
        }
    }

    public String getDNI() { // Getter DNI
        return DNI;
    }

    public String getNombre() { // Getter Nombre
        return nombre;
    }

    public String getApellido1() { // Getter Apellido1
        return apellido1;
    }

    public String getApellido2() { // Getter Apellido2
        return apellido2;
    }

    public int getEdad() { // Getter Edad
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
