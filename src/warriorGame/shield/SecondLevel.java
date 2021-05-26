package warriorGame.shield;

import warriorGame.warrior.Warrior;

public class SecondLevel extends Shield {
    public void takeDamage(Warrior player1, Warrior player2){
        int damage = player2.getDamage() * 10 / 100;
        player2.setHealth(player2.getHealth() - damage);
    }
}
