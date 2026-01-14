package tema4;

public class Hero {
    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;

    public Hero () { // Constructor vacío
        this.name = "Pablo";
        this.level = 20;
        this.health = 100;
        this.maxHealth = 150;
        this.experience = 1000;
        this.attack = 20;
        this.defense = 20;
    }

    public Hero (String name, int level, int health, int maxHealth, int experience, int attack, int defense) { // Constructor con parámetros
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public int drinkPotion() { // Función curación poción
        return (this.health + 10);
    }

    public  int rest() { // Función curación con descanso
        return (this.health + 50);
    }

    public String toString() { // To string información del héroe
        return "Información de héroe:" + " Nombre: " + name + ", Nivel: " + level + ", Vida: " + health + ", Vida Máxima: " + maxHealth + ", Experiencia: " + experience + ", Ataque: " + attack + ", Defensa: " + defense;
    }

    // falta attack(), levelUp(), getters y setters
}
