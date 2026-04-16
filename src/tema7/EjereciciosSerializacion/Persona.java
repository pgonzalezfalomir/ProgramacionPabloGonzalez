package tema7.EjereciciosSerializacion;
import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = -9099538961411651763L;

    protected String nombre;
    protected int edad;

    private final String NOMBRE_DEFAULT = "Pablo";
    private final int EDAD_DEFAULT = 19;

    public Persona() {
        this.nombre = NOMBRE_DEFAULT;
        this.edad = EDAD_DEFAULT;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString () {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

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
        this.edad = edad;
    }
}