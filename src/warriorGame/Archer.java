package warriorGame;

import java.util.Random;

public class Archer extends Warrior{
    public Archer() {
        setDamage(200);
    }

    @Override
    public void attack(Warrior player2) {
        System.out.println("the archer hit ");
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(15) + random.nextInt(15);
        setHealth(getHealth() - damage);
        System.out.println("the archer take damage " + getHealth());
    }
}
