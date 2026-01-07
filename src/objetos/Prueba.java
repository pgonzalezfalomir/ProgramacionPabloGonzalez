package objetos;

public class Prueba {
    String nombre;
    int edad;
    static final int edadDefecto = 0;

    public Prueba() { // constructor vacío
        this.nombre = "Pablo";
        this.edad = edadDefecto;
    }
    public Prueba(String nombre) { // constructor nombre
        this.nombre = nombre;
        this.edad = edadDefecto;
    }
    public Prueba(String nombre, int edad) { // constructor nombre y edad
        this.nombre = nombre;
        this.edad = edad;
    }
    public void saludar() {
        System.out.println("¡Hola!");
    }

    public void presentarme() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }

    public void saludarA (String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public static void showInfo () {
        System.out.println("Las personas tienen nombre y edad.");
    }

    public String getNombre() { // getNombre
        return nombre;
    }

    public void setNombre(String nombre) { // setNombre
        this.nombre = nombre;
    }

    public int getEdad() { // getEdad
        return edad;
    }

    public void setEdad(int edad) { // setNombre
        if (edad < 0) {
            this.edad = edad;
        }
    }
}
