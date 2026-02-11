package tema4.Excepciones;

public class Gato {
    private String nombre;
    private int edad;

    public Gato () {
        this.nombre = "Bobby";
        this.edad = 5;
    }

    public Gato (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String imprimir() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("La longitud del nombre tiene que ser de mínimo 3 caracteres.");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad <= 0) {
            throw new Exception("La edad no puede ser 0 o inferior");
        } else {
            this.edad = edad;
        }
    }
}