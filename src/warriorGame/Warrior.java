package warriorGame;

public abstract class Warrior {
    private int health = 1000;
    private int damage;

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attack(Warrior player2);

    public abstract void takeDamage(Warrior player2);
}
