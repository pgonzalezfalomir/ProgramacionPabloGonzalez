package tema4.POO1;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.formato24 = false;
        reloj.setHora(14);
        reloj.setMinutos(34);
        reloj.setSegundos(44);
        System.out.println(reloj);
    }
}
