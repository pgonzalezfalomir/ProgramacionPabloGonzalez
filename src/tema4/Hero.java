package tema4;

public class Hero {

    // Inicialización variables
    static final int curacionPotion = 10;
    static final int curacionRest = 50;
    static final int expGanada = 10;
    static final int expNecesaria = 50;
    static final int subidaVida = 5;
    static final int subidaAtk = 1;
    static final int subidaDef = 1;

    static final int levelDefault = 20;
    static final int healthDefault = 100;
    static final int maxHealthDefault = 150;
    static final int experienceDefault = 1000;
    static final int attackDefault = 20;
    static final int defenseDefault = 20;

    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;

    public Hero () { // Constructor vacío
        this.name = "Pablo";
        this.level = levelDefault;
        this.health = healthDefault;
        this.maxHealth = maxHealthDefault;
        this.experience = experienceDefault;
        this.attack = attackDefault;
        this.defense = defenseDefault;
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
        this.health = this.health + curacionPotion;
        return this.health;
    }

    public int rest() { // Función curación con descanso
        this.health = this.health + curacionRest;
        return this.health;
    }

    public String toString() { // To string información del héroe
        return "Información de héroe:" + " Nombre: " + name + ", Nivel: " + level + ", Vida: " + health + ", Vida Máxima: " + maxHealth + ", Experiencia: " + experience + ", Ataque: " + attack + ", Defensa: " + defense;
    }

    public void ataque(Hero enemigo) { // Procedimiento ataque
        int dano = this.attack - enemigo.defense;

        if (dano < 10) {
            dano = 10;
        }

        enemigo.health = enemigo.health - dano;
        this.experience = this.experience + expGanada;

        if (this.experience >= expNecesaria) {
            this.levelUp();
        }
        System.out.println("Ha hecho " + dano + " de daño.");
    }

    public void levelUp() { // Procedimiento subida de nivel
        this.level = this.level + 1;
        this.health = this.health + subidaVida;
        this.attack = this.attack + subidaAtk;
        this.defense = this.defense + subidaDef;
        this.experience = 0;
    }

    public String getName() { // Getter name
        return name;
    }

    public int getLevel() { // Getter level
        return level;
    }

    public int getHealth() { // Getter health
        return health;
    }

    public int getMaxHealth() { // Getter maxHealth
        return maxHealth;
    }

    public int getExperience() { // Getter getExperience
        return experience;
    }

    public int getAttack() { // Getter getAttack
        return attack;
    }

    public int getDefense() { // Getter getDefense
        return defense;
    }

    public void setName(String name) { // Setter name
        this.name = name;
    }

    public void setLevel(int level) { // Setter level
        this.level = level;
    }

    public void setHealth(int health) {// Setter health
        if (this.health <= 0) {
            this.health = healthDefault;
        } else if (this.health > this.maxHealth) {
            this.health = healthDefault;
        } else {
            this.health = health;
        }
    }

    public void setMaxHealth(int maxHealth) { // Setter maxHealth
        this.maxHealth = maxHealth;
    }

    public void setExperience(int experience) { // Setter experience
        if (this.experience < 0) {
            this.experience = experienceDefault;
        } else {
            this.experience = experience;
        }
    }

    public void setAttack(int attack) { // Setter attack
        if (this.attack <= 0) {
            this.attack = attackDefault;
        } else {
            this.attack = attack;
        }
    }

    public void setDefense(int defense) { // Setter defense
        if (this.defense <= 0) {
            this.defense = defenseDefault;
        } else {
            this.defense = defense;
        }
    }
}
