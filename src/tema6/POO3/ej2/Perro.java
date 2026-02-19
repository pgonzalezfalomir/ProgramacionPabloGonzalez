package tema6.POO3.ej2;

public class Perro extends Animal {
    private String raza;

    public Perro (String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public Perro () {
        this.raza = "Rottweiler";
    }

    @Override
    public void hacerRuido () {
        System.out.println("Guau");
    }

    public String getRaza() {
        return raza;
    }

    // getters y setters
    public void setRaza(String raza) {
        this.raza = raza;
    }
}