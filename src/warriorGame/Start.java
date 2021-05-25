package warriorGame;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void selectPlayer(){
        System.out.println("Please select a hero number\n1. Swordsman\nhealth --- 1000\ndamage --- 100\n" +
                "2. Archer\nhealth --- 1000\ndamage --- 200\n3. Mage\nhealth --- 1000\ndamage --- 300");
        Scanner scanner = new Scanner(System.in);
        int player1 = scanner.nextInt();

        Random random = new Random();
        int player2 = 1 + random.nextInt(2);
        Warrior hero1;
        Warrior hero2;

        switch (player1){
            case 1:
                hero1 = new Swordsman();
                break;
            case 2:
                hero1 = new Archer();
                break;
            default:
                hero1 = new Mage();
                break;
        }

        switch (player2){
            case 1:
                hero2 = new Swordsman();
                break;
            case 2:
                hero2 = new Archer();
                break;
            default:
                hero2 = new Mage();
                break;
        }

        startGame(hero1,hero2);
    }

    public static void startGame(Warrior player1, Warrior player2){
        while (player1.getHealth() > 0 && player2.getHealth() > 0){
            player1.attack(player2);
            player2.attack(player1);
        }
    }
}
