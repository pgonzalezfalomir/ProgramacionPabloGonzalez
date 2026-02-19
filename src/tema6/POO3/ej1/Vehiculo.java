package tema6.POO3.ej1;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int any;

    public Vehiculo () {
        this.marca = "Ford";
        this.modelo = "Fiesta";
        this.any = 1990;
    }

    public Vehiculo (String marca, String modelo, int any) {
        this.marca = marca;
        this.modelo = modelo;
        this.any = any;
    }

    // getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}