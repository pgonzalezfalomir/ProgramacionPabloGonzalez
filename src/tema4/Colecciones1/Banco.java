package tema4.Colecciones1;

public class Banco {
    // inicialización
    private String nombre;
    private int edad;
    private String DNI;

    // inicialización defaults
    private static final int DEFAULT_AGE = 20;

    // constructor vacío
    public Banco () {
        this.nombre = "Pablo";
        this.edad = DEFAULT_AGE;
        this.DNI = "12345678A";
    }

    // constructor con parámetros
    public Banco (String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 1 || edad > 100) {
            this.edad = DEFAULT_AGE;
        } else {
            this.edad = edad;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}