package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }


    public void takeDamage(Champion other) {
        int damage = other.getAttack() - armor;

        if (damage < 1) {
            damage = 1;
        }

        life -= damage;

        if (life < 0) {
            life = 0;
        }
    }


    public String status() {
        if (life == 0) {
            return name + ": " + life + " de vida (morreu)";
        } else {
            return name + ": " + life + " de vida";
        }
    }
}
