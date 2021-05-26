package warriorGame;


import java.util.Random;

public class Swordsman extends Warrior{
    public Swordsman() {
        setDamage(100);
        setName("Swordsman");
    }

    @Override
    public void attack(Warrior player2) {
        player2.takeDamage(this);
    }

    @Override
    public void takeDamage(Warrior player2) {
        Shield firstLevel = new FirstLevel();
        Random random = new Random();
        int damage = player2.getDamage() - random.nextInt(20) + random.nextInt(20);
        if(random.nextInt(2) == 0) {
            player2.setDamage(damage);
            firstLevel.takeDamage(this, player2);
        } else {
            setHealth(getHealth() - damage);
        }
    }
}
