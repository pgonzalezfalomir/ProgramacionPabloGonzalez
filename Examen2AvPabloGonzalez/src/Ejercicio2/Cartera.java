package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cartera {
    private List<IDinero> cartera = new ArrayList<>(10);

    public Cartera (IDinero billete, IDinero billete2, IDinero billete3, IDinero tarjeta, IDinero tarjeta2) {
       this.cartera = cartera;
    }

    public List<IDinero> getCartera() {
        return cartera;
    }

    public void setCartera(List<IDinero> cartera) {
        this.cartera = cartera;
    }

    public void mostrarDinero (Cartera cartera) {
        System.out.println(this.cartera);
    }
}
