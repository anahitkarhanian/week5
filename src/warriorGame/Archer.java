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
        Shield zeroLevel = new ZeroLevel();
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(40) + random.nextInt(40);
        if(random.nextInt(2) == 0) {
            player2.setDamage(damage);
            zeroLevel.takeDamage(this, player2);
        } else {
            setHealth(getHealth() - damage);
        }
    }

}
