package warriorGame;

import java.util.Random;

public class Mage extends Warrior{
    public Mage() {
        setDamage(300);
        setName("Mage");
    }

    @Override
    public void attack(Warrior player2) {
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Shield secondLevel = new SecondLevel();
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(70) + random.nextInt(70);
        if(random.nextInt(2) == 0) {
            player2.setDamage(damage);
            secondLevel.takeDamage(this, player2);
        } else {
            setHealth(getHealth() - damage);
        }
    }
}
