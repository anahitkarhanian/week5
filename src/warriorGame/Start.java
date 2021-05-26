package warriorGame;

import warriorGame.warrior.Archer;
import warriorGame.warrior.Mage;
import warriorGame.warrior.Swordsman;
import warriorGame.warrior.Warrior;

import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void selectPlayer() {
        System.out.println("Please select a hero number" +
                "\n1. Swordsman\nHealth --- 1000\nDamage --- 100\n" +
                "2. Archer\nHealth --- 1000\nDamage --- 200\n" +
                "3. Mage\nHealth --- 1000\nDamage --- 300");
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
                "\nHealth " + hero2.getHealth() + "\nDamage " + hero2.getDamage());

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

    public static boolean finishGame(Warrior warrior) {
        if (warrior.getHealth() <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void startGame(Warrior player1, Warrior player2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please click Enter to decide who will start");
        scanner.nextLine();

        System.out.println("---YOUR DICE---");
        int player1Start = Dice.getDice();
        System.out.println("---OPPONENT DICE---");
        int player2Start = Dice.getDice();

        while (player1Start == player2Start){
            System.out.println("!!! DICES IS EQUAL");
            System.out.println("Please click Enter to decide who will start");
            scanner.nextLine();
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

        System.out.println("Please click Enter to START game");
        scanner.nextLine();

        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            if (player1Start > player2Start) {
                System.out.println("Click Enter to ATTACK");
                scanner.nextLine();
                if (toAttack(player1,player2,"YOU","YOUR OPPONENT"))
                    break;
                if (toAttack(player2,player1,"YOUR OPPONENT","YOU"))
                    break;
            } else {
                if (toAttack(player2,player1,"YOUR OPPONENT","YOU"))
                    break;
                System.out.println("Click Enter to ATTACK");
                scanner.nextLine();
                if (toAttack(player1,player2,"YOU","YOUR OPPONENT"))
                    break;
            }
        }
    }

    public static boolean toAttack(Warrior player1, Warrior player2,String attacker, String opponent){
        player1.attack(player2);
        System.out.println(attacker + " ATTACKED: " + player1.getName());
        System.out.println(opponent + " TAKE DAMAGE: " + player2.getHealth());
        if (finishGame(player2)) {
            System.out.println("---" + attacker + " WIN---");
            return true;
        }
        return false;
    }
}
