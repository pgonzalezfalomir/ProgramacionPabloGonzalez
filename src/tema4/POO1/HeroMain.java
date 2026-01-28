package tema4.POO1;

public class HeroMain {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setName("Pablo González");
        h1.setLevel(30);
        h1.setHealth(120);
        h1.setMaxHealth(200);
        h1.setExperience(1500);
        h1.setAttack(50);
        h1.setDefense(50);
        System.out.println(h1.drinkPotion());
        System.out.println("El héroe se ha curado 10 de vida");
        System.out.println(h1.rest());
        System.out.println("El héroe se ha curado 50 de vida");
        h1.levelUp();
        System.out.println(h1.toString());

        Hero enemigo = new Hero();
        enemigo.setName("Enemigo");
        enemigo.setLevel(15);
        enemigo.setHealth(70);
        enemigo.setMaxHealth(90);
        enemigo.setExperience(1200);
        enemigo.setAttack(25);
        enemigo.setDefense(20);
        System.out.println(enemigo.drinkPotion());
        System.out.println("El enemigo se ha curado 10 de vida");
        System.out.println(enemigo.rest());
        System.out.println("El enemigo se ha curado 50 de vida");
        enemigo.levelUp();
        System.out.println(enemigo.toString());

        h1.ataque(enemigo);
        enemigo.ataque(h1);
    }
}