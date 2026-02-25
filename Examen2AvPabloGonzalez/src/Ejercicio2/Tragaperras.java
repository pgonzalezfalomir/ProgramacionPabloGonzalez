package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Tragaperras {
    public static void main(String[] args) {
        List<IDinero> listaDinero = new ArrayList<>();
        IDinero billete = new Billete(5);
        IDinero billete2 = new Billete(10);
        IDinero billete3 = new Billete(5);
        IDinero tarjeta = new Tarjeta("1234", 50.23, 20.46);
        IDinero tarjeta2 = new Tarjeta("4321", 40.32, 12.03);

        Cartera cartera = new Cartera (billete, billete2, billete3, tarjeta, tarjeta2);

        cartera.mostrarDinero(cartera);
    }
}
