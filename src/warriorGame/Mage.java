package warriorGame;

import java.util.Random;

public class Mage extends Warrior{
    public Mage() {
        setDamage(300);
    }

    @Override
    public void attack(Warrior player2) {
        System.out.println("the mage hit ");
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(15) + random.nextInt(15);
        setHealth(getHealth() - damage);
        System.out.println("the mage take damage " + getHealth());
    }
}
