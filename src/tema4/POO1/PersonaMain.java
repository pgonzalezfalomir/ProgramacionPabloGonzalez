package tema4.POO1;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu DNI:");
        Persona persona = new Persona(in.nextLine());
        System.out.println("Dime tu nombre:");
        persona.setNombre(in.nextLine());
        System.out.println("Dime tu primer apellido:");
        persona.setApellido1(in.nextLine());
        System.out.println("Dime tu segundo apellido:");
        persona.setApellido2(in.nextLine());
        System.out.println("Dime tu edad:");
        persona.setEdad(in.nextInt());
        System.out.println(persona.isAdult());
        System.out.println(persona.isRetired());
        System.out.println(Persona.checkDNI());
        persona.print();
        System.out.println(persona.toString());

        System.out.println("Dime tu DNI:");
        in.nextLine();
        Persona persona2 = new Persona(in.nextLine());
        System.out.println("Dime tu nombre:");
        persona2.setNombre(in.nextLine());
        System.out.println("Dime tu primer apellido:");
        persona2.setApellido1(in.nextLine());
        System.out.println("Dime tu segundo apellido:");
        persona2.setApellido2(in.nextLine());
        System.out.println("Dime tu edad:");
        persona2.setEdad(in.nextInt());
        System.out.println(persona2.isAdult());
        System.out.println(persona2.isRetired());
        System.out.println(Persona.checkDNI());
        persona2.print();
        System.out.println(persona2.toString());
        System.out.println("La diferencia de edad entre las 2 personas es de: " + Persona.ageDiference(persona.edad, persona2.edad));
    }
}
