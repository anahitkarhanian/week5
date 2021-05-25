package warriorGame;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void selectPlayer() {
        System.out.println("Please select a hero number" +
                "\n1. Swordsman\nhealth --- 1000\ndamage --- 100\n" +
                "2. Archer\nhealth --- 1000\ndamage --- 200\n" +
                "3. Mage\nhealth --- 1000\ndamage --- 300");
        Scanner scanner = new Scanner(System.in);
        int player1 = scanner.nextInt();

        Random random = new Random();
        int player2 = 1 + random.nextInt(3);
        Warrior hero1;
        Warrior hero2;

        hero1 = getWarrior(player1);

        hero2 = getWarrior(player2);
        System.out.println("You are the " + hero1.getName());
        System.out.println("Your opponent is " + hero2.getName() +
                "\nhealth " + hero2.getHealth() + "\ndamage " + hero2.getDamage());

        startGame(hero1, hero2);
    }

    private static Warrior getWarrior(int player1) {
        Warrior hero1;
        switch (player1) {
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
        return hero1;
    }

    public static boolean theEnd(Warrior warrior) {
        if (warrior.getHealth() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void startGame(Warrior player1, Warrior player2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 1 to decide who will start");
        scanner.nextInt();

        System.out.println("---YOUR DICE---");
        int player1Start = Dice.getDice();
        System.out.println("---OPPONENT DICE---");
        int player2Start = Dice.getDice();

        while (player1Start == player2Start){
            System.out.println("!!! DICES IS EQUAL");
            System.out.println("please enter 1 to decide who will start");
            scanner.nextInt();
            System.out.println("---YOUR DICE---");
            player1Start = Dice.getDice();
            System.out.println("---OPPONENT DICE---");
            player2Start = Dice.getDice();
        }

        if (player1Start > player2Start) {
            System.out.println("---YOU START---");
        } else {
            System.out.println("---START YOUR OPPONENT---");
        }

        System.out.println("Please enter 2 to START game");
        int startGame = scanner.nextInt();

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            if (player1Start > player2Start) {
                if (attack(player1,player2,"YOU","YOUR OPPONENT"))
                    break;
                if (attack(player2,player1,"YOUR OPPONENT","YOU"))
                    break;
            } else {
                if (attack(player2,player1,"YOUR OPPONENT","YOU"))
                    break;
                if (attack(player1,player2,"YOU","YOUR OPPONENT"))
                    break;
            }
        }
    }

    public static boolean attack(Warrior player1, Warrior player2,String attacker, String opponent){
        player1.attack(player2);
        System.out.println(attacker + " ATTACKED: " + player1.getName());
        System.out.println(opponent + " TAKE DAMAGE: " + player2.getHealth());
        if (theEnd(player2)) {
            System.out.println("---" + attacker + " WIN---");
            return true;
        }
        return false;
    }
}
