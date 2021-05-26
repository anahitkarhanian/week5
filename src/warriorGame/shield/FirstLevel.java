package warriorGame.shield;

import warriorGame.warrior.Warrior;

public class FirstLevel extends Shield{
    public void takeDamage(Warrior player1, Warrior player2) {
        int damage = player2.getDamage() * 20 / 100;
        player2.setHealth(player2.getHealth() - damage);
    }
}
