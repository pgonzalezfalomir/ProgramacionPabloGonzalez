package tema6.POO3.ej2;

public class Ajolote extends Animal {
    private String color;

    private final String COLOR_DEFAULT = "Rosa";

    public Ajolote (String nombre, int edad, double peso, String color) {
        super(nombre, edad, peso);
        this.color = color;
    }

    public Ajolote () {
        this.color = COLOR_DEFAULT;
    }

    @Override
    public void hacerRuido () {
        System.out.println("¡Plup!");
    }

    // getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}