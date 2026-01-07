package objetos;

public class PersonaMain {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        prueba.nombre = "Dani";
        prueba.edad = 8;
        prueba.saludarA("Pablo");
        prueba.presentarme();
        Prueba.showInfo();
    }
}
