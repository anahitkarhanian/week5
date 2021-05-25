package warriorGame;

import java.util.Random;

public class Swordsman extends Warrior{
    public Swordsman() {
        setDamage(100);
    }

    @Override
    public void attack(Warrior player2) {
        System.out.println("the Swordsman hit ");
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(15) + random.nextInt(15);
        setHealth(getHealth() - damage);
        System.out.println("the swordsman take damage " + getHealth());
    }
}
