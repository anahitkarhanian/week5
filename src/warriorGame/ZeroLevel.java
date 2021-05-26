package warriorGame;


public class ZeroLevel extends Shield{
    public void takeDamage(Warrior player1, Warrior player2){
        int damage = player2.getDamage() * 10 / 100;
        player1.setHealth(player1.getHealth() - damage);
    }
}
