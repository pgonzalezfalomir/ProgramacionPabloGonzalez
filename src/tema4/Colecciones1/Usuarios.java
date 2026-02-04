package tema4.Colecciones1;

public class Usuarios {
    // inicializacion
    private String nombre;
    private int edad;

    private static final int DEFAULT_AGE = 20;

    // constructor vacío
    public Usuarios () {
        this.nombre = "Pablo";
        this.edad = 19;
    }

    // constructor con parámetros
    public Usuarios (String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
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
}
