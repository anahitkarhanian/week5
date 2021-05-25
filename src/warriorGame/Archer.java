package warriorGame;

import java.util.Random;

public class Archer extends Warrior{
    public Archer() {
        setDamage(200);
        setName("Archer");
    }

    @Override
    public void attack(Warrior player2) {
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(15) + random.nextInt(15);
        setHealth(getHealth() - damage);
    }
}
